
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<html>
<head>

<meta name="viewport"
	content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=yes">
<frameset rows="30,*,50" frameborder="yes">

   <frame src="top.jsp" name="topFrame" id="topFrame"/>

    <frameset cols="80,*"  frameborder="yes">

           <frame src="left.jsp"id="leftFrame" />

           <frame src="addGoods3.jsp" id="mainFrame" scrolling="yes"/>

   </frameset>

   <frame src="down.jsp" name="bottomFrame"id="bottomFrame" />

   </frameset>
</head>


</html>
