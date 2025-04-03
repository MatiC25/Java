package org.personas;

import org.viajes.Vuelo;

import java.time.LocalDate;
import java.util.List;

public class Tripulacion {
    private String nombre;
    private List<Empleado> empleados;
    private List<Vuelo> vuelos;

    public void agregarEmpleado(Empleado empleado) {
        //TODO
    }

    // [DONE] -> Punto 9
    public Integer cantVuelosEntre(LocalDate fechaInicial, LocalDate fechaFinal) {
        return (int) this.vuelos.stream()
                .filter(v -> v.getFecha().isAfter(fechaInicial) && v.getFecha().isBefore(fechaFinal))
                .count();
    }
}
