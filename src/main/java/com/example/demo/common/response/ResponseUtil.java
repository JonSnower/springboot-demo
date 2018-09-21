package com.example.demo.common.response;

public class ResponseUtil {

    public ResponseUtil() {
    }

    public static ResponseContent success() {
        ResponseContent rc = new ResponseContent<>();
        rc.setCode(ResponseStatus.SUCCESS_CODE);
        rc.setMsg(ResponseStatus.SUCCESS_MSG);
        rc.setData(null);
        return rc;
    }


    public static ResponseContent success(Object data) {
        ResponseContent rc = new ResponseContent<>();
        rc.setCode(ResponseStatus.SUCCESS_CODE);
        rc.setMsg(ResponseStatus.SUCCESS_MSG);
        rc.setData(data);
        return rc;
    }

    public static ResponseContent error() {
        ResponseContent rc = new ResponseContent<>();
        rc.setCode(ResponseStatus.ERROR_CODE);
        rc.setMsg(ResponseStatus.ERROR_MSG);
        rc.setData(null);
        return rc;
    }

    public static ResponseContent error(String msg) {
        ResponseContent rc = new ResponseContent<>();
        rc.setCode(ResponseStatus.ERROR_CODE);
        rc.setMsg(msg);
        rc.setData(null);
        return rc;
    }

    public static ResponseContent error(String code, String msg, Object data) {
        ResponseContent rc = new ResponseContent<>();
        rc.setCode(code);
        rc.setMsg(msg);
        rc.setData(data);
        return rc;
    }

}
