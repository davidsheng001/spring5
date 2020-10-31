package cn.pear.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestExceptionController {

    @RequestMapping("/testexception")
    public String handle01(){
        int i = 10/0;
        return "success";
    }

    @RequestMapping("/testresponsestatus")
    public String handle02(){
        int i = 1;
        if(i==1){
            throw new UserException();
        }
        return "success";
    }
}
