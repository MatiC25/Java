package org.viajes;

import java.util.List;

public class Aerolinea {
    private String nombre;
    private List<Avion> aviones;
    private List<Viaje> viajes;

    // [DONE] -> Punto 10
    public Integer cantPsajerosTotales(Integer mes) {
        return (int) this.viajes.stream()
                .filter(v -> v.getFechaSalida().getMonthValue() == mes)
                .mapToInt(Viaje::cantPasajerosTotales)
                .sum();
    }
}
