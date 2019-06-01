package com.hms.common.util;

import java.io.Serializable;

public class Result implements Serializable {
    private static final long serialVersionUID = 1L;
    private String code;
    private String info;
    private Object result;

    public static Result success() {
        Result result = new Result();
        result.setCode("200");
        result.setInfo("success");
        return result;
    }

    public static Result success(Object result) {
        Result res = new Result("200", "success");
        res.setResult(result);
        return res;
    }

    public static Result failure() {
        Result result = new Result();
        result.setCode("500");
        result.setInfo("failure");
        return result;
    }

    public static Result failure(String info) {
        Result result = failure();
        result.setInfo(info);
        return result;
    }

    public static Result error(String code, String info) {
        Result result = new Result();
        result.setCode(code);
        result.setInfo(info);
        return result;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getInfo() {
        return this.info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Object getResult() {
        return this.result;
    }

    public void setResult(Object result) {
        this.result = result;
    }

    private Result(String code, String info, Object result) {
        this.code = code;
        this.info = info;
        this.result = result;
    }

    private Result(String code, String info) {
        this.code = code;
        this.info = info;
    }

    private Result() {
    }
}
