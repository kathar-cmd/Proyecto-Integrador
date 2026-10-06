package com.example.application.examplefeature;

/**
 * LibroService
 */

import java.util.ArrayList;
import java.util.List;

public class LibroService {
    private List<Libro> libros = new ArrayList<>();

    public LibroService() {
        libros.add(new Libro(1, "Don Quijote de la Mancha", "Novela", "Literatura"));
        libros.add(new Libro(2, "El Principito", "Fábula", "Infantil"));
        libros.add(new Libro(3, "La Metamorfosis", "Novela", "Literatura"));
        libros.add(new Libro(4, "La Divina Comedia", "Poema épico", "Clásicos"));
        libros.add(new Libro(5, "El Bazar de los Malos", "Ficción", "Contemporánea"));
        libros.add(new Libro(6, "El Extranjero", "Ficción", "Existencialismo"));
        libros.add(new Libro(7, "La Odisea", "Poema épico", "Clásicos"));
        libros.add(new Libro(8, "La Peste", "Ficción alegórica", "Existencialismo"));
        libros.add(new Libro(9, "El Mito de Sísifo", "filosofía del absurdo", "Filosofía"));
        libros.add(new Libro(10, "El Diario de Ana Frank", "autobiografía", "Historia"));
        libros.add(new Libro(11, "Indigno de ser humano", "literatura existencialista", "Literatura japonesa"));
        libros.add(new Libro(12, "Hamlet", "Tragedia teatral", "Teatro"));
    }

    public List<Libro> obtenerLibros() {
        return libros;
    }

    public List<Libro> obtenerPorSeccion(String seccion) {
        List<Libro> resultado = new ArrayList<>();
        for (Libro l : libros) {
            if (l.getSeccion().equalsIgnoreCase(seccion)) {
                resultado.add(l);
            }
        }
        return resultado;
    }
}
