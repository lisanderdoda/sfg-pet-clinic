package com.ld.springframework.sfgpetclinic.repositories;

import com.ld.springframework.sfgpetclinic.model.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetRepository extends CrudRepository<Vet, Long> {
}
