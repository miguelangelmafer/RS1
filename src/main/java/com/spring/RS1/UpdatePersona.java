package com.spring.RS1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController

public class UpdatePersona {

    @Autowired
    Servicio servicio;

    @RequestMapping(value="/persona/{id}", method = RequestMethod.PUT)

    public String updatePersona(@PathVariable ("id") Long id, @RequestBody Persona p){
        Persona oldPerson = servicio.getPersonaID(id);
        servicio.updatePersona(oldPerson,p);
        return "Persona modificada";
    }
}
