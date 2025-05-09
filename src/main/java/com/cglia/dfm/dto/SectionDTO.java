package com.cglia.dfm.dto;

import java.util.List;

public class SectionDTO {
    private String name;
    private Integer column;
    private List<List<ComponentDTO>> addedComponents; // Assume 2D list for columns
    // + getters & setters
}
