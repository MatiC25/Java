package org.lugares;

import org.viajes.Vuelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ciudad {

    private String nombre;
    private Pais pais;
    private List<Aeropuerto> aeropuertos;

    public Ciudad(String nombre) {
        this.nombre = nombre;
        this.aeropuertos = new ArrayList<Aeropuerto>();
    }


    // Cantidad de Aeropuertos
    // [DONE] -> Punto 6
    public Integer cantidadAeropuertos() {
        return this.aeropuertos.size();
    }

    // cantPasajerosQueLlegaronEnUnDia
    public Integer cantPasajerosQueLlegaronEnUnDia(LocalDate unDia) {
        return this.aeropuertos.stream()
                .flatMap(a -> a.vuelosQueLlegaronElDia(unDia).stream())
                .mapToInt(Vuelo::cantPasajeros)  // Los dos :: es lo que se llama la
                                                // referencia a un metodo, es como una variación a la funcion lambda
                                               // mapToInt(v -> v.cantPasajeros())
                .sum();
    }

    // agregarAeropuertos

    public void agregarAeropuertos(Aeropuerto ... aeropuerto) {
        Collections.addAll(this.aeropuertos, aeropuerto);
    }
}
