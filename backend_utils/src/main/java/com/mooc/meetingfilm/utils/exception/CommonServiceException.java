package com.mooc.meetingfilm.utils.exception;

import lombok.Data;

/**
 * @author : jiangzh
 * @program : com.mooc.meetingfilm.utils.exception
 * @description : 公共的业务逻辑错误
 **/
@Data
public class CommonServiceException extends Exception{

    private Integer code;
    private String message;

    public CommonServiceException(int code,String message){
        this.code = code;
        this.message = message;
    }

}
