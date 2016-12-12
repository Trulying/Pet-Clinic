<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Create account</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
    <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</head>
<body>

<jsp:include page="menu.jsp"/>
<section class="container">
    <div class="jumbotron">
        <h2 align="center">Create account</h2>
    </div>
</section>

<section id="login-form">
    <div class="container">
        <div class="jumbotron">
            <form:form modelAttribute="user" class="form-horizontal">
                <fieldset>

                        <h2 class="form-signin-heading">Please fill in the form below</h2>
                        <div class="input-group">
                            <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                            <form:input id="username" path="username" cssClass="form-control" type="text"
                                        placeholder="username" class="form:input-large"/>
                        </div>
                        <div class="input-group">
                            <span class="input-group-addon"><i class="glyphicon glyphicon-lock"></i></span>
                            <form:input id="password" cssClass="form-control" path="password" type="password"
                                        placeholder="password" class="form:input-large"/>
                        </div>

                    <input id="btnAdd" class="btn btn-lg btn-primary btn-block" type="submit" value="Create Account"/>
                </fieldset>
            </form:form>
        </div>
    </div>
</section>

</body>
</html>
