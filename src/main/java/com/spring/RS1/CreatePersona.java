package com.spring.RS1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController


public class CreatePersona {

    @Autowired
    Servicio servicio;

    @RequestMapping(value="/persona", method = RequestMethod.POST)

    @ResponseBody
    public String addPersona(@RequestBody Persona p){
        servicio.addPersona(p);
        return "Persona añadida";
    }
}
