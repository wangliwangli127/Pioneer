//menu ul li a css change id=menuDivId,mainList
var id = ['menuDivId','mainList'];
function show(i,name,k){
 	var lis = $("#"+id[i]+" ul li");
 	for(var j=0;j<lis.length;j++){
 		$('#'+id[i]+' ul li a:eq('+j+')').removeClass(function() {
		    return 'cur';
		});
	}
	$("#"+id[i]+" ul li a:eq("+k+")").addClass(function() {
		  return 'cur';
		});
	//a标签 获取内容的action
	if("all" == name){//获取所有动态
 
	}else if("my" == name || "mystate" == name){//个人动态-我的发言
		$.ajax({
			type:"post",
			url:"/Pioneer/ajaxmystate/",
			async:false,
			dataType:"html",
			contentType: 'application/json; charset=utf-8',
			success:function(data){
				var obj=eval("("+data+")")
				$("#mainList2 .right_item_name a").html(obj["username"]);
				var g=$("#mainList2 .share_box").find("font")
				g[0].innerHTML="时间-2013-2-1"
				g[1].innerHTML="浏览次数-"+obj["browsed_times"]
				g[2].innerHTML="点赞次数-"+obj["praised_times"]
			}
		});
	}else if("myrelation" == name){//个人动态-与我相关
		$.ajax({
			type:"post",
			url:"/Pioneer/ajaxrelation/",
			async:false,
			dataType:"html",
			success:function(data){
				var obj=eval("("+data+")")
				$("#mainList2 .right_item_name a").html(obj["username"]);
				var g=$("#mainList2 .share_box").find("font")
				g[0].innerHTML="时间-2012-2-1"
				g[1].innerHTML="浏览次数-"+obj["browsed_times"]
				g[2].innerHTML="点赞次数-"+obj["praised_times"]
			}
		});
	}else if("userinfo" == name){//获取个人信息
		$.ajax({
			type:"post",
			url:"userinfo.html",
			dataType:"html",
			async:false,
			contentType: 'application/json; charset=utf-8',
			success:function(data){
		  
				$("#mainList").html(data);
				//默认加载 个人信息-基本信息
				show(1,'info',0);
			}
		});
	}else if("info" == name){//个人信息-基本信息
		
	}else if("control" == name){//个人信息-个人设置
		
	}else if("safe" == name){//个人信息-安全设置
		
	}else if("orders" == name){//获取其他信息
		
	}
	
	
}
//menu 滑动css
window.onload = function(){
	//show('all',0);
	var obj = document.getElementById(id[0]);
	var height = obj.offsetTop;
	window.onscroll = function(){
		var obj = document.getElementById(id[0]);
		var scrollTop = document.documentElement.scrollTop || document.body.scrollTop;
		if(scrollTop < height){
			obj.style.position = 'relative';
		}else{
			obj.style.position = 'fixed';
		}
	}
};
//时间戳
var timeShowId = "timeShow";
var t = null;
t = setTimeout(time,1000);//开始执行
function time(){
   clearTimeout(t);//清除定时器
   var dt = new Date();
   var y = dt.getFullYear();
   var M = dt.getMonth()+1;
   var d = dt.getDate();
   var h = dt.getHours();
   var m = dt.getMinutes();
   var s = dt.getSeconds();
   document.getElementById(timeShowId).innerHTML =  "当前时间："+y+"-"+M+"-"+d+" "+h+":"+m+":"+s;
   t = setTimeout(time,1000); //设定定时器，循环执行             
} 
//return header
function headerGo(){
	document.documentElement.scrollTop = document.body.scrollTop =0;
}

//leadpage
function loadPage(name, id, page) {
	if("all" == name){
		$.ajax({
			type:"post",
			url:"/Pioneer/ajax/",
			async:false,
			dataType:"html",
			contentType: 'application/json; charset=utf-8',
			success:function(data){
				alert(data)
				var more = $(".loading_btn");
				for(var i=0;i<more.length;i++){
					$(".loading_btn:eq("+i+")").hide();
				}

				$("#mainList").append(data);
			}
		});
	}else if("mystate" == name){
		$.ajax({
			type:"post",
			url:"mystate.html",
			async:false,
			dataType:"html",
			contentType: 'application/json; charset=utf-8',
			success:function(data){
				var more = $(".loading_btn");
				for(var i=0;i<more.length;i++){
					$(".loading_btn:eq("+i+")").hide();
				}
				$("#mainList2").append(data);
			}
		});
	}else if("myrelation" == name){
		$.ajax({
			type:"post",
			url:"myrelation.html",
			async:false,
			dataType:"html",
			contentType: 'application/json; charset=utf-8',
			success:function(data){
				var more = $(".loading_btn");
				for(var i=0;i<more.length;i++){
					$(".loading_btn:eq("+i+")").hide();
				}
				$("#mainList2").append(data);
			}
		});
	}
}


