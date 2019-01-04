<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<h1>Add Genre</h1>
<form:form method="POST" action="addgenre">
<table>
<tr>
<td>id:<td>

<td> <form:input path="gid"/></td>
</tr>
<tr>
<td>Name:<td>

<td><form:input path="name"/></td>
</tr>

<tr>
<td><input type="submit" value="Add"/></td>
</tr>



</table>
</form:form>
