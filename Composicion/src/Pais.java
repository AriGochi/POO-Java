public class Pais {
    private String nombre;
    private String continente;
    private String corto;
    private String capital;

    public Pais() {
    }

    public Pais(String nombre, String continente, String corto, String capital) {
        this.nombre = nombre;
        this.continente = continente;
        this.corto = corto;
        this.capital = capital;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContinente() {
        return continente;
    }

    public void setContinente(String continente) {
        this.continente = continente;
    }

    public String getCorto() {
        return corto;
    }

    public void setCorto(String corto) {
        this.corto = corto;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    @Override
    public String toString() {
        return "Pais{" +
                "nombre='" + nombre + '\'' +
                ", continente='" + continente + '\'' +
                ", corto='" + corto + '\'' +
                ", capital='" + capital + '\'' +
                '}';
    }

}
