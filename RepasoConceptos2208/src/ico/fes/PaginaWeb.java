package ico.fes;

public class PaginaWeb {
    private String tipo;
    private String nombre;
    private String url;
    private String contenido;
    private String fechaMoficacion;

    public PaginaWeb() {
    }

    public PaginaWeb(String tipo, String nombre, String url, String contenido, String fechaMoficacion) {
        this.tipo = tipo;
        this.nombre = nombre;
        this.url = url;
        this.contenido = contenido;
        this.fechaMoficacion = fechaMoficacion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getFechaMoficacion() {
        return fechaMoficacion;
    }

    public void setFechaMoficacion(String fechaMoficacion) {
        this.fechaMoficacion = fechaMoficacion;
    }

    @Override
    public String toString() {
        return "PaginaWeb{" +
                "tipo='" + tipo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", url='" + url + '\'' +
                ", contenido='" + contenido + '\'' +
                ", fechaMoficacion='" + fechaMoficacion + '\'' +
                '}';
    }
    public void visitar(){
        System.out.println("Bienvenido a: " + nombre);
        System.out.println("------------");
        System.out.println(contenido);
        System.out.println("-----------");
    }
    public void cerrar(){
        System.out.println("ADIOS");
    }
}

