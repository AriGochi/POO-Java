public class Automovil extends Vehiculo {
    protected String marca;
    protected int numeroDePuertas;
    protected String color;


    public Automovil() {
    }

    public Automovil(String tipo, String tamano, String velocidadmaxima,
                     String marca, int numeroDePuertas, String color) {
        super(tipo, tamano, velocidadmaxima);
        this.marca = marca;
        this.numeroDePuertas = numeroDePuertas;
        this.color = color;
    }


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getNumeroDePuertas() {
        return numeroDePuertas;
    }

    public void setNumeroDePuertas(int numeroDePuertas) {
        this.numeroDePuertas = numeroDePuertas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public void encender() {
        System.out.println("El automovil esta encendido");
    }

    public void activarLimpiaparabrisas() {
        System.out.println("El automovil esta limpiando el parabrisas");
    }


    @Override
    public String toString() {
        return "Automovil{" +
                "marca='" + marca + '\'' +
                ", numeroDePuertas=" + numeroDePuertas +
                ", color='" + color + '\'' +
                ", tipo='" + tipo + '\'' +
                ", tamano='" + tamano + '\'' +
                ", velocidadmaxima='" + velocidadmaxima + '\'' +
                '}';
    }


    @Override
    public void acelerar() {
        System.out.println("El Automovil esta acelerando");
    }

    @Override
    public void frenar() {
        System.out.println("El Automovil está frenando");
    }
}
