package org.viajes;

import org.lugares.Aeropuerto;
import org.personas.Pasajero;
import org.personas.Tripulacion;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class Vuelo {
    private Aeropuerto origen;
    private Aeropuerto destino;
    private LocalDateTime fechaHora;
    private Double duracion;
    private Avion avion;
    private List<Pasajero> pasajeros;
    private Tripulacion tripulacion;

    public Double duracionEnMins(){
        //TODO
    }

    // [DONE] -> Punto 1
    public Double capacidadOcupadaPorPasajeros(){
        return (this.cantPasajeros() * 100.00) / this.avion.cantAsientos();
    }

    public Integer cantPasajeros(){
        return this.pasajeros.size();
    }

    // llegaronEste

    public Boolean llegaronEste(LocalDate dia) {
        return this.getFecha().equals(dia);
    }

    public LocalDate getFecha() {
        return this.fechaHora.toLocalDate();
    }
    public Aeropuerto getDestino() {
        return destino;
    }

    public Aeropuerto getOrigen() {
        return origen;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }
}
