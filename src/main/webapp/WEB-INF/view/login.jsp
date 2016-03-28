<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
	<title>Login</title>
	<jsp:include page="fragments/htmlHead.jsp" />
</head>
<body>
<div class="container">
    <div class="row">
        <div class="col-sm-6 col-md-4 col-md-offset-4">
            <h1 class="text-center login-title">Login</h1>
            <div class="account-wall">
                <form:form role="form" servletRelativeAction="/j_spring_security_check" method="post" id="login-form" autocomplete="off" class="form-horizontal">
	                <input type="text" name="j_username" id="login" class="form-control" placeholder="login" required autofocus>
	                <input type="password" name="j_password" id="key" class="form-control" placeholder="senha" required>
	                <button class="btn btn-lg btn-primary btn-block" type="submit" value="Login" value="Login">
	                    Login</button>
                </form:form>
            </div>
        </div>
    </div>
</div>
</body>
</html>