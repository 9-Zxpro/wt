package com.gcetminiwebproject.models;


import com.gcetminiwebproject.utility.DBConnectivity;
import com.gcetminiwebproject.utility.IDGenerator;

public class BusFrequencyModel {
	private String frequencyID;
	private String busID;
	private String frequencyDay;
	int rowsUpdatedtemp;

	public void setBusID(String busID) {
		this.busID = busID;
	}

	public void setFrequencyDay(String frequencyDay) {
		this.frequencyDay = frequencyDay;
	}

	public boolean addBusForDay() {
		IDGenerator idg = new IDGenerator();
		
		char temp;
		int rowsUpdated = 0;
		int i;
		String query = "";
		for (i = 0; i < frequencyDay.length(); i++) {
			DBConnectivity dbc = new DBConnectivity();
			this.frequencyID = idg.generateId("FrequencyId", "busfrequency");
			
			temp = frequencyDay.charAt(i);
			String day="";
			switch (temp) {
				case 'S': {
					day="Sunday";
					break;
				}
				case 'M': {
					day="Monday";
					break;
				}
				case 'T': {
					day="Tuesday";
					break;
				}
				case 'W': {
					day="Wednesday";
					break;
				}
				case 'H': {
					day="Thursday";
					break;
				}
				case 'F': {
					day="Friday";
					break;
				}
				case 'A': {
					day="Saturday";
					break;
				}	
				default:
					day="error";
			}			
		query = "insert into busfrequency values ('"+this.frequencyID+"', '"+busID+"', '"+day+"');";
			try {
				rowsUpdatedtemp = dbc.fireExecuteUpdate(query);
				rowsUpdated = rowsUpdated + rowsUpdatedtemp;
				dbc.close();
	
			} catch (Exception e) {
				System.out.println("Exception:" + e.getMessage());
			}
			
		}
		
		if (rowsUpdated > 0) {
			
			return true;
		} else {
			return false;
		}

	}

	
	  public boolean modifyBusForDay() 
	  { 
		  DBConnectivity dbc = new DBConnectivity();
		  
		   boolean result; 
		  String query = "delete from busfrequency where busID ='"+this.busID+"'";
		  
		  try
		  {
			  dbc.fireExecuteUpdate(query);
		  }
		  catch(Exception e)
		  {
			  System.out.println(e.getMessage());
		  }
		  
		  result=addBusForDay();
		  
		  return result;
	  
	  	  	 
}


public boolean DeleteBusForDay()
		{
			DBConnectivity dbc=new DBConnectivity();
			String query="delete from busfrequency where BusId='"+this.busID+"'";
			int rowsUpdated=dbc.fireExecuteUpdate(query);
			dbc.close();
			if(rowsUpdated > 0)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
}
