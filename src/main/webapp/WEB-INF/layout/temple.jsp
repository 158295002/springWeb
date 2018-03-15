<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%--
  Created by IntelliJ IDEA.
  User: dingqin
  Date: 2017/11/13
  Time: 11:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>总模板</title>
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/student.css" type="text/css">
</head>
<body>
<%--<table>--%>
    <%--<tr>--%>
        <%--<td colspan="2"><tiles:insertAttribute name="header"/></td>--%>
    <%--</tr>--%>
    <%--<tr>--%>
        <%--<td><tiles:insertAttribute name="menu"/></td>--%>
        <%--<td><tiles:insertAttribute name="body"/></td>--%>
    <%--</tr>--%>
    <%--<tr>--%>
        <%--<td colspan="2"><tiles:insertAttribute name="footer"/></td>--%>
    <%--</tr>--%>
<%--</table>--%>
    <div class="showInCenter">
        <tiles:insertAttribute name="header"/>
    </div>
    <div class="showInCenter">
        <tiles:insertAttribute name="body"/>
    </div>
    <div class="showInCenter">
        <tiles:insertAttribute name="footer"/>
    </div>

</body>
</html>
