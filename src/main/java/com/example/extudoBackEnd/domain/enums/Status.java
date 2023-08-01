package com.example.extudoBackEnd.domain.enums;

public enum Status {
    OPEN(0, "OPEN"),
    INPROGRESS(1, "INPROGRESS"),
    CLOSED(2, "CLOSED");
    private Integer code;
    private String description;
    Status(Integer code, String description) {
        this.code = code;
        this.description = description;
    }
    public Integer getCode() {
        return code;
    }
    public String getDescription() {
        return description;
    }
    public static Status toEnum(Integer code) {
        if(code == null) return null;
        for (Status value : Status.values()) {
            if(code.equals(value.getCode())) {
                return value;
            }
        }
        throw new IllegalArgumentException("Status inválido");
    }
}
