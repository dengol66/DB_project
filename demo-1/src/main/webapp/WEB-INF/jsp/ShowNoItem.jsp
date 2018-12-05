<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%
	out.println("<table border=\"1\">");
		for (int i = 1; i <= 5; i++){
			out.println("<th>" + i + "</th>"); // 칼럼명
		}
		for (int i =1; i <= 5; i++){
			out.println("<tr>");
			out.println("<td>" + "itemName" + "</td>"); // itemName
			out.println("<td>" + "brandName" + "</td>"); // brandName -> brandID로 찾아와야됨
			out.println("<td>" + "itemCode" + "</td>"); // itemCode
			out.println("<td>" + "amount" + "</td>"); // amount
			out.println("<td>" + "cost" + "</td>"); // cost
			out.println("</tr>");
		}
		out.println("</table>");
	%>
	<input type="button" value="돌아가기" onclick="location.href='MainMaster.do'">
</body>
</html>