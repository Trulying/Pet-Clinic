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

                <form class="form-signin">
                    <h2 class="form-signin-heading">Please sign in</h2>
                    <label type="text" class="sr-only">Login</label>
                    <input type="text" id="login" class="form-control" placeholder="login" required autofocus>
                    <label for="inputPassword" class="sr-only">Password</label>
                    <input type="password" id="inputPassword" class="form-control" placeholder="Password" required>
                </form>
                <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
            </div>
        </div>
    </section>

</body>
</html>
