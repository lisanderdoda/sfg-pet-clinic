package com.ld.springframework.sfgpetclinic.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
@MappedSuperclass
public class BaseEntity implements Serializable {
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }
}
