public class Teclado {

    private String marca;

    private  String modelo;

    private  int  numeroDeTeclas;
    private int multimedia;

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

    public int getNumeroDeTeclas() {
        return numeroDeTeclas;
    }

    public void setNumeroDeTeclas(int numeroDeTeclas) {
        this.numeroDeTeclas = numeroDeTeclas;
    }

    public int getMultimedia() {
        return multimedia;
    }

    public void setMultimedia(int multimedia) {
        this.multimedia = multimedia;
    }

    public Teclado(String marca, String modelo, int numeroDeTeclas, int multimedia) {
        this.marca = marca;
        this.modelo = modelo;
        this.numeroDeTeclas = numeroDeTeclas;
        this.multimedia = multimedia;
    }

    public Teclado() {
    }

    @Override
    public String toString() {
        return "Teclado{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", numeroDeTeclas=" + numeroDeTeclas +
                ", multimedia=" + multimedia +
                '}';

    }
}
