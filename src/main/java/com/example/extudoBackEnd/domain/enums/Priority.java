package com.example.extudoBackEnd.domain.enums;

public enum Priority {
    LOW(0, "LOW"),
    AVERAGE(1, "AVERAGE"),
    HIGH(2, "HIGH");
    private Integer code;
    private String description;
    Priority(Integer code, String description) {
        this.code = code;
        this.description = description;
    }
    public Integer getCode() {
        return code;
    }
    public String getDescription() {
        return description;
    }
    public static Priority toEnum(Integer code) {
        if(code == null) return null;
        for (Priority value : Priority.values()) {
            if(code.equals(value.getCode())) {
                return value;
            }
        }
        throw new IllegalArgumentException("Prioridade inválida");
    }
}
