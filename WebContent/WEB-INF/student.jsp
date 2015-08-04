<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="/WEB-INF/index.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Management</title>
</head>
<body>
<h1>Students Data</h1>
<form:form action="student.do" method="POST" commandName="student">
	<table>
		<tr>
			<td>Student ID</td>
			<td><form:input path="stdId" /></td>
		</tr>
		<tr>
			<td>Student Name</td>
			<td><form:input path="stdName" /></td>
		</tr>
		<tr>
			<td>Date of Birth</td>
			<td><form:input path="stdDob" /></td>
		</tr>
		<tr>
			<td>Year Level</td>
			<td><form:input path="stdStandard" /></td>
		</tr>
		<tr>
			<td>GPA</td>
			<td><form:input path="stdGpa" /></td>
		<tr>
		<tr>
			<td>Phone Number</td>
			<td><form:input path="stdPhno" /></td>
		<tr>
		<tr>
			<td>EMail Id</td>
			<td><form:input path="stdEmailid" /></td>
		<tr>
		
			<td colspan="2">
				<input type="submit" name="action" value="Add" />
				<input type="submit" name="action" value="Edit" />
				<input type="submit" name="action" value="Delete" />
				<input type="submit" name="action" value="Search" />
			</td>
		</tr>
	</table>
</form:form>
<br>
<table border="1">
	<th>Student ID</th>
	<th>Student Name</th>
	<th>Date of Birth</th>
	<th>Year level</th>
	<th>GPA</th>
	<th>Phone Number</th>
	<th>EMail Id</th>
	<c:forEach items="${studentList}" var="student">
		<tr>
			<td>${student.stdId}</td>
			<td>${student.stdName}</td>
			<td>${student.stdDob}</td>
			<td>${student.stdStandard}</td>
			<td>${student.stdGpa}</td>
			<td>${student.stdPhno}</td>
			<td>${student.stdEmailid}</td>
			
		</tr>
	</c:forEach>
</table>
</body>
</html>