package com.evada.springweb.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author dingqin
 * @date 2017/11/14
 */
@ResponseStatus(value = HttpStatus.NOT_FOUND,reason = "找不到啊找不到!")
public class MyException extends  RuntimeException {

    public MyException(String message) {
        super(message);
    }
}
