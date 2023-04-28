package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println("Programa Empleado");

        Empleado empleado1 = new Empleado("Panchito",320203307,1000,5,2);
        System.out.println(empleado1);
        double sueldoBase = empleado1.calcularSueldoBase();
        double sueldoConHorasExtra = empleado1.calcularSueldoConHorasExtra();
        System.out.println("Sueldo base: " + sueldoBase);
        System.out.println("Sueldo con horas extra: " + sueldoConHorasExtra);


    }
}