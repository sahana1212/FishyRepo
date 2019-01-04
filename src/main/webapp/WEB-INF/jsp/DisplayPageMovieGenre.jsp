<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<h1>display movies</h1>
<form:form method="GET" action="displaymoviegenre">
<table>
<tr>
<td>Id:<td>

<td><form:input path="genre.gid"/></td>
</tr>

<tr>
<td><input type="submit" value="Submit"/></td>
</tr>
</table>
</form:form>