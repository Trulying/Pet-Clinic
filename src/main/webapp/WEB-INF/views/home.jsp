<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Welcome</title>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
</head>
<body>
        <div class="btn-group btn-group-sm">
            <a href="/home" class="btn btn-primary">
                Home page
            </a>
            <a href="/login" class="btn btn-primary">
                Login
            </a>
            <a href="/vets" class="btn btn-primary">
                Vets
            </a>
            <a href="/about" class="btn btn-primary">
                About
            </a>
        </div>
    <div class="jumbotron">
        <div class="container">
            <h1 class="text-center">${helloMessage}</h1>
            <p class="text-center">
                ${hiMessage}
            </p>
        </div>
    </div>
</body>
</html>
