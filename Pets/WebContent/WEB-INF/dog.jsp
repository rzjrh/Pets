<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
   <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
    
    
<!DOCTYPE html>
<html>

<head>

<meta charset="ISO-8859-1">
<title>Dogs</title>
</head>


<body>

<p>You created a <c:out value="${dog.breed}"/>!</p>
	<c:out value="${dog.showAffection()}"/>
	
	
</body>
</html>