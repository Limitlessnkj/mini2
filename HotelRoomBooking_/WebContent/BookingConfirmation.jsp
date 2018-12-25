<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
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
	background-color: aqua;
}
</style>
</head>
<body>

<h1><b>Booking Details:</b></h1>

<p>Hello <strong><c:out value="${details.custName}" /></strong> following are your booking details:</p>
<br>
<br>Booking Id: <c:out value="${details.id}" />
<br>Hotel Name: <c:out value="${hotel.name}" />
<br>No of Rooms: <c:out value="${details.noOfRooms}" />
<br>Amount: <c:out value="${hotel.rate}" />
<br><br>
<a href="homePage.obj">Home Page</a>
</body>
</html>