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
	$(document).ready(function() {
		$("button").click(function() {
			$("#p1").css("color", "red").slideUp(2000).slideDown(2000);
		});
	});
</script>
</head>

<body>


	<div class="container ">

		<div class="row ">
			<div class="col-xs-3 ">
				<p>名称</p>
			</div>
			<div class="col-xs-9 ">
				<row>

				<div class="col-xs-2 ">
					<p>￥22</p>
				</div>
				<div class="col-xs-10 ">
					<row>
					<div class="col-xs-4 ">
						<button class="btn " id="sub " type="button "
							style="float: right; background-color: #858">-</button>
					</div>
					<div class="col-xs-4 " style="text-align: center">
						<p id="quantity ">1</p>
					</div>
					<div class="col-xs-4 ">
						<button class="btn " id="add " type="button "
							style="background-color: #858">+</button>

					</div>
					</row>
				</div>
				</row>

			</div>

			</row>

		</div>
</body>


<script>
	var g_i = 0;

	$("#add ").on("tap ", function() {
		var i = parseFloat($("#quantity ").text());
		$("#quantity ").text(i + 1);
		g_i++;

	});

	$("#sub ").on("tap ", function() {
		var i = parseFloat($("#quantity ").text());
		i = --i < 0 ? 0 : i;
		$("#quantity ").text(i);
		g_i--;
	}

	);
</script>

</html>