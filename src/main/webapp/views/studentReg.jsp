<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form action="savedata" modelAttribute="student" method="POST">
	<table>
		<tr>
			<td>Name </td>
			<td><form:input path="Name" /></td>
		</tr>
		
		
		<tr>
			<td>Email </td>
			<td><form:input path="Email" /></td>
		</tr>
		
		<tr>
			<td>Phno </td>
			<td><form:input path="Phno" /></td>
		</tr>
		
		<tr>
			<td>Gender </td>
			<td><form:radiobuttons path="Gender" items="${gender}" ></form:radiobuttons></td>
		</tr>
		
		<tr>
			<td>Course </td>
			<td><form:select path="Course" items="${course}" /></td>
		</tr>
		
		<tr>
			<td>Timing </td>
			<td><form:checkboxes path="Timings" items="${timing}" ></form:checkboxes></td>
		</tr>
		
	<tr>
	<td></td>
	<td><input type="submit" value="Register"/></td>
	</tr>
	</table>
	</form:form>
</body>
</html>