package cn.pear.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class MyExceptionController {

    @ExceptionHandler(value = ArithmeticException.class)
    public ModelAndView handle01(Exception exception){
        System.out.println(exception);
        ModelAndView mv = new ModelAndView("myerror");
        mv.addObject("msg",exception);
        return mv;
    }
}
