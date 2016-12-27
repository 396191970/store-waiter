<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<%
String jsO="[{'cCreatDate':1480348800000,'cId':6,'cName':'for you','cPicturePath':'/upload/714806923256628398.jpg','cPrice':22},{'cCreatDate':1480348800000,'cId':7,'cName':'for you','cPicturePath':'/upload/714806923256628398.jpg','cPrice':22},{'cCreatDate':1480348800000,'cId':19,'cName':'a4腰','cPicturePath':'/upload/QQ图片20161026135540.jpg','cPrice':300,'cTGoodsDetailId':{'cDescribe':'喜欢','cFlavor':'1','cId':19}},{'cCreatDate':1480348800000,'cId':10,'cName':'水电费','cPicturePath':'/upload/QQ图片20161026135547.jpg','cPrice':12,'cTGoodsDetailId':{'cDescribe':'好吃','cFlavor':'1','cId':10}}]";

%>
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

		console.log("ready document");
		//$(".estimate").hide();
		$(".add").on("tap ", function() {
			console.log("add tap");

			var i = parseFloat($("#quantity").text()) + 1;

			$("#quantity").text(i);
			$("#quantity1").text(i);

			var money = parseFloat($("#price").text()) * i;
			$("#total").text(money);

		});

		$(".sub").on("tap ", function() {
			console.log("sub tap");

			var i = parseFloat($("#quantity").text());

			i = --i < 0 ? 0 : i;
			$("#quantity ").text(i);
			$("#quantity1 ").text(i);

			var money = parseFloat($("#price").text()) * i;
			$("#total").text(money);
		});

		$("#showOrder").on("tap ", function() {
			console.log("showOrder");
			$("#showOrderDiv").slideToggle();
		});

		$("#order").on("tap ", function() {
			console.log("order");

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
							class="img-circle" style="width: 100px; height: 100px;" />
					</div>

					<div class="col-xs-8 ">
						<div class="row ">
							<div class="col-xs-12 ">
								<p>名称</p>
							</div>
						</div>
						<div class="row ">
							<div class="col-xs-6 ">
								<p class="estimate">点赞</p>
							</div>
							<div class="col-xs-6 ">
								<p class="estimate">好评</p>
							</div>
						</div>
						<div class="row ">
							<div class="col-xs-3 ">
								￥<i id="price">22</i>
							</div>
							<div class="col-xs-9 ">
								<row>
								<div class="col-xs-4 sub">
									<button class="btn  btn-info" id="sub" type="button "
										style="float: right;">-</button>
								</div>
								<div class="col-xs-4 quantity" style="text-align: center">
									<p id="quantity">1</p>
								</div>
								<div class="col-xs-4 add">
									<button class="btn  btn-info" id="add" type="button ">+</button>

								</div>
								</row>
							</div>

						</div>
					</div>
				</div>
			</div>
		</div>
	</div>

	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<div class="container " id="showOrderDiv">

		<div class="row ">
			<div class="col-xs-4 ">
				<p>名称</p>
			</div>
			<div class="col-xs-2 ">
				￥<i id="total">22</i>
			</div>

			<div class="col-xs-2 sub">
				<button class="btn  btn-info" id="sub" type="button "
					style="float: right;">-</button>
			</div>
			<div class="col-xs-2  quantity" style="text-align: center">
				<p id="quantity1">1</p>
			</div>
			<div class="col-xs-2 add">
				<button class="btn btn-info" id="add" type="button ">+</button>
			</div>
		</div>

	</div>




	<br>
	<br>
	<div class="container ">
		<div class="row ">
			<div class="col-xs-6 ">
				<button type="button" id="showOrder" class="btn btn-info btn-block">查看订单</button>
			</div>

			<div class="col-xs-6 ">
				<button type="button" id="order" class="btn btn-info btn-block">确认下单</button>
			</div>

			</row>
		</div>
	</div>


</body>


</html>