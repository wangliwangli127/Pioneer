<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="/css_users/aTest.css" rel=stylesheet>
<link href="/css_users/add_css.css" rel=stylesheet>
<link href="/css_users/css.css" rel=stylesheet>
<link href="/css_users/jquery.custom-scrollbar.css" rel=stylesheet>
<link href="/css_users/pop.css" rel=stylesheet>
<link href="/css_users/scroll_pic.css" rel=stylesheet>
<link href="/css_users/votecss.css" rel=stylesheet>
<link href="/css_users/WdatePicker.css" rel=stylesheet>
<title>Insert title here</title>
<script language="javascript">
    var t = null;
    t = setTimeout(time,1000);//开始执行
    function time()
    {
       clearTimeout(t);//清除定时器
       dt = new Date();
       var h=dt.getHours();
       var m=dt.getMinutes();
       var s=dt.getSeconds();
       document.getElementById("timeShow").innerHTML =  "现在的时间为："+h+"时"+m+"分"+s+"秒";
       t = setTimeout(time,1000); //设定定时器，循环执行             
    } 
  </script>
</head>
<body class="div-body">
<div align="center" class="containter">
	<div class="bank5" style="height: 15px;"></div>
	<div class="bank-head" style="height: 15px;">
		<div style="height: 15px;">欢迎<a href="#">superadmin</a>登陆...<label id="timeShow"></lable></div>
		
	</div>
	<div class="content">
		<div class="left">1</div>
		<div class="right">1
			<table>
				<tr><td>1</td></tr>
				<tr><td>1</td></tr>
				<tr><td>1</td></tr>
				<tr><td>1</td></tr>
				<tr><td>1</td></tr>
				<tr><td>1</td></tr>
				<tr><td>1</td></tr>
				<tr><td>1</td></tr>
				<tr><td>1</td></tr>
				<tr><td>1</td></tr>
				<tr><td>1</td></tr>
				<tr><td>1</td></tr>
				<tr><td>1</td></tr>
				<tr><td>1</td></tr>
				<tr><td>1</td></tr>
				<tr><td>1</td></tr>
				<tr><td>1</td></tr>
				<tr><td>1</td></tr>
				<tr><td>1</td></tr>
				<tr><td>1</td></tr>
				<tr><td>1</td></tr>
				<tr><td>1</td></tr>
				<tr><td>1</td></tr>
				<tr><td>1</td></tr>
				<tr><td>1</td></tr>
				<tr><td>1</td></tr>
				<tr><td>1</td></tr>
				<tr><td>1</td></tr>
				<tr><td>1</td></tr>
				<tr><td>1</td></tr>
				<tr><td>1</td></tr>
				<tr><td>1</td></tr>
				<tr><td>1</td></tr>
				<tr><td>1</td></tr>
				<tr><td>1</td></tr>
				<tr><td>1</td></tr>
			</table>
		</div>
		<div class="clear">1</div>
		<div class="footer">1</div>
	</div>
</div>
</body>
</html>