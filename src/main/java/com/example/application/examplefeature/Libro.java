package com.example.application.examplefeature;

public class Libro {
    private int idlibro;
    private String nombre;
    private String genero;
    private String seccion;

    // Constructor
    public Libro(int idlibro, String nombre, String genero, String seccion) {
        this.idlibro = idlibro;
        this.nombre = nombre;
        this.genero = genero;
        this.seccion = seccion;
    }

    // Getters y Setters
    public int getIdlibro() {
        return idlibro;
    }

    public void setIdlibro(int idlibro) {
        this.idlibro = idlibro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    // Para imprimir bonito el objeto
    @Override
    public String toString() {
        return "Libro{" +
                "id=" + idlibro +
                ", nombre='" + nombre + '\'' +
                ", genero='" + genero + '\'' +
                ", seccion='" + seccion + '\'' +
                '}';
    }
}
