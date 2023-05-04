public class Editorial {
    private String nombre;
    private String direccion;
    private Pais pais;

    public Editorial() {
    }

    public Editorial(String nombre, String direccion, Pais pais) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.pais = pais;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;

    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Editorial{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", pais=" + pais +
                '}';
    }
    public void publicar(){
        System.out.println("Publicando" + nombre);
    }
    public void vender(){
        System.out.println("Se esta vendiendo el material" + nombre);
    }
}
