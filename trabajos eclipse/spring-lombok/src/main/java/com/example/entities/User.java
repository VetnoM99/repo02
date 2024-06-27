package com.example.entities;

import java.util.Date;

import lombok.Data;

   @Data// Anotación para generar un logger con Lombok
public class User {
    private int id;
    private String nombre;
    private String apellidos;
    private Date fechaNacimiento;
}
    // Método get modificado para registrar un mensaje de log info
 

