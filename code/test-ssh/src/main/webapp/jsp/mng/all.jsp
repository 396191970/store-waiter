
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<style type="text/css">
</style>

<meta name="viewport"
	content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=yes">
<script src="../js/util.js" type="text/javascript"></script>

</head>
<body>

	<div class="goodsPicture">欢迎来到</div>

	<table>

		<c:forEach var="item" items="${tGoodsList}">
			<tr>
				<td>菜单编号：</td>
				<td>${item.CId }</td>
			</tr>
			<tr>
				<td>菜名：</td>
				<td>${item.CName }</td>
			</tr>
			<tr>
				<td>照片：</td>
				<td><img src="${item.CPicturePath }" alt="图片显示"
					style="width: 100px; height: 100px;" /></td>

			</tr>
			<tr>
				<td><input type="submit" value="查看详情"
					onclick="href('/mng/findOne?id=${item.CId}')"></td>
				<td><input type="submit" value="删除"
					onclick="href('/mng/del?id=${item.CId}')"></td>
			</tr>


		</c:forEach>
	</table>

</body>
</html>
