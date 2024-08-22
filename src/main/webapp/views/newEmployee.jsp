<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: This MC
  Date: 22/08/2024
  Time: 8:37 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>New Employee</title>
</head>
<body>
<form:form modelAttribute="employeeDto" action="${pageContext.request.contextPath}/employeeController/create" method="post" enctype="multipart/form-data">
    <form:label path="empName" for="empName">Employee Name</form:label>
    <form:input path="empName" id="empName"/><br>
    <form:label path="age" for="age">Age</form:label>
    <form:input type="number" path="age" id="age"/><br>
    <form:label path="avatar" for="avatar">Avatar</form:label>
    <form:input type="file" path="avatar" id="avatar"/><br>
    <input type="submit" value="Create"/>
</form:form>
</body>
</html>
