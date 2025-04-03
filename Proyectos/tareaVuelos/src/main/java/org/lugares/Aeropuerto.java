package org.lugares;

import org.viajes.Aerolinea;
import org.viajes.Vuelo;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class Aeropuerto {
    private String nombre;
    private String codigoInternacional;
    private Ciudad ciudad;
    private List<Vuelo> vuelos;


    public List<Vuelo> vuelosQueLlegaronElDia(LocalDate dia) {
        return this.vuelos.stream()
                .filter(v -> v.llegaronEste(dia))
                .collect(Collectors.toList());
    }

    // [DONE] -> Punto 3

    public Integer cantVuelosQueLlegaronElDia(LocalDate dia) {
        return (int) this.vuelosQueLlegaronElDia(dia).stream()
                .filter(v -> this.equals(v.getDestino()))
                .count();
    }

    public Integer cantVuelosQuePartieronElDia(LocalDate dia) {
        return (int) this.vuelosQueLlegaronElDia(dia).stream()
                .filter(v -> this.equals(v.getOrigen()))
                .count();
    }

    public Ciudad getCiudad() {
        return ciudad;
    }
}

