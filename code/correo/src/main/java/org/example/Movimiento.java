package org.example;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Movimiento {
  private Sucursal sucursal;
  private LocalDateTime fecha;
  private Boolean tieneCatero;


public Movimiento(Sucursal sucursal, LocalDateTime fecha){
  this.sucursal = sucursal;
  this.fecha = fecha;
  this.tieneCatero = Boolean.FALSE;
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


