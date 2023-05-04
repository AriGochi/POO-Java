public class DriverVentana {
    public static void main(String[] args) {
        Ventana ventana = new Ventana();
        Ventana ventana2 = new Ventana(80,40,100);

        System.out.println(ventana2);
        boolean res = ventana2.cerrar(50);


        System.out.println("Cerrar la ventrana al: " + ventana2+ "%");
        System.out.println("cerrada: " + res);
        boolean res1 = ventana2.cerrar(100);
        System.out.println(res1);
    }
}
