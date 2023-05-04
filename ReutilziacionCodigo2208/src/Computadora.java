public class Computadora {

    private String marca;
    private String modelo;
    private Monitor pantalla;
    private Mouse raton;
    private Teclado keyboard;
    private  Cpu procesador;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Monitor getPantalla() {
        return pantalla;
    }

    public void setPantalla(Monitor pantalla) {
        this.pantalla = pantalla;
    }

    public Mouse getRaton() {
        return raton;
    }

    public void setRaton(Mouse raton) {
        this.raton = raton;
    }

    public Teclado getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Teclado keyboard) {
        this.keyboard = keyboard;
    }

    public Cpu getProcesador() {
        return procesador;
    }

    public void setProcesador(Cpu procesador) {
        this.procesador = procesador;
    }

    public Computadora(String marca, String modelo, Monitor pantalla, Mouse raton, Teclado keyboard, Cpu procesador) {
        this.marca = marca;
        this.modelo = modelo;
        this.pantalla = pantalla;
        this.raton = raton;
        this.keyboard = keyboard;
        this.procesador = procesador;
    }

    public Computadora() {
    }

    @Override
    public String toString() {
        return "Computadora{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", pantalla=" + pantalla +
                ", raton=" + raton +
                ", keyboard=" + keyboard +
                ", procesador=" + procesador +
                '}';

    }
}
