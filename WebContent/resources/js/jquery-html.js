//menu ul li a css change id=menuDivId
var id = 'menuDivId';
function show(name,k){
 	var lis = $("#"+id+" ul li");
 	for(var i=0;i<lis.length;i++){
 		$('#'+id+' ul li a:eq('+i+')').removeClass(function() {
		    return 'cur';
		});
	}
	$("#"+id+" ul li a:eq("+k+")").addClass(function() {
		  return 'cur';
		});
	//a标签 获取内容的action
	
}
//menu 滑动css
window.onload = function(){
	show('all',0);
	var obj = document.getElementById(id);
	var height = obj.offsetTop;
	window.onscroll = function(){
		var obj = document.getElementById(id);
		var scrollTop = document.documentElement.scrollTop || document.body.scrollTop;
		if(scrollTop < height){
			obj.style.position = 'relative';
		}else{
			obj.style.position = 'fixed';
		}
	}
}
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
function loadPage() {
	
}


