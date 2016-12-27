<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>

<head>
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=yes">

<title>Bootstrap</title>
<link href="/css/bootstrap.min.css" rel="stylesheet">
<link href="/css/my.css" rel="stylesheet">

<script src="/js/jquery.min.js"></script>
<script src="/js/bootstrap.min.js"></script>
<script src="/js/fastclick.js"></script>
<script src="/js/zepto.min.js"></script>
<script src="/js/util.js"></script>

<script>

	var name ='name';
	var quntity ='quntity';
	var addclass = 'addclass';
	var subclass = 'subclass';
	var quantity ='quantity';
	var total = 'total';
	var price = 'price';
	var allTotal =0;
	var allQuantity=0;
	function creatOrderHtml(rowid,name,quntity,addclass,subclass,qutityid,toltalid)
	{
		var a= '<row id='+rowid+'>	<div class="col-xs-5">		<p>'+name+'</p>	</div>	<div class="col-xs-4 ">		￥<i id="'+toltalid+'">'+quntity+
		'</i>	</div>	<div class="col-xs-1 miniPadding '+subclass+'">		<button class="btn  btn-info" type="button " style="float: right;">-</button>	</div>'+
		'<div class="col-xs-1 miniPadding " style="text-align: center">		<p class="'+qutityid+'">1</p>	</div>	<div class="col-xs-1 miniPadding '+addclass+'">'+
		'	<button class="btn btn-info"  type="button ">+</button>	</div> </row>';

		return a;
	}

	function add( event  ) {
		console.log("add tap");

		var i = parseFloat($("."+quantity+event.data.index+":first").text()) + 1;

		if(i==1)
		{
			$("#showOrderDiv").prepend(creatOrderHtml(event.data.index,event.data.name,'15',addclass+event.data.index,subclass+event.data.index,quantity+event.data.index,total+event.data.index));
			$("."+addclass+event.data.index).on("tap ", {index:event.data.index ,name:$("#"+name+i).text()}, add  );
			$("."+subclass+event.data.index).on("tap ", {index: event.data.index}, sub  )

		}
		$("."+quantity+event.data.index).text(i);

		var lprice = parseFloat($("#"+price+event.data.index).text());
		var money =  lprice * i;
		$("#"+total+event.data.index).text(money);

		allTotal +=lprice;
		allQuantity++;
		$("#allTotal").text(allTotal);
		$("#allQuantity").text(allQuantity);
	};

	function sub(event ) {
		console.log("sub tap");

		var i = parseFloat($("."+quantity+event.data.index+":first").text())-1;

		if(i<0)
			return ;
		if(i==0)
		{
			$("#"+event.data.index).remove();
		}
		var lprice = parseFloat($("#"+price+event.data.index).text());

		var money = lprice * i;
		$("#"+total+event.data.index).text(money);

		$("."+quantity+event.data.index).text(i);

		allTotal -=lprice;

		allQuantity--;
		$("#allTotal").text(allTotal);
		$("#allQuantity").text(allQuantity);
	};

	$(document).ready(function() {

		console.log("ready document");
		//$("#showOrderDiv").scrollTop(500);
		var i =0;
		for(i;i<3;i++)
		{
			$("#add"+i).on("tap ", {index:i ,name:$("#name"+i).text()}, add );

			$("#sub"+i).on("tap ", {index: i}, sub  );
		}

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
	<div class="container" id="goods" >
		<div class="row">
			<div class="col-xs-12">
				<div class="row">
					<div class="col-xs-4">
						<img alt="140x140" src="/upload/71480692325662839.jpg"
							class="img-circle" style="width: 100px; height: 100px;" />
					</div>

					<div class="col-xs-8 ">
						<div class="row ">
							<div class="col-xs-12 ">
								<p id="name0">lname0</p>
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
							<div class="col-xs-5 ">
								￥<i id="price0">22</i>
							</div>
							<div class="col-xs-7 ">
								<row>
								<div class="col-xs-4  miniPadding">
									<button class="btn  btn-info" id="sub0" type="button "
										style="float: right;">-</button>
								</div>
								<div class="col-xs-4  miniPadding" style="text-align: center">
									<p class="quantity0">0</p>
								</div>
								<div class="col-xs-4  miniPadding">
									<button class="btn  btn-info" id="add0" type="button ">+</button>

								</div>
								</row>
							</div>

						</div>
					</div>
				</div>
			</div>
		</div>


		<div class="row">
			<div class="col-xs-12">
				<div class="row">
					<div class="col-xs-4">
						<img alt="140x140" src="/upload/71480692325662839.jpg"
							class="img-circle" style="width: 100px; height: 100px;" />
					</div>

					<div class="col-xs-8 ">
						<div class="row ">
							<div class="col-xs-12 ">
								<p id="name2">lname2</p>
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
							<div class="col-xs-5 ">
								￥<i id="price2">28</i>
							</div>
							<div class="col-xs-7 ">
								<row>
								<div class="col-xs-4  miniPadding">
									<button class="btn  btn-info" id="sub2" type="button "
										style="float: right;">-</button>
								</div>
								<div class="col-xs-4  miniPadding" style="text-align: center">
									<p class="quantity2">0</p>
								</div>
								<div class="col-xs-4  miniPadding">
									<button class="btn  btn-info" id="add2" type="button ">+</button>

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

	<div  class="container "   id="showOrderDiv" style="width=100px; position: fixed; bottom: 10% ; right:0; left:0;max-height:50%;overflow:auto;">


		<div style="text-align: right; float: right;">
			<i >总数：</i> <i id="allQuantity"></i>
			<i >总金额：</i> <i id="allTotal" ></i>
		</div>

	</div>



	<br>
	<br>
	<div class="container " style="position: fixed;top:90%; left: 0; right: 0;  bottom: 0; ">
		<div class="row  fillHeight"    >
			<div class="col-xs-6  noPadding fillHeight"  >
				<button type="button" id="showOrder" class="btn btn-info btn-block  fillHeight" >查看订单</button>
			</div>

			<div class="col-xs-6  noPadding fillHeight"  >
				<button type="button" id="order" class="btn btn-info btn-block  fillHeight" >确认下单</button>
			</div>

		</div>
	</div>


</body>


</html>