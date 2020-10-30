package cn.pear.controller;

import cn.pear.bean.Book;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ResponseAjaxController {

    @ResponseBody
    @RequestMapping("/getBook")
    public Book handle01(){
        Book book = new Book("西游记","吴承恩",100,2);
        return book;
    }

    @RequestMapping("/setBook")
    public String handle02(@RequestBody Book book){
        System.out.println(book);
        return "success";
    }
}
