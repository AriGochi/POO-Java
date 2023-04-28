package org.example;

public class Empleado {
    private String nombre;

    private int numTrabajador;

    private double sueldoDiario;

    private int diasTrabajados;

    private int horasExtras;

    public Empleado() {
    }

    public Empleado(String nombre, int numTrabajador, double sueldoDiario, int diasTrabajados, int horasExtras) {
        this.nombre = nombre;
        this.numTrabajador = numTrabajador;
        this.sueldoDiario = sueldoDiario;
        this.diasTrabajados = diasTrabajados;
        this.horasExtras = horasExtras;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumTrabajador() {
        return numTrabajador;
    }

    public void setNumTrabajador(int numTrabajador) {
        this.numTrabajador = numTrabajador;
    }

    public double getSueldoDiario() {
        return sueldoDiario;
    }

    public void setSueldoDiario(double sueldoDiario) {
        this.sueldoDiario = sueldoDiario;
    }

    public int getDiasTrabajados() {
        return diasTrabajados;
    }

    public void setDiasTrabajados(int diasTrabajados) {
        this.diasTrabajados = diasTrabajados;
    }

    public int getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(int horasExtras) {
        this.horasExtras = horasExtras;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", numTrabajador=" + numTrabajador +
                ", sueldoDiario=" + sueldoDiario +
                ", diasTrabajados=" + diasTrabajados +
                ", horasExtras=" + horasExtras +
                '}';
    }

    public double calcularSueldoBase() {
        return sueldoDiario * diasTrabajados;
    }

    public double calcularSueldoConHorasExtra() {
        double sueldoBase = calcularSueldoBase();
        double sueldoHorasExtra = 250 * horasExtras;
        return sueldoBase + sueldoHorasExtra;


    }

}
