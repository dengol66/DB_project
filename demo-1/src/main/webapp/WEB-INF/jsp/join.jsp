<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko">
<head>
	<title>join</title>
	<script type="text/javascript">
		function checkValue()
		{
			if(!document.userInfo.id.value){
				alert("input your ID");
				return false;
			}
			if(!document.userInfo.password.value)
			{
				alert("input your Password");
				return false;
			}
			if(document.userInfo.password.value != document.userInfo.passwordcheck.value)
			{
				alert("please put same password");
				return false;
			}
		}
	</script>
</head>
<body>
	<div id ="wrap">
		<br><br>
		<b><font size="6" color="gray"> JOIN </font></b>
		<br><br><br>
		<form method="post" action="/join.do" name="userInfo" onsubmit="return checkValue()">
			<table>
				<tr>
					<td id="title"> ID </td>
					<td>
						<input type="text" name="id" maxlength="50">
						<input type="button" value="check ID">
					</td>
				</tr>
				<tr>
					<td id="title"> Password </td>
					<td>
						<input type="password" name="password" maxlength="50">
					</td>
				</tr>
				<tr>
					<td id="title"> Check Password </td>
					<td>
						<input type="password" name="passwordcheck" maxlength="50">
					</td>
				</tr>
				<tr>
					<td id="title"> Fname </td>
					<td>
						<input type="text" name="FName" maxlength="50">
					</td>
				</tr>
				<tr>
					<td id="title"> Lname </td>
					<td>
						<input type="text" name="LName" maxlength="50">
					</td>
				</tr>
				<tr>
					<td id="title"> PhoneNumber </td>
					<td>
						<input type="text" name="PhoneNumber" maxlength="50">
					</td>
				</tr>	
				<tr>
					<td id="title"> Age </td>
					<td>
						<input type="text" name="Age" maxlength="50">
					</td>
				</tr>
				<tr>
					<td id="title"> Sex </td>
					<td>
						<input type="radio" name="gender" value="F" checked>Female
						<input type="radio" name="gender" value="M" checked>Male
					</td>
				</tr>				
				<tr>
					<td id="title"> Works </td>
					<td>
						<input type="text" name="Works" maxlength="50">
					</td>
				</tr>
				<tr>
					<td id="title"> Ttype </td>
					<td>
						<select name="Ttype">
							<option value="">choice</option>
							<option value="retailer">retailer</option>
							<option value="seller">seller</option>
							<option value="consumer">consumer</option>
						</select>
					</td>
				</tr>
				</table>
				<br>
				<input type="submit" value="Join"/> <input type="button" value="Cancel">
			</form>
		</div>	
</body>
</html>