<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>
<head>
    <title>Welcome</title>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
</head>
<body>
<jsp:include page="menu.jsp"/>
<div class="container">
    <div class="jumbotron">
        <h1 class="text-center">${helloMessage}</h1>
        <p class="text-center">
            ${hiMessage}
        </p>
    </div>
</div>
</body>
</html>
