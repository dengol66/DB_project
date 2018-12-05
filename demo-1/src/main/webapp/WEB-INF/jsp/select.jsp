<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Hello Millky</title>
</head>
<body>
	<h2>Hello! ${name}</h2>
	<div>JSP version</div>
	<table>
		<thead>
			<th>number</th>
			<th>Fname</th>
			<th>Lname</th>
		</thead>
		<c:forEach items="${customers}" var="cus">
			<tbody>
				<tr>
					<td>${cus.customercode}</td>
					<td>${cus.FName}</td>
					<td>${cus.LName}</td>
				</tr>
			</tbody>
		</c:forEach>
	</table>
</body>
</html>