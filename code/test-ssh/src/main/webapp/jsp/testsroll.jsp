<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>

<head>
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=yes">

<title>Bootstrap 实例 - 手机、平板电脑、台式电脑</title>
<link href="/css/bootstrap.min.css" rel="stylesheet">
<link href="/css/my.css" rel="stylesheet">

<script src="/js/jquery.min.js"></script>
<script src="/js/bootstrap.min.js"></script>
<script src="/js/fastclick.js"></script>
<script src="/js/zepto.min.js"></script>
<script src="/js/util.js"></script>
       <body>
  //d1是外层div，带滚动条
 
  	  <div id='d1'  style="position: fixed;top:50%; left: 0; right: 0;  bottom: 0; overflow:auto;">

     <div style='height:500px;width:500px;background:yellow'>2222</div>
  </div>
 </body>
<script>
  document.getElementById('d1').scrollTop=200;//通过scrollTop设置滚动到100位置
  document.getElementById('d1').scrollLeft=200;//通过scrollTop设置滚动到200位置
</script>
    </html>  
