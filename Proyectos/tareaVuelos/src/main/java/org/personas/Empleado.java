package org.personas;

import org.viajes.Aerolinea;

public class Empleado extends Persona {
    private Cargo cargo;
    private Aerolinea empleador;

    public Empleado(String nombre) {
        super(nombre);
    }
}
