package com.rand.test;

public enum ErrCode {
    BADEX("400","클라이언트에러"),
    ITERNER_EX("500","서버에러");

    private String errCode;
    private String message;

    ErrCode(String errCode, String message) {
        this.errCode = errCode;
        this.message = message;
    }
    public String getErrCode(){
        return this.errCode;
    }

    public String getMessage(){
        return this.message;
    }

}
