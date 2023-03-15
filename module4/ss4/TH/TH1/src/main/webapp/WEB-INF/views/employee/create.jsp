<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 12/19/2022
  Time: 8:21 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
  <title>Create a new employee</title>
</head>
<body>
<h3>Welcome, Enter The Employee Details</h3>

<form:form method="POST" action="addEmployee" modelAttribute="employee">
  <table>
    <tr>
      <td>Employee ID: </td>
      <td><form:input path="id"/></td>
    </tr>
    <tr>
      <td>Employee's name:</td>
      <td><form:input path="name"/></td>
    </tr>
    <tr>
      <td>Contact's number:</td>
      <td><form:input path="contactNumber"/></td>
    </tr>
    <tr>
      <td>Xiloas</td>
      <td><input type="text" name="test" /> </td>
    </tr>
    <tr>
      <td><input type="submit" value="Submit"/></td>
    </tr>
  </table>
</form:form>
</body>
</html>
