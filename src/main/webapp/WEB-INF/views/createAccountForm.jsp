<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Create account</title>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
</head>
<body>

    <section class="container">
        <div class="jumbotron">
            <h1 align="center">Create account</h1>
        </div>
    </section>

    <section class="container">
        <form:form modelAttribute="user" class="form-horizontal">
            <fieldset>
                <legend>
                    Add new user
                </legend>
                <div class="form-group">
                    <label class="control-label col-lg-2 col-lg-2" for="username">Username: </label>
                    <div class="col-lg-10">
                        <form:input path="username" type="text" class="form:input-large"/>
                    </div>
                </div>

                <div class="form-group">
                    <label class="control-label col-lg-2 col-lg-2" for="password">Password: </label>
                    <div class="col-lg-10">
                        <form:input path="password" type="password" class="form:input-large"/>
                    </div>
                </div>

                <div class="form-group">
                    <div class="col-lg-offset-2 col-lg-10">
                        <input type="submit" id="btnAdd" class="btn btn-primary" value ="Create Account"/>
                    </div>
                </div>
            </fieldset>
        </form:form>

    </section>
</body>
</html>
