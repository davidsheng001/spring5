<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<h2>Hello World!</h2>
<a href="/handle01">111</a><br>
<a href="/haha/handle01">test requestMapping加载类上</a><br>
<a href="/handle02?name">test-requestMapping-params</a><br>
<form action="/handle03" method="post">
    <input type="submit">
</form>
<a href="/handle04">test requestMapping-headers</a>
<a href="/handle06/6">test 路径占位符</a>
</body>
</html>
