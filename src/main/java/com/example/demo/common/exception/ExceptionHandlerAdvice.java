package com.example.demo.common.exception;

import com.example.demo.common.response.ResponseContent;
import com.example.demo.common.response.ResponseUtil;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
@ResponseBody
public class ExceptionHandlerAdvice {

    @ExceptionHandler(value = Exception.class)
    public ResponseContent handleException(Exception e) {
        e.printStackTrace();
        return ResponseUtil.error();
    }

    @ExceptionHandler(value = ValidationException.class)
    public ResponseContent handleValidationException(ValidationException e) {
        return ResponseUtil.error(e.getCode(),e.getMsg(),null);
    }

}
