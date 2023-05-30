<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title><tiles:insertAttribute name="title"/></title>
</head>
<body>
	
	<div style="height: 50px; background-color: skyblue;">
		<tiles:insertAttribute name="header"/>
	</div>
	<div style="height: 200px; background-color: lime;">
		<tiles:insertAttribute name="side"/>
	
	</div>
	<div style="height: 500px; background-color: white;">
		<tiles:insertAttribute name="content"/>
	
	</div>
	<div style="height: 150px; background-color: yellow;">
		<tiles:insertAttribute name="footer"/>
	
	</div>
</body>
</html>