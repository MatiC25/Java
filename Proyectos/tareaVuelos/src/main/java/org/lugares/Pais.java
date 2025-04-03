package org.lugares;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Pais {
    private String nombre;
    private Continente continente;
    private List<Ciudad> ciudades;

    public Pais() {
        this.ciudades = new ArrayList<>();
    }

    public void agregarCiudades(Ciudad ... ciudad) {
        Collections.addAll(this.ciudades, ciudad);
    }

    // ciudadConMasPasajerosEnUnDia
    // [DONE] -> Punto 7
    public Ciudad ciudadConMasPasajerosEnUnDia(LocalDate unDia) {
        return this.ciudades.stream()
                .max(Comparator.comparingInt(c -> c.cantPasajerosQueLlegaronEnUnDia(unDia)))
                .orElse(null);
    }
}
