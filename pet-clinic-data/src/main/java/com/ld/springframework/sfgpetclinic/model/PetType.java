package com.ld.springframework.sfgpetclinic.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "type")
public class PetType extends BaseEntity{

    private String name;
    @Builder
    public PetType(Long id, String name){
        super(id);
        this.name=name;
    }

    @Override
    public String toString() {
        return name;
    }
}
