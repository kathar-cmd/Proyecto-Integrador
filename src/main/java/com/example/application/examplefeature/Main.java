package com.example.application.examplefeature;

public class Main {
    public static void main(String[] args) {
        LibroService service = new LibroService();

        System.out.println("📚 Catálogo de libros:");
        for (Libro l : service.obtenerLibros()) {
            System.out.println(l);
        }

        System.out.println("\n🔎 Libros en la sección 'Clásicos':");
        for (Libro l : service.obtenerPorSeccion("Clásicos")) {
            System.out.println(l);
        }
    }
}
