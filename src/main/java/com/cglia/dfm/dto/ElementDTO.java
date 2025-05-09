package com.cglia.dfm.dto;
import java.util.List;

public class ElementDTO {
    private Long id;
    private String name;
    private String type;
    private List<PropertyDTO> properties;

    public ElementDTO(Long id, String name, String type, List<PropertyDTO> properties) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.properties = properties;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public List<PropertyDTO> getProperties() {
        return properties;
    }
}
