package com.spring.RS1;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service

public class Servicio {
    ArrayList<Persona> listaPersonas = new ArrayList<>();

    public Servicio(){

    }

    public void addPersona(Persona p){
        p.setId(listaPersonas.stream().count()+1);
        listaPersonas.add(p);
    }

    public Persona getPersonaID(long id){
        Persona persona = listaPersonas.stream()
                .filter(p->p.getId().equals(id))
                .findFirst().orElse(null);
                return persona;
    }

    public Persona getPersonaNombre(String name){
        Persona persona = listaPersonas.stream()
                .filter(p->p.getNombre().equals(name))
                .findFirst().orElse(null);
        return persona;
    }


    public void deletePersona(Persona p){
        listaPersonas.remove(p);
    }

    public void updatePersona(Persona personaOld, Persona personaNew) {
        Optional<Persona> o = Optional.of(personaNew);

        personaOld.setEdad(o.map(Persona::getEdad).orElse(personaOld.getEdad()));
        personaOld.setNombre(o.map(Persona::getNombre).orElse(personaOld.getNombre()));
        personaOld.setPoblacion(o.map(Persona::getPoblacion).orElse(personaOld.getPoblacion()));

    }



}
