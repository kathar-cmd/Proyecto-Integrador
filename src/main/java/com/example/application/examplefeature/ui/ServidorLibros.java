package com.example.application.examplefeature.ui;

import com.example.application.examplefeature.Libro;
import com.example.application.examplefeature.LibroService;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

public class ServidorLibros {
    public static void main(String[] args) throws IOException {
        HttpServer server = HttpServer.create(new InetSocketAddress(8080), 0);
        server.createContext("/libros", new LibroHandler());
        server.setExecutor(null);
        server.start();
        System.out.println("✅ Servidor iniciado en http://localhost:8080/libros");
    }

    static class LibroHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange exchange) throws IOException {
            LibroService service = new LibroService();
            StringBuilder response = new StringBuilder();

            for (Libro libro : service.obtenerLibros()) {
                response.append(libro.toString()).append("\n");
            }

            byte[] responseBytes = response.toString().getBytes("UTF-8");
            exchange.sendResponseHeaders(200, responseBytes.length);
            try (OutputStream output = exchange.getResponseBody()) {
                output.write(responseBytes);
            }
        }
    }
}
