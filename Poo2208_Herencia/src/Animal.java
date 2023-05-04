public class Animal {
    protected String tipo;
    protected String tamanio;
    protected String alimentacion;

    @Override
    public String toString() {
        return "Animal{" +
                "tipo='" + tipo + '\'' +
                ", tamanio='" + tamanio + '\'' +
                ", alimentacion='" + alimentacion + '\'' +
                '}';
    }

    public String getTipo() {
        return tipo;
    }

    public Animal() {
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Animal(String tipo, String tamanio, String alimentacion) {
        this.tipo = tipo;
        this.tamanio = tamanio;
        this.alimentacion = alimentacion;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public String getAlimentacion() {
        return alimentacion;
    }

    public void setAlimentacion(String alimentacion) {
        this.alimentacion = alimentacion;
    }
public void correr (){
    System.out.println("El animal esta corriendo...");
}
public void dormir(){
    System.out.println("El animal esta durmiendo...");
}
}
