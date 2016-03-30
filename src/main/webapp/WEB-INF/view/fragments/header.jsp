<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<div class="container">
	<div class="navbar navbar-default navbar-fixed-top">
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