package cn.pear.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/*
* 数据输出：
*   map,model,modelMap
* */

@Controller
@RequestMapping("/output")
public class OutputController {

    @RequestMapping("/handle01")
    public String handle01(Map<String,Object> map){
        map.put("msg","map");
        return "success";
    }

    @RequestMapping("/handle02")
    public String handle02(Model model){
        model.addAttribute("msg","model");
        return "success";
    }

    @RequestMapping("/handle03")
    public String handle03(ModelMap modelMap){
        modelMap.addAttribute("msg","modelMap");
        return "success";
    }

    @RequestMapping("/handle04")
    public ModelAndView handle04(){
        ModelAndView modelAndView = new ModelAndView("success");
        modelAndView.addObject("msg","modelAndView");
        return modelAndView;
    }
}
