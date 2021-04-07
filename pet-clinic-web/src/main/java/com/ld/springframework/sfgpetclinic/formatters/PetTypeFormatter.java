package com.ld.springframework.sfgpetclinic.formatters;

import com.ld.springframework.sfgpetclinic.model.PetType;
import com.ld.springframework.sfgpetclinic.services.PetTypeService;
import org.springframework.format.Formatter;

import java.text.ParseException;
import java.util.Collection;
import java.util.Locale;

public class PetTypeFormatter implements Formatter<PetType> {

    private final PetTypeService petTypeService;

    public PetTypeFormatter(PetTypeService petTypeService) {
        this.petTypeService = petTypeService;
    }

    @Override
    public PetType parse(String text, Locale locale) throws ParseException {
        Collection<PetType> findPetTypes = petTypeService.findAll();
        for(PetType type : findPetTypes){
            if(type.getName().equals(text)){
                return type;
            }
        }
        throw new ParseException("type not found "+ text, 0);
    }

    @Override
    public String print(PetType petType, Locale locale) {
        return petType.getName();
    }
}
