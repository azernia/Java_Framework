<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<th>编号</th>
			<th>姓名</th>
			<th>年龄</th>
		</tr>
		<c:forEach items="${PageInfo.list }" var="info">
			<tr>
				<td>${info.id }</td>
				<td>${info.pname }</td>
				<td>${info.age }</td>
			</tr>
		</c:forEach>
	</table>
	<a href="show?pageNumber=${PageInfo.pageNum-1 }&pageSize=${pageInfo.pageSize}" <c:if test="${PageInfo.pageNum<=1 }">  onclick="javascript:return false;" </c:if> >上一页</a>
	<b>${PageInfo.pageNum } / ${PageInfo.total }</b>
	<a href="show?pageNumber=${PageInfo.pageNum+1 }&pageSize=${pageInfo.pageSize}" <c:if test="${PageInfo.pageNum>=PageInfo.total }">  onclick="javascript:return false;" </c:if> >下一页</a>
</body>
</html>