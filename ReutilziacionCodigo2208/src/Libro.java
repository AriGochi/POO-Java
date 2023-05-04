public class Libro {
    private String titulo;
    private double precio;
    private String sinopsis;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Libro() {
    }

    public Libro(String titulo, double precio, String sinopsis) {
        this.titulo = titulo;
        this.precio = precio;
        this.sinopsis = sinopsis;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", precio=" + precio +
                ", sinopsis='" + sinopsis + '\'' +
                '}';
    }
    public void guardar(){
        System.out.println("se ha guardado");
    }
}
