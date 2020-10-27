package cn.pear.controller;

import cn.pear.bean.Book;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


@Controller
public class MyFirstController {

    /*
    * 对原生api的支持
    * */
    @RequestMapping("/handle10")
    public String handle10(HttpServletRequest request,
                           HttpSession session){
        request.setAttribute("reqParam","我是请求域中的");
        session.setAttribute("sessionParam","我是session域中的");
        return "success";
    }

    /*
    * 自动封装pojo类型数据
    * */
    @RequestMapping("/handle09")
    public String handle09(Book book){
        System.out.println(book);
        return "success";
    }

    /*
    * @RequestParam()获取请求参数的值
    * @RequestHeader()获取请求头中的信息
    * @CookieValue()获取某个cookie值
    * */
    @RequestMapping("/handle08")
    public String handle08(@RequestParam(value = "name",required = false) String name,
                           @RequestHeader(value = "User-Agent",required = false) String userAgent,
                           @CookieValue(value = "JSESSIONID",required = false)String jid){
        System.out.println("name="+name);
        System.out.println("userAgent="+userAgent);
        System.out.println("jid="+jid);
        return "success";
    }

    /*
    * rest风格url
    * get，post，put，delete
    * */
    @RequestMapping(value = "/handle07", method = RequestMethod.DELETE)
    public String handle07(){
        System.out.println("handle07-delete..........");
        return "success";
    }

    /*
    * 路径占位符
    * */
    @RequestMapping("/handle06/{id}")
    public String handle06(@PathVariable("id") String id){
        System.out.println(id);
        return "success";
    }
    /*
    * ant风格的url
    * ?：任意一个字符
    * *：任意多个字符或者一层路径
    * **：任意多层路径
    * */
    @RequestMapping("/handle0?/*/a*")
    public String handle05(){
        System.out.println("handle05.........");
        return "success";
    }

    /*user-agent
    * 360:Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/78.0.3904.108 Safari/537.36
    * 谷歌:User-Agent=Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/86.0.4240.111 Safari/537.36
    * */
    @RequestMapping(value = "/handle04",headers = "User-Agent=Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/78.0.3904.108 Safari/537.36")
    public String handle04(){

        return "success";
    }

    @RequestMapping(value = "/handle03", method = RequestMethod.POST)
    public String handle03(){

        return "success";
    }

//    @RequestMapping(value = "/handle02", params = "name")
//    @RequestMapping(value = "/handle02", params = "!name")
    @RequestMapping(value = "/handle02", params = "name=111")
    public String handle02(){

        return "success";
    }

    @RequestMapping("/handle01")
    public String handle01(){

        return "success";
    }
}
