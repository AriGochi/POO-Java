public class DriverCalculadora {
    public static void main(String[] args) {
        Calculadora cal1 = new Calculadora(5,10);
        System.out.println("La suma da como resultado: ");
        cal1.suma();
        System.out.println(cal1);


        System.out.println("La multiplicacion da como resultado: ");
        cal1.multiplicar();
        System.out.println(cal1);

        System.out.println("La resta da como resultado: " );
        cal1.restar();
        System.out.println(cal1);

        System.out.println("La division da como resultado: ");
        cal1.dividir();
        System.out.println(cal1);




    }
}
