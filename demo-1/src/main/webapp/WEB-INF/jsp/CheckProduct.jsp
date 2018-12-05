<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>물품 확인창</title>
</head>
<body>
	<table>
		<thead>
			<th>Name  </th>
			<th>Itemcode  </th>
			<th>Unit   </th>
			<th>Cost   </th>
		</thead>
		<c:forEach items="${items}" var="item">
			<tbody>
				<tr>
					<td>${item.TName}</td>
					<td>${item.itemcode}</td>
					<td>${item.unit}</td>
					<td>${item.cost}</td>
				</tr>
			</tbody>
		</c:forEach>
	</table>
	<input type="button" value="돌아가기" onclick="location.href='main.do'">
</body>
</html>