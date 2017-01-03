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
            <h2 style="text-align: center">
               Login
            </h2>
        </div>
    </section>

    <section id="login-form">
        <div class="container">

            <div class="jumbotron">
                <c:url value="/login" var="loginUrl"/>
                <form action="${loginUrl}" method="post" class="form-signin">
                    <c:if test="${param.error != null}">
                        <p>
                            Invalid username and password.
                        </p>
                    </c:if>
                    <c:if test="${param.logout != null}">
                        <p>
                            You have been logged out.
                        </p>
                    </c:if>
                    <h2 class="form-signin-heading">Please sign in</h2>
                    <label type="text" for="username" class="sr-only">Login</label>
                    <input type="text" id="username" class="form-control" placeholder="username" required autofocus>
                    <label for="password" class="sr-only">Password</label>
                    <input type="password" id="password" class="form-control" placeholder="password" required>
                    <input type="hidden"
                           name="${_csrf.parameterName}"
                           value="${_csrf.token}"/>
                    <input type="submit" class="btn btn-lg btn-primary btn-block" value="Log in">
                </form>
            </div>
        </div>
    </section>

</body>
</html>
