public class Main {
    public static void main(String[] args) {

        Vehiculo vehiculo = new Vehiculo("Automovil", "mediano", "320 km/h");
        System.out.println("\n" + vehiculo  );

        vehiculo.acelerar();
        vehiculo.frenar();

        Automovil automovil = new Automovil("Automovil", "mediano", "120 km/h",
                "Chevrolet", 4, "azul");
        System.out.println("\n" + automovil);

        automovil.acelerar();
        automovil.frenar();
        automovil.activarLimpiaparabrisas();
        automovil.encender();

        Taxi taxi = new Taxi("Automovil", "mediano", "70 km/h",
                "nissan", 4, "rosa con blanco",
                3, 13.26, true);
        System.out.println("\n" + taxi);

        taxi.acelerar();
        taxi.frenar();
        taxi.activarLimpiaparabrisas();
        taxi.encender();
        taxi.cobrar();
        taxi.seguirRuta();


    }

    }
