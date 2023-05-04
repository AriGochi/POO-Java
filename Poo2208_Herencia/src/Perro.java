public class Perro extends Animal{

    private String raza;

    private String pedegree;

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getPedegree() {
        return pedegree;
    }

    public Perro() {
    }

    public Perro(String tipo, String tamanio, String alimentacion, String raza, String pedegree) {
        super(tipo, tamanio, alimentacion);
        this.raza = raza;
        this.pedegree = pedegree;
    }

    public void setPedegree(String pedegree) {
        this.pedegree = pedegree;
    }

    @Override
    public String toString() {
        return "Perro{" +
                "raza='" + raza + '\'' +
                ", pedegree='" + pedegree + '\'' +
                ", tipo='" + tipo + '\'' +
                ", tamanio='" + tamanio + '\'' +
                ", alimentacion='" + alimentacion + '\'' +
                '}';
    }
    public void ladrar(){
        System.out.println("El perro esta ladrando");
    }
    public void aullar(){
        System.out.println("El perro esta aullando");
  }

    @Override
    public void correr() {
        System.out.println("El perro esta corriendo....");

    }

    @Override
    public void dormir() {
        System.out.println("El perro de raza "+ raza + " esta durmiendo");
    }
}


