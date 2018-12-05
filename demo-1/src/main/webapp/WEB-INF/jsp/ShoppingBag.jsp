<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>장바구니</title>
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
	
		<input type="button" value="구매하기" onclick="location.href='/main.do'"> <!-- 구매하기 주소 틀림 -->
		<input type="button" value="돌아가기" onclick="location.href='/main.do'"> <!-- 돌아가기 주소 틀림-->
		<input type="button" value="과거 구매내역 확인" onclick="location.href='/main.do'"> <!-- 구매내역확인 주소 틀림 -->
	</form>
</body>
</html>