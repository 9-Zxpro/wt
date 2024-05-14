package com.gcetminiwebproject.models;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.gcetminiwebproject.utility.DBConnectivity;
import com.gcetminiwebproject.utility.IDGenerator;
import com.gcetminiwebproject.utility.SessionManager;
import java.util.ArrayList;
import java.util.List;

public class BookingModel {

    private String bookingID;
    private String userID;
    private String busID;
    private String departureDate;
    private String departureTime;
    private String noOfSeats;

    public void setBookingID(String bookingID) {
        this.bookingID = bookingID;
    }

    public void setBusID(String string) {
        this.busID = string;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }

    public String insertNewGuestBooking(String noOfSeats1) throws SQLException {
    	DBConnectivity dbc = new DBConnectivity();
        // generate Unique id for booking from IDGenerator
        IDGenerator generate = new IDGenerator();
        this.bookingID = generate.generateId("BookingId", "booking");

		/*
		 * String query = "select departureTime from bus where BusId = '" + this.busID +
		 * "'";
		 */
        
        // store the booking details into the database
        String query1 = "insert into booking values('" + this.bookingID + "','"
                + this.userID + "','" + this.busID + "','" + this.departureDate
                + "','" + this.departureTime + "');";

        dbc.fireExecuteUpdate(query1);
        dbc.close();
        /**
         * ******* Seat Allocation and payment by  ***********
         */
        this.noOfSeats = noOfSeats1;
        IDGenerator idg = new IDGenerator();
        int i = 0;
        int remainingSeats = 0;
        String query5 = "select (TotalSeats-bookedSeats) as remainingSeat,bookedSeats,TotalSeats from (select count(*) as bookedSeats from seatallocation natural join booking where busid='" + this.busID + "' and departureDate='" + this.departureDate + "')t1 inner join (select TotalSeats from bus where busid='"
                + this.busID + "')t2";

        DBConnectivity dbc6 = new DBConnectivity();
        ResultSet rs123 = dbc6.fireExecuteQuery(query5);
        while (rs123.next()) {
            remainingSeats = rs123.getInt(1);
        }
        dbc6.close();

        int numRows = 0;
        if ((remainingSeats - Integer.parseInt(noOfSeats)) >= 0) {
        	DBConnectivity dbc8 = new DBConnectivity();
            numRows = dbc8.fireExecuteUpdate(query1);
            dbc8.close();
            for (i = 0; i < Integer.parseInt(noOfSeats); i++) {

                String seatID = idg.generateId("SeatID", "seatallocation");
                String query2 = "insert into seatallocation values('" + seatID
                        + "','" + this.bookingID + "',default,'" + this.busID
                        + "');";
                DBConnectivity dbc1 = new DBConnectivity();
                dbc1.fireExecuteUpdate(query2);
                dbc1.close();
            }
            
            dbc8.close();
        }
        /**
         * *******************************************
         */
        return this.bookingID;
    }

    public int deleteBookingUser() {
        String query = "delete from booking where userID='" + this.userID
                + "' and bookingID ='" + this.bookingID + "';";

        DBConnectivity dbc = new DBConnectivity();
        int numRows = dbc.fireExecuteUpdate(query);
        dbc.close();

        return numRows;
    }

    public int deleteBookingGuest() {
        String query = "delete from booking where userID='" + this.userID
                + "' and bookingID ='" + this.bookingID + "';";

        DBConnectivity dbc = new DBConnectivity();
        int numRows = dbc.fireExecuteUpdate(query);
        dbc.close();

        return numRows;
    }

    public ResultSet viewBusBooking(String operator) {
    	DBConnectivity dbc = new DBConnectivity();
        ResultSet rs = null;
        String id = SessionManager.userID;
        String query = " select count(*) as noOfBookedSeats,busid,departureDate,"
                + "departuretime from seatallocation natural join booking "
                + " where busid='"
                + this.busID
                + "' "
                + " order by departuredate;";

        rs = dbc.fireExecuteQuery(query);
        try {
            return rs;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        dbc.close();
        return rs;
    }

    public void setNoOfSeats(String noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

    public String getNoOfSeats() {
        return noOfSeats;
    }

    public ResultSet getBookingInfo(String type, String busOpID) {
    	DBConnectivity dbc = new DBConnectivity();
        ResultSet rs = null;
        String query = "";
        if (type.equalsIgnoreCase("busOperator")) {
            query = "select bookingid,busid,userid,"
                    + "departuredate,departuretime, count(seatid) as numOfSeats"
                    + " from booking natural join seatallocation "
                    + " where busid in (select busid from bus where operatorid='"
                    + busOpID + "')" + " group by bookingid having bookingid='"
                    + this.bookingID + "' " + "; ";
        } else {
            query = "select bookingid,busid,userid,"
                    + "departuredate,departuretime, count(seatid) as numOfSeats"
                    + " from booking natural join seatallocation "
                    + " where userid ='" + this.userID + "' "
                    + " group by bookingid having bookingid='" + this.bookingID
                    + "' " + "; ";
        }

        rs = dbc.fireExecuteQuery(query);

        return rs;
    }

    public String getBookingIDByEmail() throws SQLException {
    	DBConnectivity dbc = new DBConnectivity();
        ResultSet rs = null;
        String query = "";
        String bookingId = "";

        query = "select bookingid from booking where userid ='" + this.userID + "'; ";

        System.out.println("paran" + this.userID);
        rs = dbc.fireExecuteQuery(query);
        while (rs.next()) {
            bookingId = rs.getString(1);
        }

        return bookingId;
    }

    public List<String> getSeatTotalAndSeatPrice() {
        List<String> li = new ArrayList<>();
        String busNo = "";
        DBConnectivity dbc = new DBConnectivity();
        ResultSet rs = null;
        String query = "";

        query = "select busid,"
                + "count(seatid) as numOfSeats"
                + " from booking natural join seatallocation "
                + " where userid ='" + this.userID + "' "
                + " group by bookingid having bookingid='" + this.bookingID
                + "' " + "; ";

        rs = dbc.fireExecuteQuery(query);

        try {
            while (rs.next()) {
                busNo = rs.getString(1);
                System.out.println(busNo);
                System.out.println(rs.getString(2));
                li.add(rs.getString(2));

                //again query for cost
                query = "select cost"
                        + " from bus "
                        + " where busid ='" + busNo + "' " + "; ";

                rs = dbc.fireExecuteQuery(query);
                while (rs.next()) {
                    System.out.println(rs.getString(1));
                    li.add(rs.getString(1));
                }

            }

        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(BookingModel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        return li;
    }

    public String savePayment(String busNoAndUser)  {
        // payment
        IDGenerator idg = new IDGenerator();
        ResultSet rs1 = null;
        DBConnectivity dbc1 = new DBConnectivity();
        String query4 = "select * from bus where busid='" + this.busID
                + "';";
        rs1 = dbc1.fireExecuteQuery(query4);

        int amount = 0;
        String operatorID = "";
        try {
            while (rs1.next()) {
                amount = rs1.getInt(8);
                operatorID = rs1.getString(9);
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        String status ="PAID";
        System.out.println("check seat No "+noOfSeats);
        amount = amount * Integer.parseInt(noOfSeats);
        String paymentID = idg.createTicketNumber(busNoAndUser);
        
        String query3 = "insert into payment values('" + paymentID + "','"
                + this.bookingID + "'," + amount + ",default,'"
                + operatorID + "'," + noOfSeats + ",'"+status+"'"+");";
        DBConnectivity dbc2 = new DBConnectivity();
        dbc2.fireExecuteUpdate(query3);
        dbc2.close();
        return  paymentID;
    }

}

