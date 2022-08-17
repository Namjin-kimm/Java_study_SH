<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>BankBook List</h1>
	
	<table border="1">
		<thead>
			<tr>
				<th>Name</th><th>Rate</th><th>Sale</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td><a href="detail?bookNum=${list.bookNum}"${list.bookName}></a></td>
				<td>${list.bookRate}</td>
				<td>${list.bookSale}</td>
			</tr>
		</tbody>
	</table>

</body>
</html>