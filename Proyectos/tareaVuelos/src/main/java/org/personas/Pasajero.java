package org.personas;
pack
import org.lugares.Ciudad;
import org.lugares.Pais;
import org.viajes.Vuelo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class Pasajero extends Persona {
    private List<Vuelo> vuelos;
    private Integer nroDePasaporte;
    private Pais pais;

    public Pasajero(String nombre) {
        super(nombre);
    }

    public List<Vuelo> vuelosRealizados() {
        return vuelos.stream()
                .filter(v -> v.getFechaHora().toLocalDate().isBefore(LocalDate.now()))
                .toList();
    }

    // cantVuelosRealizados
    // Suponiendo que un vuelo se considera realizado si la fecha y hora de salida es anterior a la fecha actual
    // [DONE] -> Punto 5
    public Integer cantVuelosRealizados() {
        return this.vuelosRealizados().size();
    }

    // [DONE] -> Punto 8
    public Integer cantVecesQueVisitaste(Ciudad ciudad){
        return (int) this.vuelosRealizados().stream()
                .filter(v -> v.getDestino().getCiudad().equals(ciudad))
                .count();
    }

}
