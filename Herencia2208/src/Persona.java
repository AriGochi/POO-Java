public class Persona {
    private String nombre;
    private String fechaNacimiento;
    private String pais;
    private double estatura;
    private double peso;
    private String genero;

    public Persona() {
    }

    public Persona(String nombre, String fechaNacimiento, String pais, double estatura, double peso, String genero) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.pais = pais;
        this.estatura = estatura;
        this.peso = peso;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
                ", pais='" + pais + '\'' +
                ", estatura=" + estatura +
                ", peso=" + peso +
                ", genero='" + genero + '\'' +
                '}';
    }
    public void caminar(){
        System.out.println("Esta caminando");
    }
    public void comer(){
        System.out.println("Comiendo");
    }
    public void respirar(){
        System.out.println("Respirando");
    }
    public void dormir(){
        System.out.println("Durmiendo");
    }
}
