package polimorfismo;

public class MascotaCanina extends Perro{
    private String nombre;
    private boolean collar;
    private String alimentofavorito;
    //Juguete
    private Toy juguete;

    public MascotaCanina() {
    }

    public MascotaCanina(String raza, int edad, String nombre, boolean collar, String alimentofavorito, Toy juguete) {
        super(raza, edad);
        this.nombre = nombre;
        this.collar = collar;
        this.alimentofavorito = alimentofavorito;
        this.juguete = juguete;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isCollar() {
        return collar;
    }

    public void setCollar(boolean collar) {
        this.collar = collar;
    }

    public String getAlimentofavorito() {
        return alimentofavorito;
    }

    public void setAlimentofavorito(String alimentofavorito) {
        this.alimentofavorito = alimentofavorito;
    }

    public Toy getJuguete() {
        return juguete;
    }

    public void setJuguete(Toy juguete) {
        this.juguete = juguete;
    }

    @Override
    public String toString() {
        return "MascotaCanina{" +
                "nombre='" + nombre + '\'' +
                ", collar=" + collar +
                ", alimentofavorito='" + alimentofavorito + '\'' +
                ", juguete=" + juguete +
                ", raza='" + raza + '\'' +
                ", edad=" + edad +
                '}';
    }
    public void jugar(){
        System.out.println(this.nombre + "Esta jugando un " + juguete);
        juguete.play();
    }
}
