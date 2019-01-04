<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<h1>Update movie</h1>
<form:form method="POST" action="updatemovie">
<table>
<tr>
<td>Id:<td>

<td><form:input path="mid"/></td>
</tr>

<tr>
<td>Boxoffice:<td>

<td><form:input path="boxoffice"/></td>
</tr>

<tr>
<td><input type="submit" value="Add"/></td>
</tr>
</table>
</form:form>