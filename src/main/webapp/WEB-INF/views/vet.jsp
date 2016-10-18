<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title>Vet</title>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
</head>
<body>
<jsp:include page="menu.jsp"/>

<section class="container">
    <div class="row">
            <div class="col-md-5">
                <div class="thumbnail">
                    <div class="caption">
                        <h3>${vet.name} ${vet.surname}</h3>
                        <p><strong>specialism:</strong> ${vet.specialism}</p>
                       <strong>
                           <p>Contact Data:</p>
                       </strong>
                        <p><strong>phone number:</strong> ${vetNumber}</p>
                        <p><strong>e-mail:</strong> ${vetMail}</p>
                        <a href="<spring:url value="/vets" />">
                            <div class="btn btn-primary">
                                Back
                            </div>
                        </a>
                    </div>
                </div>
            </div>
    </div>
</section>
</body>
</html>
