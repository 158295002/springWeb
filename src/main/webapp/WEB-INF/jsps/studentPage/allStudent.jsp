<%--
  Created by IntelliJ IDEA.
  User: dingqin
  Date: 2017/11/6
  Time: 17:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<head>
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/student.css" type="text/css"/>
</head>
<title>学生信息</title>
<html>
<body class="stu">
<div class="showInCenter">
    <a href="addPerson">添加学生</a>
    <hr/>
    <c:if test="${!empty students}">
        <c:forEach items="${students}" var="student">
        <span class="id">
               学生ID：<c:out value="${student.id}"/>
        </span>
            <br>
            <div style="color: chartreuse">
                学生姓名：${student.name}
            </div>
            <br>
            课程名称：
            <c:forEach items="${student.courses}" var="course">
                ${course}
            </c:forEach>
            <br>
        </c:forEach>
    </c:if>
</div>
</body>
</html>
