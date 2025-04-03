package org.lugares;

import org.viajes.Aerolinea;

public class Escala {
    private Aeropuerto aeropuerto;
    private Double duracion;

    public Double duracionEnMin(){
        return this.duracion * 60.00;
    }
}
