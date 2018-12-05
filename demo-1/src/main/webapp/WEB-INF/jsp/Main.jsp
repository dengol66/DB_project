<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript">
	function checkcategory(){
		if(!document.checkproduct.bigCat.value || !document.checkproduct.midCat.value || ! document.checkproduct.smaCat.value){
			alert("choice category");
			return false;
		}
	}
	function onchangemid(){
		if(document.checkproduct.midCat.value == "부품상자/공구함"){
			document.getElementById('a').style.display = 'block';
			document.getElementById('b').style.display = 'block';
			document.getElementById('c').style.display = 'block';
			document.getElementById('d').style.display = 'none';
			document.getElementById('e').style.display = 'none';
			document.getElementById('f').style.display = 'none';
		}
		else if(document.checkproduct.midCat.value == "사다리/운반구"){
			document.getElementById('a').style.display = 'none';
			document.getElementById('b').style.display = 'none';
			document.getElementById('c').style.display = 'none';
			document.getElementById('d').style.display = 'block';
			document.getElementById('e').style.display = 'block';
			document.getElementById('f').style.display = 'block';
		}
	}
</script>
<title>카테고리 선택창</title>
</head>
<body>
	<h2>Hello! ${FName} ${LName}</h2>
	<form method="post" action="/updatecustomer.do">
		<input type="submit" value="UPDATE INFORMATION">
	</form>
	
	<form method="post" action="/CheckProduct.do" name="checkproduct" onsubmit="return checkcategory()">
		카테고리를 선택해주세요. <br>
		카테고리(대)
		<select name="bigCat">
			<option value ="">대</option>
			<option value = "철물, 원예, 사무용품">철물, 원예, 사무용품</option>
		</select>
		카테고리(중)
		<select name="midCat" onchange="onchangemid()">
			<option value ="">중</option>
			<option value = "부품상자/공구함">부품상자/공구함</option>
			<option value = "사다리/운반구">사다리/운반구</option>
		</select>
		카테고리(소)
		<select name="smaCat">
			<option value ="">소</option>	
			<option value = "공구집" id = a>공구집</option>
			<option value = "공구함" id = b>공구함</option>
			<option value = "부품상자" id = c>부품상자</option>
			<option value = "사다리" id = d>사다리</option>
			<option value = "캐스터" id = e>캐스터</option>
			<option value = "핸드/테크트럭" id = f>핸드/테크트럭</option>
		</select>
		<input type="submit" value="확인">
		<input type="button" value="장바구니 가기" onclick="location.href='/shoppingbag.do'">
	</form>
</body>
</html>