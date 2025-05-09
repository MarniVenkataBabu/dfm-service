package com.cglia.dfm.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "element_properties")
public class Property {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String key;
    private String value;



    @ManyToOne
    @JoinColumn(name = "element_id")
    private Element element;

    public Property() {}

    public Property(String key, String value, Element element) {
        this.key = key;
        this.value = value;
        this.element = element;

    }

    public Long getId() {
        return id;
    }

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }

    public Element getElement() {
        return element;
    }


}
