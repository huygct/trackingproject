<%--
  Created by IntelliJ IDEA.
  User: thuynghi
  Date: 4/9/2015
  Time: 11:06 AM
  To change this template use File | Settings | File Templates.
--%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>New Account</title>
</head>
<body>
<p>
    ${adminSession}
</p>
    <form:form method="post" action="newAccount" commandName="user" role="form">
        <div class="form-group">
            <form:label path="badgeId">Badge Id:</form:label>
            <form:input path="badgeId" class="form-control" />
        </div>
        <div class="form-group">
            <form:label path="email">Mail:</form:label>
            <form:input path="email" class="form-control" placeholder="email"/>
        </div>
        <div class="form-group">
            <form:label path="password">Password:</form:label>
            <form:input path="password" class="form-control" type="password"/>
        </div>
        <div class="form-group">
            <form:label path="firstName">First Name:</form:label>
            <form:input path="firstName" class="form-control" placeholder="frist name"/>
        </div>
        <div class="form-group">
            <form:label path="lastName">Last Name:</form:label>
            <form:input path="lastName" class="form-control" placeholder="last name"/>
        </div>
        <div class="form-group">
            <form:label path="middleName">First Name:</form:label>
            <form:input path="middleName" class="form-control" placeholder="middle name"/>
        </div>
        <button type="submit" class="btn btn-default">Sign up</button>
    </form:form>

</body>
</html>
