<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 11/24/2022
  Time: 4:07 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>user managerment</title>
</head>
<body>
<center>
    <h1>User Managerment Application</h1>
    <h3>
        <a href="/UserServlet?action=create">Add new user</a>
    </h3>
</center>
<div align="center">
    <table border="1" cellpadding="5">
        <caption>List of users</caption>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Email</th>
            <th>Country</th>
        </tr>
        <c:forEach items="userList" var="user">
            <tr>
                <td>${user.id}</td>
                <td>${user.name}</td>
                <td>${user.email}</td>
                <td>${user.country}</td>
                <td><a href="/UserServlet?action=edit&id=${user.id}">Edit</a></td>
                <td><a href="/UserServlet?action=delete&id=${user.id}">Delete</a></td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
