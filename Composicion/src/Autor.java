public class Autor {

    private  String nombre;
    private String pseudonimo;
    private Pais nacionalidad;

    public Autor() {
    }

    public Autor(String nombre, String pseudonimo, Pais nacionalidad) {
        this.nombre = nombre;
        this.pseudonimo = pseudonimo;
        this.nacionalidad = nacionalidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPseudonimo() {
        return pseudonimo;
    }

    public void setPseudonimo(String pseudonimo) {
        this.pseudonimo = pseudonimo;
    }

    public Pais getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(Pais nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    @Override
    public String toString() {
        return "Autor{" +
                "nombre='" + nombre + '\'' +
                ", pseudonimo='" + pseudonimo + '\'' +
                ", nacionalidad=" + nacionalidad +
                '}';
    }
    public void escribir(){
        System.out.println("Escribiendo el siguiente libro");
    }
    public void promocionar(){
        System.out.println("Promocionando el actual libro");
    }
}
