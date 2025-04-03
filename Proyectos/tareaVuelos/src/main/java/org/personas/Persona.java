package org.personas;

public abstract class Persona {
    protected String nombre;
    protected String apellido;
    protected Integer nroDeDocumento;
    protected TipoDocumento tipoDocumento;

    public Persona(String nombre) {
        this.nombre = nombre;
    }
}
