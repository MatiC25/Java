package org.viajes;

import org.lugares.Escala;

import java.time.LocalDateTime;
import java.util.List;

public class Viaje {
    private List<Vuelo> vuelos;
    private List<Escala> escalas;
    private LocalDateTime fechaSalida;
    private Aerolinea aerolinea;

    public Integer cantPasajerosTotales(){
        return this.vuelos.stream()
                .mapToInt(Vuelo::cantPasajeros)
                .sum();
    }

    public LocalDateTime getFechaSalida() {
        return fechaSalida;
    }

    public Double duracionTotalEnMin(){
        //TODO
    }


}
