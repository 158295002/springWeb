<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: dingqin
  Date: 2017/11/7
  Time: 11:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/student.css" type="text/css">
<html>
<head>
    <title>添加学生</title>
</head>
<body>

<c:if test="${!empty message}">
    <div class="message">
        错误信息：${message}
    </div>
</c:if>
<form method="post" class="form" enctype="multipart/form-data">
    ID:<input type="text" name="id">
    <br>
    name:<input type="text" name="name">
    <br/>
    头像1:<input type="file" name="head_portrait" accept="image/gif,image/png,image/jpeg,image/jpg,image/svg+xml">
    头像2:<input type="file" name="head_portrait" accept="image/gif,image/png,image/jpeg,image/jpg">
    <br>
    <input type="submit" value="添加">
</form>
</body>
</html>
