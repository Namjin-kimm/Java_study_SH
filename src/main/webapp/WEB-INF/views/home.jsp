<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>	Login Page  </h1>
<c:if test="${empty sessionScope.member}">
<a href="./member/login.iu">로그인</a>
<a href="./member/join.iu">join</a><br>
</c:if>

<c:if test="${not empty sessionScope.member}">
<h3>${sessionScope.member.name }</h3>
<a href="./member/logout.iu">Logout</a><br>

<a href="./member/search.iu">search</a>
<a href="./bankbook/add.iu">product add </a>
<a href="./bankbook/list.iu">list</a>
</c:if>
</body>
</html>
