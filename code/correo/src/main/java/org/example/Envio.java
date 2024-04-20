package org.example;

import java.rmi.MarshalledObject;
import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.util.ArrayList;
import java.util.List;


public class Envio {

  protected Persona destinatario;
  protected Persona remitente;
  protected Double precio;
  protected Integer codigoRastreo;
  protected TipoEmpleado cartero;
  protected List<Movimiento> camino;
  protected Boolean entregado;

  public void registrarMovimiento(Sucursal sucursal){
    
      LocalDate fecha = LocalDate.now();
      Movimiento movimiento = new Movimiento(sucursal, fecha);
      
      this.camino.add(movimiento);

      if (sucursal.getCodigoPostal() == destinatario.getCodigoPostal()){
        ultimoMovimiento().setTieneCatero(Boolean.TRUE);
      }
  }

  public Movimiento ultimoMovimiento(){
    Integer ultimo = this.camino.size() - 1;

    return this.camino.get(ultimo);
  }

  public Sucursal buscarUbicacionActual(){

    return ultimoMovimiento().getSucursal();

  }

  public Envio(Persona remitente, Persona destinatario, Double precio, Integer codigoRastreo) {
    this.destinatario = destinatario;
    this.remitente = remitente;
    this.precio = precio;
    this.codigoRastreo = codigoRastreo;
    this.camino = new ArrayList<>();
    this.entregado = Boolean.FALSE;
  }
}
