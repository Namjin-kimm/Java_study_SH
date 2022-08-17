<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>BankBook Detail Page</h1>
	<table border="1">
		<thead>
			<tr>
				<th>bookNum</th><th>bookName</th><th>bookRate</th><th>bookSale</th>
			</tr>
		</thead>
		
		<tbody>
			<tr>
				<td>${detail.bookNum}</td>
				<td>${detail.bookName}</td>
				<td>${detail.bookRate}</td>
				<td>${detail.bookSale}</td>
			</tr>
		</tbody>
	</table>
	
	<a href="update?bookNum=${detail.bookNum}">수정</a>
	<a href="delete?bookNum=${detail.bookNum}">삭제</a>
	
	<c:if test="${not empty sessionScope.member}">
		<a href="../bankAccount/add.iu?bookNum=${detail.bookNum}">가입</a>
	</c:if>
	

</body>
</html>