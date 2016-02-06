<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<link href="../css/css.css" rel=stylesheet>
		<script src="../js/jquery-1.11.2.min.js"></script>
		<script src="../js/jquery-html.js"></script>
		<title>demo</title>
 		<script type="text/javascript">
	 		$(window).load(function() {
				 show('oneself',2)
				});
		</script>			
	</head>
	<body>
		<div align="center" class="containter">

			<div class="bank10" style="height: 15px;"></div>
			<div class="content">
				<!--leftmenu-->
					<#include "template/left.ftl">
				<!--end leftmenu-->				

				<div class="right">
					<!-- 置顶菜单 -->
					<!--header-->
						<#include "template/header.ftl">
					<!--end header-->
					<!-- 右侧自由div -->
					<!--end-->
					<!-- main -->
					<div id="mainList"> 
		           		<div class="right_item" data-favour="true">
		           			<div class="right_item_content">
		           				<ul>
		           					<li><a href="#" onclick=" this.className='cur' ">基本信息</a></li>
									<li><a href="#" onclick=" this.className='cur' ">个人设置</a></li>
									<li><a href="#" onclick=" this.className='cur' ">安全设置</a></li>
		           				</ul>
		           			</div>
		           			<div class="right_item_content">
		           				<div id="userinfoid" class="userinfo">
		           					<a>ss</a><br>
		           					<a>ss</a><br>
		           					<a>ss</a><br>
		           					<a>ss</a><br>
		           					<a>ss</a><br>
		           					<a>ss</a><br>
		           					<a>ss</a><br>
		           					<a>ss</a><br>
		           					<a>ss</a><br>
		           					<a>ss</a><br>
		           				</div>
		           			</div>
		           			<div class="clear"></div>
		           		</div>						 

			            <!--加载更多-->
			            	<#include "template/loadmore.ftl">
			            <!--end loadmore-->  
					</div>
					<div class="bank20"></div>
				</div>
				<!--start footer-->
					<#include "template/footer.ftl">
				<!--end footer-->
			</div>
		</div>
	</body>
</html>