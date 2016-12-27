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
		console.log(12);

		var g_i = 0;

		$("#add ").on("tap ", function() {
			console.log(1);

			var i = parseFloat($("#quantity ").text());
			$("#quantity ").text(i + 1);
			g_i++;

		});

		$("#sub ").on("tap ", function() {
			console.log(2);

			var i = parseFloat($("#quantity ").text());
			i = --i < 0 ? 0 : i;
			$("#quantity ").text(i);
			g_i--;
		});

	});
</script>
</head>

<body>
	<div class="container">
		<div class="row">
			<div class="col-xs-12">
				<div class="row">
					<div class="col-xs-4">
						<img alt="140x140" src="/upload/714806923256628398.jpg"
							class="img-circle"
							style="width: 100px; height: 100px;/>
				</div>
				<div class=" span6 ">
					</div>
					<div class="col-xs-8 ">
						<div class="row ">
							<div class="col-xs-12 ">
								<p>名称</p>
							</div>
						</div>
						<div class="row ">
							<div class="col-xs-6 ">
								<p>点赞</p>
							</div>
							<div class="col-xs-6 ">
								<p>好评</p>
							</div>
						</div>
						<div class="row ">
							<div class="col-xs-3 ">
								<p>￥22</p>
							</div>
							<div class="col-xs-9 ">
								<row>
								<div class="col-xs-4 ">
									<button class="btn  " id="sub" type="button "
										style="float: right;">-</button>
								</div>
								<div class="col-xs-4 " style="text-align: center">
									<p id="quantity">1</p>
								</div>
								<div class="col-xs-4 ">
									<button class="btn " id="add" type="button ">+</button>

								</div>
								</row>
							</div>

						</div>
					</div>
				</div>
			</div>
		</div>
	</div>


</body>


</html>