<%@ page contentType="text/html;charset=UTF-8"%>
<html>
<body>
<h2>Hello World!</h2>
<a href="handle01">111</a><br>
<a href="haha/handle01">test requestMapping加载类上</a><br>
<a href="handle02?name">test-requestMapping-params</a><br>
<form action="handle03" method="post">
    <input type="submit">
</form>
<a href="handle04">test requestMapping-headers</a>
<a href="handle06/6">test 路径占位符</a>

<%--高版本的tomcat，8.0以上需要第一行page添加[isErrorPage="true"]--%>
<form action="handle07" method="post">
    <input name="_method" value="delete" style="display: none" placeholder="删除">
    <input type="submit" value="delete">
</form>

<a href="handle08?name=333">test请求参数</a>
<form action="handle09" method="post">
    书名：<input type="text" placeholder="请输入" name="author"><br>
    作者：<input type="text" placeholder="请输入" name="bookName"><br>
    数量：<input type="text" placeholder="请输入" name="number"><br>
    价格：<input type="text" placeholder="请输入" name="price"><br>
    <input type="submit">
</form>

<a href="handle10">test原生api使用</a>
</body>
</html>
