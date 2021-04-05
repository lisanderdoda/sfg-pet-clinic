package com.ld.springframework.sfgpetclinic.repositories;

import com.ld.springframework.sfgpetclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OwnerRepository extends CrudRepository<Owner,Long> {

    Owner findByLastName(String lasName);
    List<Owner> findAllByLastNameLike(String lastName);
}
