package com.spring.RS1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController

public class SelectPersona {

    @Autowired
    Servicio servicio;

    @RequestMapping(value="/persona/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Persona selectPersonaID(@PathVariable Integer id){
       return servicio.getPersonaID(id);
    }

    @RequestMapping(value="persona/nombre/{nombre}", method = RequestMethod.GET)
    public Persona selectPersonNombre(@PathVariable String nombre){
        return servicio.getPersonaNombre(nombre);
    }

}
