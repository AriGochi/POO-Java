public class Main {
    public static void main(String[] args) {
        System.out.println("Compudabo!");

        Computadora com1 = new Computadora();
        Computadora com2 = new Computadora(
                "Active cool",
                "Patito 2",
                new Monitor(),
                new Mouse(),
                new Teclado(),
                new Cpu()
        );
        System.out.println(com1);
        System.out.println(com2);
        Computadora com3 = new Computadora(
          "HP",
          "Pavillon 5000",
          new Monitor("HP", "HPView",21.1),
          new Mouse("Logitech", "GT300","gamer"),
          new Teclado("Logitech", "LT300", 1,2),
          new Cpu("intel","i9",8.5)
        );
        System.out.println(com3);
        com3.getProcesador().setFrecuencia(4.6);
        System.out.println(com3);
        com3.getRaton().setTipo("de Oficina");
        System.out.println(com3);
        com3.setKeyboard(new Teclado("Gamefactor","k400",2,2));
        System.out.println(com3);
    }
}