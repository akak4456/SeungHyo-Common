package com.adele.common;

public enum ResponseCode {
    SUCCESS("0"), Login_ERROR("-1"), RESPONSE_FORM_ERROR("-2");
    private final String code;
    ResponseCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
