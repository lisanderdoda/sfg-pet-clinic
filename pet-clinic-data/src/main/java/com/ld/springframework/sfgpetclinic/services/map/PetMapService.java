package com.ld.springframework.sfgpetclinic.services.map;

import com.ld.springframework.sfgpetclinic.model.Pet;
import com.ld.springframework.sfgpetclinic.services.CrudService;
import com.ld.springframework.sfgpetclinic.services.PetService;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
public class PetMapService extends AbstractMapService<Pet,Long> implements PetService {

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Pet save(Pet object) {
        super.save(object);
        return object;
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);

    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
