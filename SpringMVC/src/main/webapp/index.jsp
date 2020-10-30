<%@ page contentType="text/html;charset=UTF-8"%>
<html>
<script type="application/javascript" src="js/jquery-3.3.1.js"></script>
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

<a href="handle10">test原生api使用</a><br>

<%--test数据输出--%>
<a href="output/handle01">test map</a><br>
<a href="output/handle02">test model</a><br>
<a href="output/handle03">test modelMap</a><br>
<a href="output/handle04">test modelAndView</a><br>

<%--testViewResolver--%>
<a href="tvr/handle01">test forward</a><br>
<a href="tvr/handle02">test redirect</a><br>
<a href="tvr/handle03">test myViewResolver</a><br>

<%--springmvc支持ajax--%>
<button id="buttonid">发送json数据</button>

<form action="fileupload" method="post" enctype="multipart/form-data">
    <input type="file" name="simpleFile">
    <input type="text" name="userName" placeholder="请输入">
    <input type="submit" value="上传">
</form>

<a href="testInterceptor">拦截器</a><br>
<script type="text/javascript">
    $("#buttonid").bind('click',function () {
        var book={bookName:"西游记",author:"吴承恩",number:10,price:5};
        var bookstr = JSON.stringify(book);
        $.ajax({
            url:'/setBook',
            type:"POST",
            contentType:"application/json",
            data:bookstr,
            success:function(res){
                alert(res)
            }
        });
    });
</script>
</body>
</html>
