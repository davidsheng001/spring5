<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/11/5 0005
  Time: 下午 4:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table cellpadding="5" cellspacing="0" border="1">
    <tr>
        <th>id</th>
        <th>name</th>
        <th>course</th>
    </tr>
    <c:forEach items="${teachers.list}" var="tea">
        <tr>
            <td>${tea.id}</td>
            <td>${tea.teacherName}</td>
            <td>${tea.course}</td>
        </tr>
    </c:forEach>
    <tr>
        <td colspan="3">
            <a href="getAll?pageNum=1">首页</a>
            <a href="getAll?pageNum=${teachers.prePage}">上一页</a>
            <c:forEach items="${teachers.navigatepageNums}" var="pn">
                <c:if test="${pn == teachers.pageNum}">
                    【${pn}】
                </c:if>
                <c:if test="${pn != teachers.pageNum}">
                    <a href="getAll?pageNum=${pn}">${pn}</a>
                </c:if>
            </c:forEach>
            <a href="getAll?pageNum=${teachers.nextPage}">下一页</a>
            <a href="getAll?pageNum=${teachers.pages}">尾页</a>
        </td>
    </tr>
</table>
</body>
</html>
