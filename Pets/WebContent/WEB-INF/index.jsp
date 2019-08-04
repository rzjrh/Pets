<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Index</title>

</head>
<body>

<h1>Dog Class</h1>
<form action="/Pets/Dogs" method="post">
	Name: <input type="text" name="name"><br>
	Breed: <input type="text" name="breed"><br>
	Weight (lb): <input type="number" name="weight"><br>
	<input type="submit">
</form>


<h1>Cat Class</h1>
<form action="/Pets/Cats" method="post">
	Name: <input type="text" name="name"><br>
	Breed: <input type="text" name="breed"><br>
	Weight (lb): <input type="number" name="weight"><br>
	<input type="submit">
</form>



</body>
</html>