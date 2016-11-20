<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>
<head>
    <title>Login</title>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
</head>
<body>
    <jsp:include page="menu.jsp"/>

    <section class="container">
        <div class="jumbotron">
            <h1 style="text-align: center">login</h1>
        </div>
    </section>
    <form action="${loginUrl}" method="post">
            <fieldset>
                <div class="form-group">
                    <label class="control-label col-lg-2 col-lg-2">
                        Username:
                    </label>
                    <input type="text" value="">
                </div>
                <div class="form-group">
                    <label class="control-label col-lg-2 col-lg-2">
                        Password:
                    </label>
                    <input type="password" value="">
                </div>

                <div class="form-group">
                    <div class="col-lg-offset-2 col-lg-10">
                        <input type="submit" id="btnAdd" class="btn btn-primary" value ="Login"/>
                    </div>
                </div>
                <input type="hidden" name="${_csrf.parameterName}"
                       value="${_csrf.token}" />
            </fieldset>
        </form>
    <section>
    </section>
</body>
</html>
