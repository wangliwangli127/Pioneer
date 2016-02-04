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
				<div class="left">
					<!-- user info -->
					<div class="recom1 left-menu">
						欢迎<a href="#">username</a>登陆
					</div>
					<!-- order1 -->
					<div class="recom2 left-menu">
						<p>推荐1</p>
						<p>推荐1</p>
						<p>推荐1</p>
						<p>推荐1</p>
						<p>推荐1</p>
					</div>
					<!-- order2 -->
					<div class="recom3 left-menu">
						<p>推荐1</p>
						<p>推荐1</p>
						<p>推荐1</p>
						<p>推荐1</p>
						<p>推荐1</p>
					</div>
				</div>					 
				<!--end leftmenu-->

				<div class="right">
					<!-- 置顶菜单 -->
					<!--header-->
					<div class="menu" id="menuDivId" style="aposition: relative;text-align: left;">
						<ul>
							<li><a name="menu" href="/Pioneer/ajaxall/">全部状态</a></li>
							<li><a name="menu" href="#" id="mystat">个人动态</a></li>
							<li><a name="menu" href="/Pioneer/userinfo/" id="userinfo">个人信息</a></li>
							<li><a name="menu" href="#" onclick="show(0,'orders',3);">其他</a></li>
						</ul>
					</div>
					<script type="text/javascript">
						$("#mystat").click(function() {
							$.ajax({
								type:"post",
								url:"/Pioneer/ajaxmystate/",
								async:false,
								dataType:"html",
								contentType: 'application/json; charset=utf-8',
								success:function(data){
									alert(data)
									var path="\<# include 'userpersonal.ftl'\>"
									alert(path)
									$("#mainList").html(path)
								}
							});							
						});
					</script>

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
						<#include '${path}'>	
					</div>
					<div class="bank20"></div>
				</div>
				<!--start footer-->
				<!-- clear -->
				<div class="clear"></div>
				<!-- footer -->
				<div class="footer">
					2016-01-27.wl
				</div>
				<!--end footer-->
			</div>
		</div>
	</body>
</html>