package cn.pear.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(reason = "有异常",value = HttpStatus.NOT_ACCEPTABLE)
public class UserException extends RuntimeException {

    static final long serialVersionUID = 1L;
}
