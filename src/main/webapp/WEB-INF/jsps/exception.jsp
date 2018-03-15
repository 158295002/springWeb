<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: dingqin
  Date: 2017/11/14
  Time: 10:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="<%=request.getContextPath()%>/css/student.css">
    <title>异常捕获</title>
</head>
<body>
<center>
    <div class="message">
        这是异常页:
        <c:if test="${!empty message}">
            ${message}
        </c:if>
        <br>
        <a href="showAllPerson">返回所有信息页</a>
    </div>
</center>
</body>
</html>
