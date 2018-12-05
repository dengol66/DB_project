<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>로그인</title>
</head>
<body>
	<h2> 로그인</h2>
	<form method="post" action="/main.do">
		아 이 디 : <input type="text" name="id"> <br>
		비밀번호 : <input type="text" name="password"> <br>
		
		<input type="submit" value="로그인">
		<input type="button" value="회원가입" onclick="location.href='/join'"/>
	</form>
</body>
</html>