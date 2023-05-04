package polimorfismo;

public class Toy {
    protected String marca;
    protected String tamanio;
    protected String sonido;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public String getSonido() {
        return sonido;
    }

    public void setSonido(String sonido) {
        this.sonido = sonido;
    }

    @Override
    public String toString() {
        return "Toy{" +
                "marca='" + marca + '\'' +
                ", tamanio='" + tamanio + '\'' +
                ", sonido='" + sonido + '\'' +
                '}';
    }

    public Toy(String marca, String tamanio, String sonido) {
        this.marca = marca;
        this.tamanio = tamanio;
        this.sonido = sonido;
    }
    public Toy() {

    }
}
