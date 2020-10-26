package cn.pear.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class MyFirstController {
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
