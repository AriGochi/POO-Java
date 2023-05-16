import controlador.ControladorSumas;
import vista.VentanaSumas;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        VentanaSumas ventanaSumas = new VentanaSumas("MVC SUMAS");
        ControladorSumas controler = new ControladorSumas(ventanaSumas);

    }
}