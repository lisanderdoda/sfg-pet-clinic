package com.ld.springframework.sfgpetclinic.repositories;

import com.ld.springframework.sfgpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
