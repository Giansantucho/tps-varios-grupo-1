package org.example;

import java.time.LocalDate;

public class Movimiento {
  private Sucursal sucursal;
  private LocalDate fecha;
  private Boolean tieneCatero;


public Movimiento(Sucursal sucursal, LocalDate fecha){
  this.sucursal = sucursal;
  this.fecha = fecha;
}

  public Boolean getTieneCatero() {
    return tieneCatero;
  }

  public void setTieneCatero(Boolean tieneCatero) {
    this.tieneCatero = tieneCatero;
  }

  public Sucursal getSucursal(){
  return sucursal;
}


}


