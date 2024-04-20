package domain.todo;

import java.text.CollationElementIterator;
import java.util.List;
import java.util.Collections;

public class Envio {
  private Sucursal sucursal;
  private Pais pais;
  private List<Aeropuerto> aeropuertos;


  // se pueden agregar varios o uno, solo sirve cuando es unico parametro
  public void agregarAeropuertos(Aeropuerto ... aeropuertos){
    Collections.addAll(this.aeropuertos, aeropuertos);
  }


}
