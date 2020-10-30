<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/10/26 0026
  Time: 上午 11:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8"%>
<html>
<head>
    <title>Title</title>
    <% System.out.println("success.jsp....."); %>
</head>
<body>
    <h1>响应success</h1><br>
    请求域：${requestScope.reqParam}<br>
    session域：${sessionScope.sessionParam}<br>

    数据输出：${requestScope.msg}
</body>
</html>
