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
				 show('all',0)
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
					<div class="colde_top">
						<label id="timeShow" style="text-align: center"></lable>
					</div>
					<div class="return_top" style="">
						<a href="#" title="返回顶部" onclick="headerGo();" style=""></a>
					</div>
					<!--end-->
					<!-- main -->
					<div id="mainList">
						<#list [1,2,3,4,5] as x>
			           		<!-- 多个Div -->
			           		<div class="right_item" data-favour="true">
			           			<div class="right_item_content">
			           				<div class="right_item_name">
			           					<a href="#" onclick="">xxx</a>
			           				</div>
			           				<div class="right_item_text">
				           				<p onclick="" href="#" target="_blank">
				           					啦啦啦啦啦啦啦啦啦啦啦啦啦啦啦啦啦啦啦啦啦
				           					啦啦啦啦啦啦啦啦啦啦啦啦啦啦啦啦啦啦啦啦啦
				           					啦啦啦啦啦啦啦啦啦啦啦啦啦啦啦啦啦啦啦啦啦
				           					啦啦啦啦啦啦啦啦啦啦啦啦啦啦啦啦啦啦啦啦啦
				           				</p>
			           				</div>
			           				<div class="right_item_pic">
				           				<img onclick="" src="http://223.202.119.52/static/newsimg/201601/1958748758_14540433933270.8838866919292535_m.jpg">
				           			</div>
			           				<div class="right_item_footer">
			           					<!-- 评论点赞 -->
			           					<div class="share_box" >
			           						<font class="gray">时间-time</font>
			           						<img src="../css/images/read_icon.png" alt="浏览次数" title="浏览次数" style="float:left; margin:8px 6px 0 20px;">
			           						<font class="gray">浏览次数-int</font>
			           						<a name="favour" href="javascript:;" onclick="">
			           							<img src="../css/images/fot_heart_icon.png" alt="点赞" title="点赞">
			           						</a>
			           						<font class="gray">点赞次数-int</font>
			           					</div>
			           					<!-- 评论点赞 -->
			           				</div>
			           			</div>
			           			<div class="clear"></div>
			           		</div>	
		           		</#list> 

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