package com.spring.RS1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController

public class DeletePersona {

    @Autowired
    Servicio servicio;

    @RequestMapping(value="/persona/{id}", method = RequestMethod.DELETE)


    public String deletePersona(@PathVariable Integer id){
        servicio.deletePersona(servicio.getPersonaID(id));
        return "Persona eliminada";
    }
}
