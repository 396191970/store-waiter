<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=yes">

<title>Bootstrap 实例 - 手机、平板电脑、台式电脑</title>
<link href="/css/bootstrap.min.css" rel="stylesheet">
<script src="/js/jquery.min.js"></script>
<script src="/js/bootstrap.min.js"></script>
<script src="/js/fastclick.js"></script>
<script src="/js/zepto.min.js"></script>


<script>
$(document).ready(function()
  {
  $("button").click(function(){
    $("#p1").css("color","red").slideUp(2000).slideDown(2000);
  });
});
</script>
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-xs-12">
				<div class="row">
					<button class="btn" id="test" type="button" style=" float: right;  background-color:#858" >hello</button>
					<button class="btn" id="del" type="button" style=" float: right;  background-color:#858" >del</button>
					
					<div id="include"></div>
				</div>
				
			</div>
		</div>
	</div>
</body>


<script src="/js/util.js"></script>


</html>