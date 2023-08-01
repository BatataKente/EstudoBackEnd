package com.example.extudoBackEnd.domain.enums;

public enum Perfil {
    ADMINISTRATOR(0, "ROLE_ADMINISTRATOR"),
    CLIENT(1, "ROLE_CLIENT"),
    TECHNICIAN(2, "ROLE_TECHNICIAN");
    private Integer code;
    private String description;
    Perfil(Integer code, String description) {
        this.code = code;
        this.description = description;
    }
    public Integer getCode() {
        return code;
    }
    public String getDescription() {
        return description;
    }
    public static Perfil toEnum(Integer code) {
        if(code == null) return null;
        for (Perfil value : Perfil.values()) {
            if(code.equals(value.getCode())) {
                return value;
            }
        }
        throw new IllegalArgumentException("Perfil inválido");
    }
}
