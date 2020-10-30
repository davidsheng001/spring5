package cn.pear.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/tvr")
public class TestViewResolverController {

    @RequestMapping("/handle01")
    public String handle01(){

        return "forward:/hello.jsp";
    }

    /*
    * 只是转发或者跳转页面的话，不需要写方法，直接配置
    * <mvc.....
    * */
//    @RequestMapping("/handle02")
//    public String handle02(){
//
//        return "redirect:/hello.jsp";
//    }

    /*
    * 自定义视图解析
    * */
    @RequestMapping("/handle03")
    public String handle03(){
        return "pear:/66666";
    }
}
