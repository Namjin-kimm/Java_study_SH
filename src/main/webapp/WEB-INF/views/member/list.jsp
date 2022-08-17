<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>BankMember List</h1>
	<table border="1">
		<thead>
			<tr>
				<th>UserName</th><th>name</th><th>email</th><th>phone</th>
			</tr>
		</thead>
	<tbody>
			<c:forEach items="${requestScope.list}" var="dto">
			<tr>
				<td>${pageScope.dto.userName}</td>
				<td>${pageScope.dto.name}</td>
				<td>${pageScope.dto.email}</td>
				<td>${pageScope.dto.phone}</td>
			
			
			</tr>
		</c:forEach>

</body>
</html>