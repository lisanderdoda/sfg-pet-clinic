package com.ld.springframework.sfgpetclinic.bootstrap;

import com.ld.springframework.sfgpetclinic.model.Owner;
import com.ld.springframework.sfgpetclinic.model.PetType;
import com.ld.springframework.sfgpetclinic.model.Vet;
import com.ld.springframework.sfgpetclinic.services.OwnerService;
import com.ld.springframework.sfgpetclinic.services.PetTypeService;
import com.ld.springframework.sfgpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {

        PetType dog =new PetType();
        dog.setName("Dog");
        PetType savedDogPetType = petTypeService.save(dog);

        PetType cat =new PetType();
        dog.setName("Cat");
        PetType savedCatPetType = petTypeService.save(cat);

        Owner owner1= new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");
        ownerService.save(owner1);
        Owner owner2=new Owner();
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenanne");
        ownerService.save(owner2);

        Vet vet1= new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");
        vetService.save(vet1);

        Vet vet2= new Vet();
        vet2.setFirstName("Jessie");
        vet2.setLastName("Porter");
        vetService.save(vet2);

        Vet vet3 = new Vet();
        vet3.setFirstName("Lisander");
        vet3.setLastName("Doda");
        vetService.save(vet3);

    }
}
