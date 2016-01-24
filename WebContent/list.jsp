<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<table  width="80%"  align="center"   style="background-color: window;border: 1px black solid;">
	<tr>
		<td>id</td>
		<td>姓名</td>
		<td>密码</td>
		<td>邮件</td>
		<td>qq</td>
	</tr>
	<c:forEach items="${users}"  var="user">
		<tr>
			<td>${user.id }</td>
			<td>${user.username }</td>
			<td>${user.pwd}</td>
			<td>${user.email}</td>
			<td>${user.qq}</td>
			<td><a href="deluser?userid=${user.id}">删除</a></td>
		</tr>
	</c:forEach>
	测试
</table>
</body>
</html>