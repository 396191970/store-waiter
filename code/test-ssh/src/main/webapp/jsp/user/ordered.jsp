
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<style type="text/css">
</style>

<meta name="viewport"
	content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=yes">

<script src="/js/util.js" type="text/javascript"></script>

</head>
<body>

	<div class="goodsPicture">欢迎来到</div>
	<a href="/user/ordered">清空购物车</a> 可修改数量
	<table>

		<tr>
			<td>订单编号</td>
			<td>${tShoppingCart.CId}</td>
		</tr>


		<c:forEach var="item" items="${tShoppingCart.tItems}"
			varStatus="status">

			<tr>
				<td>菜名：</td>
				<td>${item.tGoods.CName }</td>
			</tr>
			<tr>
				<td>照片：</td>
				<td><img src="${item.tGoods.CPicturePath }" alt="图片显示"
					style="width: 100px; height: 100px;" /></td>
			</tr>
			<tr>
				<td>金额：</td>
				<td>${item.tGoods.CPrice }</td>
			</tr>
			<tr>
				<td>数量：</td>
				<td>${item.CQuantity }</td>
			</tr>
			<tr>
				<td> <a href="/user/del?sId=${tShoppingCart.CId }&iId=${item.CId }"> 删除</a> </td>
				<td> /user/del?sId=${tShoppingCart.CId }&iId=${item.CId }</td>
			</tr>

		</c:forEach>

		<tr>
			<td><a href="/user/orderAdd?id=${tShoppingCart.CId }"> 再点</a></td>
			<td><input type="submit" value="确认"></td>
		</tr>
	</table>

</body>
</html>
