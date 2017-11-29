package com.company.common;

/**
 * Created by Teacher on 2017/11/29.
 */
public enum ResponseCode {
    SUCCESS(0,"SUCCESS"),
    ERROR(1,"ERROR"),
    ILLEGAL_ARGUMENT(3,"ILLEGAL_ARGUMENT"),
    NEED_LOGIN(10,"NEED_LOGIN");

    private final Integer code;
    private final String desc;
    ResponseCode(Integer code, String desc) {
        this.desc = desc;
        this.code = code;
    }

    public Integer getCode(){
        return this.code;
    }

    public String getDesc(){
        return this.desc;
    }

}
