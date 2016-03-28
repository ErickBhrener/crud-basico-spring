<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<div class="container">
<div class="navbar navbar-default navbar-fixed-top">
<!-- 	<div class="navbar-header"> -->
<!-- 		<button type="button" class="navbar-toggle collapsed" -->
<!-- 			data-toggle="collapse" data-target="#navbar" aria-expanded="false" -->
<!-- 			aria-controls="navbar"> -->
<!-- 			<span class="sr-only">Toggle navigation</span> <span class="icon-bar"></span> -->
<!-- 			<span class="icon-bar"></span> <span class="icon-bar"></span> -->
<!-- 		</button> -->
<!-- 		<a class="navbar-brand" href="/contatos/listar">Contato App</a> -->
<!-- 	</div> -->
	<div id="navbar" class="  collapse navbar-collapse">
		<ul class="nav navbar-nav">
			<li class="active"><a href="/contatos/listar">Home</a></li>
			<li><a href="/contatos/adicionar">Adicionar</a></li>
			<li><a href="<c:url value="/j_spring_security_logout"></c:url>">Logout</a></li>
		</ul>
	</div>
	<!--/.nav-collapse -->
</div>
</div>