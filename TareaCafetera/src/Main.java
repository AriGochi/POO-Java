import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        MaquinaDeCafe caf = new MaquinaDeCafe();
        Scanner entradacaf = new Scanner(System.in);

        System.out.println("Tarea 8: Máquina de café");
        System.out.println("Ariadna Gochi Gutierrez\n ");
        while (true) {
            System.out.println("Hola, Mucho gusto");
            System.out.println("¿Que tipo de cafe deseas ordenar?\nTenemos: americano, expreso y capuchino\n" +
                    "o escribe \"estado\" para ver las cantidades de la maquina\n");
            String tipo = entradacaf.nextLine();


            if (tipo.equals("salir")) {
                break;
            }



            caf.hacerCafe(tipo);
        }
    }
}

