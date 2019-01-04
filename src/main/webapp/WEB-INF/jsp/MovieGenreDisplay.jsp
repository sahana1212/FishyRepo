<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 


<html>
<body>
<table border=1>

<c:forEach var="movie" items="${list}">
<tr>
<td>${movie.mid}</td>
<td>${movie.actors}</td>
<td>${movie.boxoffice}</td>
<td>${movie.mname}</td>
<td>${movie.type}</td>
<td>${movie.genre.gid}</td>
</tr>
</c:forEach>
</table>
</body>
</html>