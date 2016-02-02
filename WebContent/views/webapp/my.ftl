<#include "template/start.ftl">
	<script type="text/javascript">
		$(window).load(function() {
		 show(0,'my',1)
		});
	</script>
<div class="right_item" data-favour="true">
	<div class="right_item_content">
		<ul>
			<li><a href="#" onclick="show(1,'mystate',0);">我的发言</a></li>
			<li><a href="#" onclick="show(1,'myrelation',1);">与我相关</a></li>
		</ul>
	</div>
	<div class="clear"></div>
</div>
<div class="clear"></div>
<div id="mainList2">
	<div class="right_item" data-favour="true">
		<div class="right_item_content">
			<div class="right_item_name">
					<a href="#" onclick="">name:</a>
		</div>
		<div class="right_item_text">
				<p onclick="" href="#" target="_blank">
					mystate
				</p>
		</div>
		<div class="right_item_pic">
				<img onclick="" src="http://223.202.119.52/static/newsimg/201601/1958748758_14540433933270.8838866919292535_m.jpg">
			</div>
			<div class="right_item_footer">
				<!-- 评论点赞 -->
				<div class="share_box" >
					<font class="gray">时间-</font>
					<img src="../css/images/read_icon.png" alt="浏览次数" title="浏览次数" style="float:left; margin:8px 6px 0 20px;">
					<font class="gray">浏览次数-</font>
					<a name="favour" href="javascript:;" onclick="">
						<img src="../css/images/fot_heart_icon.png" alt="点赞" title="点赞">
					</a>
					<font class="gray">点赞次数-</font>
				</div>
				<!-- 评论点赞 -->
			</div>
		</div>
		<div class="clear"></div>
	</div>
		<div class="clear"></div>
	<div id="more">
		<div class="clear"></div>
		<div class="loading_btn">
			<a href="javascript:;" onclick="loadPage('mystate',0,0);">加载更多</a>
		</div>
	</div>
</div>
<#include 'template/end.ftl'>