<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 


<html>
<body>
<table border=1>

<c:forEach var="actor" items="${list}">
<tr>
<td>${actor.aid}</td>
<td>${actor.age}</td>
<td>${actor.aname}</td>
<td>${actor.gender}</td>
</tr>
</c:forEach>
</table>
</body>
</html>