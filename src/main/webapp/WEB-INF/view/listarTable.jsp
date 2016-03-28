<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
	<head>
		<%-- JQuery --%>
        <script src="resources/js/jquery.js" type="text/javascript"></script>
        <script src="resources/js/jquery-ui.min.js" type="text/javascript"></script>
        <script src="<c:url value="/webjars/bootstrap/3.1.1/js/bootstrap.min.js" />"></script>
		<link href="<c:url value="/webjars/bootstrap/3.1.1/css/bootstrap.min.css" />" rel="stylesheet" />
        <%-- JTable --%>
        <link href="resources/js/jtable/themes/metro/green/jtable.css" rel="stylesheet" type="text/css" />       
        <script src="resources/js/jtable/jquery.jtable.js" type="text/javascript"></script>
        <link href="resources/css/jquery-ui.css" rel="stylesheet" type="text/css" />
        <script type="text/javascript" src="resources/js//jtable/external/json2.js"></script>
		<script type="text/javascript" src="<c:url value="resources/js/table.js" />"></script>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Listar Contatos</title>
	</head>
	<body>
		<div class="container" style="text-align: center;">
			<jsp:include page="fragments/header.jsp" />
			<h2>Contatos</h2>
		  	<div id="show-table"></div>
		  	<jsp:include page="fragments/footer.jsp" />
	  	</div>
	</body>
</html>