<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

<nav class="navbar navbar-inverse">
    <div class="container-fluid">
        <div class="navbar-header">
            <a class="navbar-brand" href="/home">Pet Clinic</a>
        </div>
        <ul class="nav navbar-nav">
            <li class="active"><a href="<c:url value="/home"/>">Home</a></li>
            <li><a href="<c:url value="/vets"/>">Our Vets</a></li>
            <li><a href="<c:url value="/about"/>">About Us</a></li>
        </ul>
        <ul class="nav navbar-nav navbar-right">
            <li>
                <sec:authorize access="isAnonymous()">
                    <a href="<c:url value="/signup"/>"><span class="glyphicon glyphicon-user"></span> Sign Up</a>
                </sec:authorize>
            </li>
            <li>
                <sec:authorize access="isAnonymous()">
                    <a href="<c:url value="/login"/>"><span class="glyphicon glyphicon-log-in"></span> Login</a>
                </sec:authorize>
            </li>
            <li>
                <sec:authorize access="hasAuthority('USER')">
                    <a href="<c:url value="/user-edit"/>" >
                        <span class="glyphicon glyphicon-edit"></span>
                        Edit User
                    </a>
                </sec:authorize>
            </li>
            <li>
                <sec:authorize access="hasAuthority('USER')">
                    <a href="/logout"><span class="glyphicon glyphicon-log-out"></span> Logout</a>
                </sec:authorize>
            </li>
        </ul>
    </div>
</nav>