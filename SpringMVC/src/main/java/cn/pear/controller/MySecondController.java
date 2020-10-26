package cn.pear.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/haha")
public class MySecondController {

    @RequestMapping("/handle01")
    public String handle01(){
        return "success";
    }
}
