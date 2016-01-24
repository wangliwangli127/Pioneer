<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<style>
	input{
	background-color: window;
	border: 1px black solid;
	
	}

</style>
<body>
测试<br/>
<div	style="border:1px gray solid;">
	<form action='register' method='post'>
		<div>
			<label>id</label>
			<div><input type="text" name="id" value=''></div>
		</div>
		<div>
			<label>username</label>
			<div><input type="text" name="username" value=''></div>
		</div>
		<div>
			<label>pwd</label>
			<div><input type="text"  name="password" value=''></div>
		</div>
		<div>
			<label>email</label>
			<div><input type="text"  name="email" value=''></div>
		</div>
		<div>
			<label>qq</label>
			<div><input type="text"  name="qq" value=''></div>
		</div>
		<div>
			<div>&nbsp;&nbsp;&nbsp;&nbsp;
					<input type="submit" value='注册'>
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					<input type="reset" value='重置'>
			</div>
		</div>
	</form>
</div>
<hr/>
<a href='selectall'>查看全部</a>
</body>
</html>