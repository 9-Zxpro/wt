<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Express Bus Reservation System</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<link rel="stylesheet" href="assets/css/main.css" type="text/css" />
<link rel="stylesheet" href="assets/css/dashboardStyle.css" type="text/css" />
<link rel="shortcut icon" href="assets/img/favicon.ico"/>

<!-- javascript links -->
<!-- <script type="text/javascript" src="assets/calendar/tcal.js"></script>
<script type="text/javascript" src="assets/bootstrap/js/bootstrap.js"></script>
<script src="assets/js/jquery.min.js" type="text/javascript"></script>
<script src="assets/js/liquidmetal.js" type="text/javascript"></script>
<script src="assets/js/query.flexselect.js" type="text/javascript"></script>
<script type="text/javascript" src="assets/calendar/tcal.js"></script> -->
<script>
	$(function() {
		var elements = $("input[type!='submit'], textarea, select");
		elements.focus(function() {
			$(this).parents('li').addClass('highlight');
		});
		elements.blur(function() {
			$(this).parents('li').removeClass('highlight');
		});
		$("#forgotpassword").click(function() {
			$("#password").removeClass("required");
			$("#login").submit();
			$("#password").addClass("required");
			return false;
		});
		$("#login").validate()
	});
</script>


<style>
.myheader {
	height: 100px;
	font-size: 32px;
	background-color: rgba(65, 65, 65);
	text-transform: uppercase;
	text-align: center;
	margin-bottom: 10px;
	padding-top: 25px;
	color:#FFF;
}
.container-fluid{
    overflow:hidden;
}

</style>
</head>
<body>
<div class="container-fluid">
		<div class="myheader">
			GCET BUS RESERVATION SYSTEM
		</div>
</div>


