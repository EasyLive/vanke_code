<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator"
	prefix="sitemesh"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>认购管理系统：<sitemesh:title />
</title>
<link type="image/x-icon" href="/static/images/favicon.ico"
	rel="shortcut icon">
<link rel="stylesheet" href="/static/bootstrap/css/bootstrap.min.css"
	type="text/css" />
<link rel="stylesheet" href="/static/style/default.css" type="text/css" />
<script type="text/javascript" src="/static/jquery/jquery-1.9.1.min.js"></script>

</head>
<body>
	<div class="container">
		<%@ include file="header.jsp"%>
		<div class="row" style="margin-top: 15px;">
			<%@ include file="left.jsp"%>
			<div class="span10" style="height: 500px;">
				<sitemesh:body />
			</div>
		</div>
		<%@ include file="footer.jsp"%>
	</div>
	<script type="text/javascript"
		src="/static/bootstrap/js/bootstrap.min.js"></script>
	<script type="text/javascript"
		src="/static/jquery/jquery.placeholder.1.3.min.js"></script>
<script type="text/javascript">
<!--
$.Placeholder.init(); 
//-->
</script>
</body>
</html>