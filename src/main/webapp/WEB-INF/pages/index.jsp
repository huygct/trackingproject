<%--
  Created by IntelliJ IDEA.
  User: thuynghi
  Date: 4/8/2015
  Time: 10:29 AM
  To change this template use File | Settings | File Templates.
--%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Login</title>
    <meta charset="utf-8">

    <meta content="IE=edge,chrome=1" http-equiv="X-UA-Compatible">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <link href="http://getbootstrap.com/dist/css/bootstrap.min.css" rel="stylesheet">
    <link href="http://getbootstrap.com/dist/css/bootstrap-responsive.min.css" rel="stylesheet">
</head>
<body>
    <div class="container">
        <h1>Users</h1>
        <form:form method="post" action="home" commandName="user" role="form">
            <div class="form-group">
                <form:label path="email">Mail:</form:label>
                <form:input path="email" class="form-control" placeholder="Email"/>
            </div>
            <div class="form-group">
                <form:label path="password">Password:</form:label>
                <form:input path="password" class="form-control" placeholder="Password"/>
            </div>
            <button type="submit" class="btn btn-default">Login</button>
        </form:form>
        <a href="newAccount.html">New Account</a>
    </div>
</body>
</html>
