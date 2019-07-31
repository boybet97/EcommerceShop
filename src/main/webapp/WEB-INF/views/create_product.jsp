<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 7/31/2019
  Time: 7:29 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Create product</title>
</head>
<body>
<form:form action="/createProduct" method="post" modelAttribute="productForm">
    <form:label path="name">Name : </form:label>
    <form:input path="name"/>
    <br>
    <form:label path="description">Description : </form:label>
    <form:input path="description"/>
    <br>
    <form:label path="price">Price : </form:label>
    <form:input path="price"/>
    <br>
    <form:label path="categoryId">Category : </form:label>
    <form:select path="categoryId" items="${categories}"/>
    <br>
    <input type="submit" value="Create product">
</form:form>
</body>
</html>
