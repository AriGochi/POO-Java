import controlador.ControladorCompu;
import vista.VentanaComputadora;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        VentanaComputadora ventana = new VentanaComputadora("Tabla Computadoras");
        ControladorCompu controller = new ControladorCompu(ventana);
    }
}