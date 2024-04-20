package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello World!");

        List<TipoEmpleado> empleados = new ArrayList<>();
        List<Envio> envios = new ArrayList<>();

        Persona coco = new Persona("coco", "menazzi",1);
        Persona lucia = new Persona("lucia", "gandur",2);

        Sucursal sucursalOrigen = new Sucursal(1, 1);
        Sucursal sucursalDestino = new Sucursal(1, 2);

        Envio envio = new Envio(coco, lucia, 15.2, 1);

        envio.registrarMovimiento(sucursalOrigen);
        System.out.println(envio.buscarUbicacionActual());

        envio.registrarMovimiento(sucursalDestino);
        System.out.println(envio.buscarUbicacionActual());
        ;
    }

}