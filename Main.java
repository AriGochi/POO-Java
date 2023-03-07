import java.util.Scanner;
public class Main {
    public static void main(String args[])
    {
        System.out.println("Programa que recibe como entrada una cadena exactamente de 9 caracteres.");
        Scanner teclado = new Scanner(System.in);
        String juego = "";

        System.out.println("Escribe 9 caracteres entre X y O, por favor");
        juego = teclado.nextLine();

        int a = juego.length();

        if(a==9)
        {
            String mjuego = juego.toUpperCase();

            String a1 = mjuego.substring(0,3);
            String a2 = mjuego.substring(3,6);
            String a3 = mjuego.substring(6);

            System.out.println("Mucha suerte, que gane el mejor");
            System.out.print("-----\n|" + a1 + "|\n|" + a2 + "|\n|" + a3 + "|\n-----");

        }

        else
        {
            System.out.println("Solo introduzca 9 caracteres por favor");
        }
    }
}
