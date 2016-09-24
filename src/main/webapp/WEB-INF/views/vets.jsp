<%--
  Created by IntelliJ IDEA.
  User: macie_000
  Date: 24.09.2016
  Time: 18:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Our vets</title>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
</head>
<body>
<section class="container">
    <div class="row">
        <c:forEach items="${vets}" var="vet">
            <div class="thumbnail">
                <div class="caption">
                    <h3>${vet.name} ${vet.surname}</h3>
                </div>
            </div>
        </c:forEach>
    </div>
</section>
</body>
</html>
