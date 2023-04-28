package org.example;

public class Calculadora {
    private int a;

    private int b;

    public Calculadora() {
    }

    public Calculadora(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "Calculadora{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }

    public int Sumar() {
        return a + b;
    }

    public int Restar() {
        return a - b;
    }
    public int Multiplicar(){
        return a * b;
    }
    public int Dividir () {
        int c = 0;
        if (b != 0){
            c = a/b;
        } else{
            System.out.println("No se puede realizar la division en cero");
            c = 0;
        }
        return c;
    }


}
