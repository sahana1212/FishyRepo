<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<h1>Add actor</h1>
<form:form method="POST" action="addactor">
<table>
<tr>
<td>Id:<td>

<td><form:input path="aid"/></td>
</tr>

<tr>
<td>Age:<td>

<td><form:input path="age"/></td>
</tr>

<tr>
<td>Name:<td>

<td><form:input path="aname"/></td>
</tr>
<tr>
<td>Gender:<td>

<td><form:input path="gender"/></td>
</tr>
<tr>
<td><input type="submit" value="Add"/></td>
</tr>

</table>
</form:form>