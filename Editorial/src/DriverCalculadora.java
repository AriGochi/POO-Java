import java.util.concurrent.Callable;

public class DriverCalculadora {
    public static void main(String[] args) {
        Calculadora calcu = new Calculadora();
        Calculadora calcu2 = new Calculadora(10,2);

        calcu2.sumar();
        System.out.println("La suma da como resultado: " + calcu2.sumar());

        calcu2.restar();
        System.out.println("La resta da como resultado0: " + calcu2.restar());

        calcu2.multiplicacion();
        System.out.println("La multiplicacion da como resultado: " + calcu2.multiplicacion());

        calcu2.division();
        System.out.println("La division da como resultado: " + calcu2.division());
    }
}
