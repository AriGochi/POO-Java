public class Vehiculo {
    protected String tipo;
    protected String tamano;
    protected String velocidadmaxima;


    public Vehiculo() {
    }

    public Vehiculo(String tipo, String tamano, String velocidadmaxima) {
        super();
        this.tipo = tipo;
        this.tamano = tamano;
        this.velocidadmaxima = velocidadmaxima;
    }


    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public String getVelocidadmaxima() {
        return velocidadmaxima;
    }

    public void setVelocidadmaxima(String velocidadmaxima) {
        this.velocidadmaxima = velocidadmaxima;
    }



    public void acelerar() {
        System.out.println("El vehiculo esta acelerando");
    }

    public void frenar() {
        System.out.println("El vehiculo esta desacelerando");
    }


    @Override
    public String toString() {
        return "Vehiculo{" +
                "tipo='" + tipo + '\'' +
                ", tamano='" + tamano + '\'' +
                ", velocidadmaxima='" + velocidadmaxima + '\'' +
                '}';
    }
}


