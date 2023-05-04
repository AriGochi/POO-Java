public class MaquinaDeCafe {
    private int cantidadAgua;
    private int cantidadCafe;
    private  int cantidadCrema;
    private int cantidadVasosTermicos;

    public MaquinaDeCafe(int cantidadAgua, int cantidadCafe, int cantidadCrema, int cantidadVasosTermicos) {
        this.cantidadAgua = cantidadAgua;
        this.cantidadCafe = cantidadCafe;
        this.cantidadCrema = cantidadCrema;
        this.cantidadVasosTermicos = cantidadVasosTermicos;
    }

    public int getCantidadAgua() {
        return cantidadAgua;
    }

    public void setCantidadAgua(int cantidadAgua) {
        this.cantidadAgua = cantidadAgua;
    }

    public int getCantidadCafe() {
        return cantidadCafe;
    }

    public void setCantidadCafe(int cantidadCafe) {
        this.cantidadCafe = cantidadCafe;
    }

    public int getCantidadCrema() {
        return cantidadCrema;
    }

    public void setCantidadCrema(int cantidadCrema) {
        this.cantidadCrema = cantidadCrema;
    }

    public int getCantidadVasosTermicos() {
        return cantidadVasosTermicos;
    }

    public void setCantidadVasosTermicos(int cantidadVasosTermicos) {
        this.cantidadVasosTermicos = cantidadVasosTermicos;
    }

    @Override
    public String toString() {
        return "MaquinaDeCafe{" +
                "cantidadAgua=" + cantidadAgua +
                ", cantidadCafe=" + cantidadCafe +
                ", cantidadCrema=" + cantidadCrema +
                ", cantidadVasosTermicos=" + cantidadVasosTermicos +
                '}';
    }

    public MaquinaDeCafe () {
        cantidadAgua = 500;
        cantidadCafe = 1000;
        cantidadCrema = 1500;
        cantidadVasosTermicos = 50;

    }
}
