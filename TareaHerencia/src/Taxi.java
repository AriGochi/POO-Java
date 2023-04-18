public class Taxi extends Automovil {

    private int pasajeros;
    private double tarifa;
    private boolean disponible;



    public Taxi() {
    }

    public Taxi(String tipo, String tamano, String velocidadmaxima,
                String marca, int numeroDePuertas, String color,
                int pasajeros, double tarifa, boolean disponible) {
        super(tipo, tamano, velocidadmaxima, marca, numeroDePuertas, color);
        this.pasajeros = pasajeros;
        this.tarifa = tarifa;
        this.disponible = disponible;
    }


    public int getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }


    public void cobrar() {
        System.out.println("El taxi te cobra de mas");
    }

    public void seguirRuta() {
        System.out.println("El taxi esta siguiendo la ruta");
    }



    @Override
    public String toString() {
        return "Taxi{" +
                "pasajeros=" + pasajeros +
                ", tarifa=" + tarifa +
                ", disponible=" + disponible +
                ", marca='" + marca + '\'' +
                ", numeroDePuertas=" + numeroDePuertas +
                ", color='" + color + '\'' +
                ", tipo='" + tipo + '\'' +
                ", tamano='" + tamano + '\'' +
                ", velocidadmaxima='" + velocidadmaxima + '\'' +
                '}';
    }


    @Override
    public void acelerar() {
        System.out.println("El taxi esta acelerando");
    }

    @Override
    public void frenar() {
        System.out.println("El taxi está frenando");
    }

    @Override
    public void activarLimpiaparabrisas() {
        System.out.println("El taxi activo el limpiaparabrisas");
    }

    @Override
    public void encender() {
        System.out.println("El taxi está encendiendo");
    }


}
