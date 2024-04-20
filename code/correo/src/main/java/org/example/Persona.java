package org.example;

public class Persona {
    private String nombre;
    private String apellido;
    private Integer codigoPostal;
    private String Localidad;
    private TipoPersona tipo;

    public Integer getCodigoPostal() {
        return codigoPostal;
    }

    public Persona(String nombre, String apellido, Integer codigoPostal) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.codigoPostal = codigoPostal;
    }
}

