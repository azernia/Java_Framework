<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
<style type="text/css">
	a {
		color:black;
		text-decoration: none;
	}
	a:hover {
		color:red;
	}
</style>
</head>
<body>
	<table border="1">
	<tr>
			<th>花卉编号</th>
			<th>花卉名称</th>
			<th>花卉价格(元)</th>
			<th>花卉原产地</th>
		</tr>
		<c:forEach items="${list }" var="flower">
			<tr>
				<td>${flower.id }</td>
				<td>${flower.fname }</td>
				<td>${flower.price }</td>
				<td>${flower.production }</td>
			</tr>
		</c:forEach>
	</table>
	<a href="add.jsp">添加花卉信息</a>
</body>
</html>