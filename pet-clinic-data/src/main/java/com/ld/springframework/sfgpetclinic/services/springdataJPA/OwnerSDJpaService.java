package com.ld.springframework.sfgpetclinic.services.springdataJPA;

import com.ld.springframework.sfgpetclinic.model.Owner;
import com.ld.springframework.sfgpetclinic.repositories.OwnerRepository;
import com.ld.springframework.sfgpetclinic.repositories.PetRepository;
import com.ld.springframework.sfgpetclinic.repositories.PetTypeRepository;
import com.ld.springframework.sfgpetclinic.services.OwnerService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class OwnerSDJpaService implements OwnerService {

    private final PetRepository petRepository;
    private final PetTypeRepository petTypeRepository;
    private final OwnerRepository ownerRepository;

    public OwnerSDJpaService(PetRepository petRepository, PetTypeRepository petTypeRepository,
                             OwnerRepository ownerRepository) {
        this.petRepository = petRepository;
        this.petTypeRepository = petTypeRepository;
        this.ownerRepository = ownerRepository;
    }

    @Override
    public Set<Owner> findAll() {
        Set<Owner> ownerSet = new HashSet<>();
        ownerRepository.findAll().forEach(ownerSet::add);
        return ownerSet;
    }

    @Override
    public Owner findById(Long aLong) {
        return ownerRepository.findById(aLong).orElse(null);
    }

    @Override
    public Owner save(Owner object) {

        return ownerRepository.save(object);
    }

    @Override
    public void delete(Owner object) {
        ownerRepository.delete(object);

    }

    @Override
    public void deleteById(Long aLong) {
        ownerRepository.deleteById(aLong);

    }

    @Override
    public Owner findByLastName(String lastName) {
        return ownerRepository.findByLastName(lastName);
    }

    @Override
    public List<Owner> findAllByLastNameLike(String lastName) {
        return ownerRepository.findAllByLastNameLike(lastName);
    }
}
