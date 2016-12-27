
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<style type="text/css">
</style>

<script src="../js/util.js" type="text/javascript"></script>

<meta name="viewport"
	content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=yes">

</head>
<body>

	<div class="goodsPicture">欢迎来到</div>

	<table>
		<tr>
			<td>菜名：</td>
			<td>${tGoods.CName }</td>
		</tr>
		<tr>
			<td>价格：</td>
			<td>${tGoods.CPrice }</td>

		</tr>
		<tr>
			<td>显示优先级：</td>
			<td>${tGoods.CPriority }</td>
		</tr>
		<tr>
			<td>详细描述：</td>
			<td>${tGoods.cTGoodsDetailId.CDescribe }</td>

		</tr>
		<tr>
			<td>口味：</td>
			<td>${tGoods.cTGoodsDetailId.CFlavor }</td>

		</tr>
		<tr>
			<td>照片：</td>
			<td><img src="${tGoods.CPicturePath }" alt="图片显示"
				style="width: 100px; height: 100px;" /></td>

		</tr>

	</table>
</body>
</html>
