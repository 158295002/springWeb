<%--
  Created by IntelliJ IDEA.
  User: dingqin
  Date: 2017/11/10
  Time: 15:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>使用spring标签添加学生</title>
</head>
<body>

<sf:form commandName="student" method="post">

    ID:<sf:input path="id"/><sf:errors path="id"/>
    姓名:<sf:input path="name"/><sf:errors path="name"/>
    <input type="submit" value="添加">
</sf:form>
</body>
</html>
