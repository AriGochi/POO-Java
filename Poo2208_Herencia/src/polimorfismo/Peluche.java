package polimorfismo;

public class Peluche extends Toy{
    private String relleno;
    private String material;

    public Peluche(String relleno, String material) {
        this.relleno = relleno;
        this.material = material;
    }

    public Peluche(String marca, String tamanio, String sonido, String relleno, String material) {
        super(marca, tamanio, sonido);
        this.relleno = relleno;
        this.material = material;
    }

    public String getRelleno() {
        return relleno;
    }

    public void setRelleno(String relleno) {
        this.relleno = relleno;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Peluche{" +
                "relleno='" + relleno + '\'' +
                ", material='" + material + '\'' +
                ", marca='" + marca + '\'' +
                ", tamanio='" + tamanio + '\'' +
                ", sonido='" + sonido + '\'' +
                '}';
    }
    public void plat(){
        System.out.println("Awwww AAAAAAW");
    }
}
