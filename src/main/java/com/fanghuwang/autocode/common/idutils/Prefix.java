package com.fanghuwang.autocode.common.idutils;

public enum Prefix {
    MODEL_ID_PROFIX("MID"),
    API_ID_PROFIX("AID"),
    POJO_ID_PROFIX("PID"),
    COLUMN_ID_PROFIX("CID");

    private String code;

    private Prefix(String code){
        this.code = code;
    }


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
