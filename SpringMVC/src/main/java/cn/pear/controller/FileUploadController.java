package cn.pear.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@Controller
public class FileUploadController {

    @RequestMapping("/fileupload")
    public String handle01(@RequestParam("simpleFile") MultipartFile multipartFile,
                            @RequestParam("userName") String userName) {

        System.out.println(multipartFile.getName());
        System.out.println(multipartFile.getOriginalFilename());
        System.out.println(userName);
        try {
            multipartFile.transferTo(new File("E:\\test\\"+multipartFile.getOriginalFilename()));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return "success";
    }
}
