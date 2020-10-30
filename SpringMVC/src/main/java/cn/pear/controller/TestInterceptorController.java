package cn.pear.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestInterceptorController {


    /*
    * preHandle........
    * handle........
    * postHandle.......
    * success.jsp.....
    * afterCompletion.........
    * */
    @RequestMapping("/testInterceptor")
    public String handle01(){
        System.out.println("handle........");
        return "success";
    }
}
