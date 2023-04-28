package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Calculadora ");
        Calculadora calcu = new Calculadora(5, 5);
        System.out.println("El resultado de la suma es: " + calcu.Sumar());
        System.out.println("El resultado de la rests es: " + calcu.Restar());
        System.out.println("El resultado de la multiplicacion es : " + calcu.Multiplicar());
        System.out.println("El resulytado de la division es " + calcu.Dividir());


        // Prueba 1: Suma de dos números positivos
        Calculadora c1 = new Calculadora(5, 10);
        System.out.println("Prueba 1 - Suma: " + c1.Sumar()); // Salida esperada: 15

        // Prueba 2: Suma de dos números negativos
        Calculadora c2 = new Calculadora(-5, -10);
        System.out.println("Prueba 2 - Suma: " + c2.Sumar()); // Salida esperada: -15

        // Prueba 3: Suma de un número positivo y otro negativo
        Calculadora c3 = new Calculadora(5, -10);
        System.out.println("Prueba 3 - Suma: " + c3.Sumar()); // Salida esperada: -5

        // Prueba 4: Suma de un número y cero
        Calculadora c4 = new Calculadora(5, 0);
        System.out.println("Prueba 4 - Suma: " + c4.Sumar()); // Salida esperada: 5

        // Prueba 5: Suma de dos números grandes
        Calculadora c5 = new Calculadora(999999999, 999999999);
        System.out.println("Prueba 5 - Suma: " + c5.Sumar()); // Salida esperada: 1999999998

        System.out.println("-------------------------");
        // Prueba 1: Resta de dos números positivos
        Calculadora c6 = new Calculadora(10, 5);
        System.out.println("Prueba 6 - Resta: " + c1.Restar()); // Salida esperada: 5

        // Prueba 2: Resta de dos números negativos
        Calculadora c7 = new Calculadora(-10, -5);
        System.out.println("Prueba 7 - Resta: " + c2.Restar()); // Salida esperada: -5

        // Prueba 3: Resta de un número positivo y otro negativo
        Calculadora c8 = new Calculadora(10, -5);
        System.out.println("Prueba 8 - Resta: " + c3.Restar()); // Salida esperada: 15

        // Prueba 4: Resta de un número y cero
        Calculadora c9 = new Calculadora(5, 0);
        System.out.println("Prueba 9 - Resta: " + c4.Restar()); // Salida esperada: 5

        // Prueba 5: Resta de dos números grandes
        Calculadora c10 = new Calculadora(999999999, 999999998);
        System.out.println("Prueba 10 - Resta: " + c5.Restar()); // Salida esperada: 1

        System.out.println("--------------------");
        // Prueba 1: Multiplicación de dos números positivos
        Calculadora c11 = new Calculadora(5, 10);
        System.out.println("Prueba 11 - Multiplicación: " + c1.Multiplicar()); // Salida esperada: 50

        // Prueba 2: Multiplicación de dos números negativos
        Calculadora c12 = new Calculadora(-5, -10);
        System.out.println("Prueba 12 - Multiplicación: " + c2.Multiplicar()); // Salida esperada: 50

        // Prueba 3: Multiplicación de un número positivo y otro negativo
        Calculadora c13 = new Calculadora(5, -10);
        System.out.println("Prueba 13 - Multiplicación: " + c3.Multiplicar()); // Salida esperada: -50

        // Prueba 4: Multiplicación de un número y cero
        Calculadora c14 = new Calculadora(5, 0);
        System.out.println("Prueba 14 - Multiplicación: " + c4.Multiplicar()); // Salida esperada: 0

        // Prueba 5: Multiplicación de dos números grandes
        Calculadora c15 = new Calculadora(999999999, 999999999);
        System.out.println("Prueba 15 - Multiplicación: " + c5.Multiplicar()); // Salida esperada: 999999998000000001

        System.out.println("------------------");
        // Prueba 1: División de dos números positivos
        Calculadora c16 = new Calculadora(10, 5);
        System.out.println("Prueba 16 - División: " + c1.Dividir()); // Salida esperada: 2

        // Prueba 2: División de dos números negativos
        Calculadora c17 = new Calculadora(-10, -5);
        System.out.println("Prueba 17 - División: " + c2.Dividir()); // Salida esperada: 2

        // Prueba 3: División de un número positivo y otro negativo
        Calculadora c18  = new Calculadora(10, -5);
        System.out.println("Prueba 18 - División: " + c3.Dividir()); // Salida esperada: -2

        // Prueba 4: División de un número y cero (debe arrojar una excepción)
        Calculadora c19 = new Calculadora(5, 0);
        try {
            System.out.println("Prueba 4 - División: " + c4.Dividir());
        } catch (ArithmeticException e) {
            System.out.println("Prueba 19 - División: No se puede dividir por cero");
        }

        // Prueba 5: División de dos números grandes
        Calculadora c20 = new Calculadora(999999999, 3);
        System.out.println("Prueba 20 - División: " + c5.Dividir()); // Salida esperada: 333333333

    }
}

