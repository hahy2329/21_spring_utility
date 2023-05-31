<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath }"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title><tiles:insertAttribute name="title"/></title>
<script src="${contextPath }/resources/jsEx.js"></script>
<link href="${contextPath }/resources/cssEx.css" rel="stylesheet" type="text/css">
</head>
<body>
	
	<div style="height: 50px; background-color: skyblue;">
		<tiles:insertAttribute name="header"/>
	</div>
	<div style="height: 200px; background-color: lime;">
		<tiles:insertAttribute name="side"/>
	
	</div>
	<div style="height: 500px; background-color: white;">
		<tiles:insertAttribute name="member"/>
	
	</div>
	<div style="height: 150px; background-color: yellow;">
		<tiles:insertAttribute name="footer"/>
	
	</div>
</body>
</html>