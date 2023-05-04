public class Libro {
    private String titulo;
    private double precio;
    private String sinopsis;
    private Autor autor;
    private Editorial editorial;

    public Libro() {
    }

    public Libro(String titulo, double precio, String sinopsis, Autor autor, Editorial editorial) {
        this.titulo = titulo;
        this.precio = precio;
        this.sinopsis = sinopsis;
        this.autor = autor;
        this.editorial = editorial;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
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

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", precio=" + precio +
                ", sinopsis='" + sinopsis + '\'' +
                ", autor=" + autor +
                ", editorial=" + editorial +
                '}';
    }
    public void leer(){
        System.out.println("Leyendo libro");
    }
    public void subrayar(){
        System.out.println("Sabrayando el libro");
    }
    public void traducir(){
        System.out.println("Traduciendo el libro");
    }
}
