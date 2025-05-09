package com.cglia.dfm.dto;
public class PropertyDTO {
    private String key;
    private String value;

    public PropertyDTO(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }
}
