 <%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<style type="text/css">
</style>

<meta name="viewport"
	content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=yes">

<link href="/css/jquery.spinner.css" rel="stylesheet">
<script src="/js/util.js" type="text/javascript"></script>
<script src="/js/jquery.min.js"></script>
<script src="/js/jquery.spinner.js" type="text/javascript"></script>
<script type="text/javascript">
		console.log("begian test ");

	var o =${tGoodsList};
	console.log(o);
	console.log(o[0].cName);
	console.log(JSON.stringify(o));
</script>
</head>
<body>

	<div class="goodsPicture">欢迎来到</div>

	<form id="fileForm" action="/user/add" method="post">
		<table>

			<c:forEach var="item" items="${tGoodsList}" varStatus="status">

				<tr>
					<td><img src="${item.CPicturePath }" alt="图片显示"
						style="width: 100px; height: 100px;" /></td>

					<td>
						<table>

							<tr>
								<td>${item.CName }</td>
							</tr>

							<tr>
								<td>销售数量，点赞数量</td>
							</tr>
							<tr>
								<td>${item.CPrice }</td>

								<td><input type="text" class="spinner" name="lists.tItem[${status.index }].CQuantity" /></td>
							</tr>
						</table>
					</td>

				</tr>



				<input type="text" name="lists.tItem[${status.index }].tGoods.CId"
					value="${item.CId }" hidden="true">


			</c:forEach>

			<tr>
				<td><a href="/user/ordered">显示金额 ，查看已点</a></td>
				<td><input type="submit" value="确认"></td>
			</tr>
		</table>
	</form>

	<script type="text/javascript">

$('.spinner').spinner();
</script>

</body>
</html>
