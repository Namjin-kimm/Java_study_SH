<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>update Page</h1>
	
	<form action="update" method="post">
		<div>
			<input type="hidden" value="${detail.bookNum}" name="bookNum" readonly="readonly">
		</div>
		
		<div></div>
	</form>

</body>
</html>