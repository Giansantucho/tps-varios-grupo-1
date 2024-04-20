package org.example;

import java.util.ArrayList;
import java.util.List;

public class Sucursal{
  private Integer numero;
  private String localidad;
  private String domicilio;
  private List<TipoEmpleado> empleados;
  private List<Envio> envios;
  private Integer codigoPostal;

  public Integer getCodigoPostal() {
    return codigoPostal;
  }

  public Sucursal(Integer numero, Integer codigoPostal) {
    this.numero = numero;
    this.codigoPostal = codigoPostal;
  }
}
