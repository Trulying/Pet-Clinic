<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Our vets</title>
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
<section class="container">
    <div class="row">
        <c:forEach items="${vets}" var="vet">
            <div class="col-sm-6 col-md-3" style="padding-bottom:15px">
                <div class="thumbnail">
                    <div class="caption">
                        <h3>${vet.name} ${vet.surname}</h3>
                        <p>specialism: ${vet.specialism}</p>
                        <a href="/vet?id=${vet.id}">
                            <div class="btn btn-primary">
                                Details
                            </div>
                        </a>
                    </div>
                </div>
            </div>
        </c:forEach>
    </div>
</section>
</body>
</html>