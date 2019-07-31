<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 7/31/2019
  Time: 12:16 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Create category</title>
</head>
<body>
    <form action="/createCategory" method="post">
        <label>Name : </label>
        <input type="text" name="categoryName">
        <br>
        <input type="submit" value="Create category">
    </form>
</body>
</html>
