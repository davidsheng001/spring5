package cn.pear.controller;

import cn.pear.bean.Teacher;
import cn.pear.service.TeacherService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class TeacherHandle {

    @Autowired
    private TeacherService teacherService;

    @RequestMapping("/getAll")
    public String handle01(ModelMap modelMap,
                           @RequestParam(value = "pageNum",defaultValue = "1")int pageNum){
        PageHelper.startPage(pageNum, 10);
        List<Teacher> teachers = teacherService.getAll();

        PageInfo page = new PageInfo(teachers,5);
        modelMap.addAttribute("teachers",page);
        return "success";
    }

}
