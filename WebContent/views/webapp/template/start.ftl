<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<link href="../css/userinfo.css" rel=stylesheet>
		<link href="../css/my.css" rel=stylesheet>
		<link href="../css/css.css" rel=stylesheet>
		<script src="../js/jquery-1.11.2.min.js"></script>
		<script src="../js/jquery-html.js"></script>
		<title>demo</title>
	</head>
	<body>
		<div align="center" class="containter">

			<div class="bank10" style="height: 15px;"></div>
			<div class="content">
				<!--leftmenu-->
					<#include "left.ftl">
				<!--end leftmenu-->				
 
				<div class="right">
					<!-- 置顶菜单 -->
					<!--header-->
						<#include "header.ftl">
					<!--end header-->
					<!-- 右侧自由div -->
					<div class="colde_top">
						<label id="timeShow" style="text-align: center"></lable>
					</div>
					<div class="return_top" style="">
						<a href="#" title="返回顶部" onclick="headerGo();" style=""></a>
					</div>
					<!--end-->
					<!-- main -->
					<div id="mainList">