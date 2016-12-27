
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<html>
<head>
<style type="text/css">
</style>

<meta name="viewport"
	content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=yes">


</head>
<body>

	<form id="fileForm" action="/mng/add" method="post"
		enctype="multipart/form-data">
		<table>
			<tr>
				<td>菜名：</td>
				<td><input type="text" name="CName"></td>
			</tr>
			<tr>
				<td>价格：</td>
				<td><input type="text" name="CPrice"></td>
			</tr>
			<tr>
				<td>显示优先级：</td>
				<td><input type="text" name="CPriority"></td>
			</tr>


			<tr>
				<td>详细描述：</td>
				<td><input type="text" name="cTGoodsDetailId.CDescribe"></td>
			</tr>
			<tr>
				<td>口味：</td>
				<td><input type="text" name="cTGoodsDetailId.CFlavor"></td>
			</tr>
			<tr>
				<td>照片：</td>
				<td><input type="file" name="file" /></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="确认"></td>
			</tr>
		</table>

	</form>


</body>
</html>
