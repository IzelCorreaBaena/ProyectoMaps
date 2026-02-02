package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController // 1. Esto le dice a Spring: "Soy una web, escúchame"
public class HolaController {

    @Autowired
    private Gestor gestor; // 4. Aquí le decimos a Spring que queremos usar

    @GetMapping("/calcular")
    public String calcularweb(@RequestParam double precio) { // 5. Nueva puerta para calcular promedio
        double resultado = gestor.calcularPromedio(precio); // 6. Usamos el servicio Gestor
        return "El promedio calculado es: " + resultado;
    }
}

