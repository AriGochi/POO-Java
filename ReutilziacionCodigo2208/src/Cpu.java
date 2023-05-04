public class Cpu {
private String marca;

private String modelo;

private double Frecuencia;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getFrecuencia() {
        return Frecuencia;
    }

    public void setFrecuencia(double frecuencia) {
        Frecuencia = frecuencia;
    }

    public Cpu(String marca, String modelo, double frecuencia) {
        this.marca = marca;
        this.modelo = modelo;
        Frecuencia = frecuencia;
    }

    public Cpu() {
    }

    @Override
    public String toString() {
        return "Cpu{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", Frecuencia=" + Frecuencia +
                '}';

    }
}

