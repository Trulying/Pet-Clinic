<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>
<head>
    <title>About Us</title>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
</head>
<body>
    <jsp:include page="menu.jsp" />
    <section class="container">
        <div class="jumbotron">
            <h1>About Us</h1>
        </div>
    </section>

    <section class="container">
    <div class="panel panel-default">
        <div class="panel-heading">
            <spring:message code="aboutUs.panel.heading"/>
        </div>
        <div class="panel-content">
            <spring:message code="aboutUs.panel.content"/>
        </div>
    </div>
    </section>
</body>
</html>
