package com.example.demo.common.exception;

import com.example.demo.common.response.ResponseStatus;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;

import java.util.List;

/**
 * 自定义异常用于校验参数
 */
public class ValidationException extends GlobleException {

    public ValidationException() {
        this.setCode(ResponseStatus.ERROR_CODE);
        this.setMsg(ResponseStatus.ERROR_MSG);
    }

    public ValidationException(BindingResult bindingResult) {
        String msg = "";
        List<ObjectError> ls = bindingResult.getAllErrors();
        for (int i = 0; i < ls.size(); i++) {
            msg += ls.get(i).getDefaultMessage();
            if(i != ls.size()-1){
                msg += ",";
            }
        }
        this.setCode(ResponseStatus.ERROR_CODE);
        this.setMsg(msg);
    }

}
