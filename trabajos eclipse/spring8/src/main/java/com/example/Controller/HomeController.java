package com.example.Controller;

import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController

public class HomeController {
@GetMapping("/")
public List<String> checkParams(@RequestParam Map<String, String> allParams) {
    List<String> messages = new ArrayList<>();

    // Iterar sobre el mapa de parámetros y verificar cada uno
    for (Map.Entry<String, String> entry : allParams.entrySet()) {
        String paramName = entry.getKey();
        String paramValue = entry.getValue();

        // Verificar si el valor del parámetro no es null
        if (paramValue != null) {
            if (paramValue.isEmpty()) {
                String message = "Parameter '" + paramName + "' is empty!";
                messages.add(message);
                System.out.println(message); // Imprimir por consola
            } else {
                String message = "Parameter '" + paramName + "' is completed with value: " + paramValue;
                messages.add(message);
                System.out.println(message); // Imprimir por consola
            }
        } else {
            String message = "Parameter '" + paramName + "' is null!";
            messages.add(message);
            System.out.println(message); // Imprimir por consola
        }
    }

    // Devolver la lista de mensajes para mostrar en la web
    return messages;
}
}

	

