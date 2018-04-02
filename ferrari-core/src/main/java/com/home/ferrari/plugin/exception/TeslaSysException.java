package com.home.ferrari.plugin.exception;

import com.home.ferrari.base.ResultCode;

/** 
* @ClassName: ApolloSysException 
* @Description: 系统异常
* @author zengbin
* @date 2015年11月10日 下午7:24:25 
*/
public class TeslaSysException extends RuntimeException {
    
    private static final long serialVersionUID = 604122701395795861L;
    
    private ResultCode resultCode;
    
    public TeslaSysException() {
        super();
    }
    
    public TeslaSysException(String message) {
        super(String.format("====[errorMessage ：  %s]", message));
    }
    
    public TeslaSysException(ResultCode resultCode , Integer userId , String message) {
        super(String.format("===[errorCode ： %s ]===[userId ： %s]===[errorMessage ：  %s]===", resultCode.getCode(), userId , message));
        this.resultCode = resultCode;
    }
    
    public TeslaSysException(ResultCode resultCode , String deviceId , String message) {
        super(String.format("===[errorCode ： %s ]===[deviceId ： %s]===[errorMessage ：  %s]===", resultCode.getCode(), deviceId , message));
        this.resultCode = resultCode;
    }

    public TeslaSysException(ResultCode resultCode , Integer userId , String message, Throwable cause) {
        super(String.format("===[errorCode ： %s ]===[userId ： %s]===[errorMessage ：  %s]===", resultCode.getCode() , userId , message), cause);
        this.resultCode = resultCode;
    }
    
    public TeslaSysException(ResultCode resultCode , String deviceId , String message, Throwable cause) {
        super(String.format("===[errorCode ： %s ]===[deviceId ： %s]===[errorMessage ：  %s]===", resultCode.getCode() , deviceId , message), cause);
        this.resultCode = resultCode;
    }

    public ResultCode getResultCode() {
        return resultCode;
    }

    public void setResultCode(ResultCode resultCode) {
        this.resultCode = resultCode;
    }
    
}
