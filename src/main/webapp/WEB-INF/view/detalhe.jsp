<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Detalhe Contato</title>
</head>
<body>
	<a href="<c:url value="/j_spring_security_logout"></c:url>">Logout</a>
	<h2>Detalhes do Contato ${contato.id}</h2>
	<label>Nome: ${contato.nome }</label> |
	<label>Email: ${contato.email }</label> |
	<label>Telefone: ${contato.telefone }</label> |
	<label>Endereco: ${contato.endereco }</label><br/>
	<a href="/contatos/editar/${contato.id}">Editar</a>
	<a href="/contatos/listar">Voltar</a>
	<br>
</body>
</html>