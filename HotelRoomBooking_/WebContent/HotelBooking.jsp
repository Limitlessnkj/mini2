<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<title>Hotel Booking Form</title>
<style type="text/css">
table {
	border-collapse: collapse;
}

th, td {
	padding: 8px;
	text-align: left;
	border-bottom: 1px solid #ddd;
}

tr:hover {
	background-color: green;
}
</style>
</head>

<body style="background-color: #39CCCC">
	<h3 align="center">
		<b>Hotel Booking<b></b>
	</h3>
	<form:form action="bookHotel.obj" modelAttribute="bookingDetail">
		<table border="1" align="center" bgcolor="#f2f2f2">
			<tr>
				<td>Hotel Id</td>
				<td><form:input path="hotelId" value="${hotel.id}"
						readonly="true" /></td>
			</tr>
			<tr>
				<td>Hotel Name</td>
				<td><input value="${hotel.name}" readonly></td>
			</tr>
			<tr>
				<td>Customer Name</td>
				<td><form:input path="custName" /> <form:errors
						path="custName" /></td>
			</tr>
			<tr>
				<td>From Date</td>
				<td><form:input type="date" path="fromDate" required="true" />
					<form:errors path="fromDate" /></td>
			</tr>
			<tr>
				<td>To Date</td>
				<td><form:input type="date" path="toDate" required="true" />
					<form:errors path="toDate" /></td>
			</tr>
			<tr>
				<td>No of Rooms</td>
				<td><form:input type="number" path="noOfRooms" />
					<form:errors path="noOfRooms" /></td>
			</tr>
			<tr>
				<td><input type="reset" value="Clear"></td>
				<td><input type="submit" value="Book Now" /></td>
			</tr>
		</table>
	</form:form>

</body>
</html>


