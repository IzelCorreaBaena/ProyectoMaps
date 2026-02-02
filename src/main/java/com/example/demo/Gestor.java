package com.example.demo;

import org.springframework.stereotype.Service;

@Service // Indica que esta clase es un servicio gestionado por Spring
public class Gestor {

    public double calcularPromedio(double precio) {
        if (precio < 0) {
            throw new IllegalArgumentException("El precio no puede ser negativo");
        }
        return precio;
    }
}