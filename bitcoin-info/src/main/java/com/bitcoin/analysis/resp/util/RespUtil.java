package com.bitcoin.analysis.resp.util;


import com.bitcoin.analysis.resp.RespResult;

public class RespUtil {
    public static RespResult success(Object data){
        RespResult respResult = new RespResult(1,"请求成功",data);
        return respResult;
    }

    public static RespResult error(Integer code, String msg){
        RespResult respResult = new RespResult(code,msg,null);
        return respResult;
    }
}