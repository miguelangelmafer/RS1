package com.spring.RS1;


public class Persona {

    private Long id;
    private String nombre, poblacion;
    private Integer edad;

    public Persona(Long id, String nombre, String poblacion, Integer edad){
        this.id = id;
        this.nombre=nombre;
        this.poblacion=poblacion;
        this.edad=edad;
    }

    public Persona(){

    }

    public String getNombre() {
        return nombre;
    }

    public String getPoblacion() {
        return poblacion;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
