<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Listar Contatos</title>
<jsp:include page="fragments/htmlHead.jsp" />
</head>
<body>
	<jsp:include page="fragments/header.jsp" />
	<div class="container">
	<h2>Novo Contato</h2><br>
	
	<form:form id="adicionarContatoForm" commandName="contato" servletRelativeAction="/adicionar" method="POST" class="form-horizontal">
		<div class="form-group">
				<label class = "col-sm-2 control-label" for="nome">Nome: </label>
				<div class="col-sm-10">
					<form:input type="text" path="nome" id="nome"/><br>
				</div>
			</div>
			<div class="form-group">
				<label class = "col-sm-2 control-label" for="email">Email: </label>
				<div class = "col-sm-10">
					<form:input type="text" path="email" id="email"/><br>
				</div>
			</div>
			<div class="form-group">
				<label class = "col-sm-2 control-label" for="telefone">Telefone: </label>
				<div class = "col-sm-10">
					<form:input type="text" path="telefone" id="telefone"/><br>
				</div>
			</div>
			<div class="form-group">
				<label class = "col-sm-2 control-label" for="endereco">Endereco: </label>
				<div class = "col-sm-10">
					<form:input type="text" path="endereco" id="endereco"/><br>
				</div>
			</div>
			<div class="form-group">
				<div class = "col-sm-offset-2 col-sm-10">
					<input type="submit" value="Salvar"/>
				</div>
			</div>
	</form:form>
	</div>
</body>
</html>