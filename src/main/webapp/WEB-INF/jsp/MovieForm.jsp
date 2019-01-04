<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<h1>Add movie</h1>
<form:form method="POST" action="addmovie">
<table>
<tr>
<td>MID:<td>

<td><form:input path="mid"/></td>
</tr>
<tr>
<td>Actors:<td>

<td><form:input path="actors"/></td>
</tr>

<tr>
<td> boxoffice:</td>
<td><form:input path="boxoffice"/></td></tr>

<tr>
<td>Name:<td>

<td><form:input path="mname"/></td>
</tr>


<tr>
<td>Type:<td>

<td><form:input path="type"/></td>
</tr>


<tr>
<td> Genre</td>
<td><form:input path="genre"/></td></tr>
<tr>
<td><input type="submit" value="Add"/></td>
</tr>

</table>
</form:form>