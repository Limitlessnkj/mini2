<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home Page</title>
<style type="text/css">
/* The animation code */
@keyframes example {
  0%   {background-color: aqua;}
  25%  {background-color: yellow;}
  50%  {background-color: #C0C0C0;}
  100% {background-color: #808080;}
}

/* The element to apply the animation to */
fieldset {
	
	background-color: red;
	animation-name: example;
	animation-duration: 40s;
}
a:hover {
	background-color: #C0C0C0;
}
</style>
</head>
<body align="center" style="background-color: #39CCCC">
	<fieldset>
		<h1 style="color: blue;">
			<strong>Welcome!!</strong>
		</h1>
		<br> <a href="selectHotel.obj">Click here to Select Hotel</a><br>
	</fieldset>
</body>
</html>