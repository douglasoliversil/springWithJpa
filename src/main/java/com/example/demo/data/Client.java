package com.example.demo.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "TB_CLIENT")
public class Client {

    @Id
    @Column(name = "ID_CLIENT")
    private Long id;

    @Column(name = "NAME_CLIENT")
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
