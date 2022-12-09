<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 11/18/2022
  Time: 11:30 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>${num1}
    <c:if test =" ${operator} == '+'">
        +
    </c:if>
    <c:if test =" ${operator} == '-'">
        -
    </c:if>
    = ${num2} + $${num1}
</h1>
</body>
</html>
