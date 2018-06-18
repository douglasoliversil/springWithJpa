package com.example.demo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ClientDTO {

    @JsonProperty(value = "id")
    private long id;

    @JsonProperty(value = "name")
    private String name;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
