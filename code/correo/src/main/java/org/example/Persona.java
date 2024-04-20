package org.example;
import java.util.Scanner;

public class Persona {
    private String nombre;
    private String apellido;
    private Integer codigoPostal;
    private String Localidad;
    private TipoPersona tipo;

    public Integer getCodigoPostal() {
        return codigoPostal;
    }

    public String getNombre() {
        return nombre;
    }

    public Persona(String nombre, Integer codigoPostal) {
        this.nombre = nombre;
        this.codigoPostal = codigoPostal;
    }
}

