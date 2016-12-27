
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
    shopping cart id =${id }

	<form id="fileForm" action="/user/add" method="post">
		<table>

			<c:forEach var="item" items="${tGoodsList}" varStatus="status">

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
					<td>数量：</td>
					<td><input type="text"
						name="lists.tItem[${status.index }].CQuantity"></td>
				</tr>

				<input type="text" name="lists.tItem[${status.index }].tGoods.CId"
					value="${item.CId }" hidden="true">
					<input type="text" name="id"
					value="${id}" hidden="true">


			</c:forEach>

			<tr>
				<td><a href="/user/ordered">显示金额 ，查看已点</a></td>
				<td><input type="submit" value="确认"></td>
			</tr>
		</table>
	</form>

</body>
</html>
