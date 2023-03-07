import java.awt.*;
import java.lang.String;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n Automovil");
        Automovil auto1 = new Automovil("Volkswagen", " nivus", (byte) 63, "Negro");
        System.out.println(auto1);
        auto1.encender();
        auto1.apagar();
        auto1.viajar();

        //Separacion
        System.out.println("\n Persona");
        Persona o1 = new Persona(19, "Ari", 1.58, 52.5, "Femenino");
        System.out.println(o1);
        o1.comer();
        o1.bailar();
        o1.bañar();

        //Separacion
        System.out.println("\n Monitor");
        Monitor m1 = new Monitor(20.2,"HP","3229Lg","Elite", 15.700);
        System.out.println(m1);
        m1.encender();
        m1.apagar();
        m1.proyectar();

        //Separacion

        System.out.println("\n Telefono");
        Telefono t1 = new Telefono("Motorola",6,"Negro");
        System.out.println(t1);
        t1.encender();
        t1.comunicar();
        t1.Apagar();


    }
}