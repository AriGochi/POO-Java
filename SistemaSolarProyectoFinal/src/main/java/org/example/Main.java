package org.example;

import org.example.controlador.ControladorSistemaSolar;
import org.example.vista.VentanaPlaneta;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        VentanaPlaneta view = new VentanaPlaneta("MVC Y JDBC");
        ControladorSistemaSolar controller = new ControladorSistemaSolar(view);
    }
}