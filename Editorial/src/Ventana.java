public class Ventana {
    private double alto;
    private double ancho;
    private double porcentajeApertura;

    public Ventana() {
    }

    public Ventana(double alto, double ancho, double porcentajeApertura) {
        this.alto = alto;
        this.ancho = ancho;
        this.porcentajeApertura = porcentajeApertura;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getPorcentajeApertura() {
        return porcentajeApertura;
    }

    public void setPorcentajeApertura(double porcentajeApertura) {
        if (porcentajeApertura <= 100 && porcentajeApertura >= 0) {
            this.porcentajeApertura = porcentajeApertura;
        } else {
            System.out.println("Porcentaje invalido");

        }
    }

    @Override
    public String toString() {
        return "Ventana{" +
                "alto=" + alto +
                ", ancho=" + ancho +
                ", porcentajeApertura=" + porcentajeApertura +
                '}';
    }

    public void abrir(double porcentaje) {
        if (porcentaje >= 1 && porcentaje <= 100) {
            this.porcentajeApertura = porcentaje;
        } else {
            System.out.println("El porcentaje ingresado no es valido");
        }

    }

    public boolean cerrar(double porcentaje) {
        if (porcentaje >= 0 && porcentaje <= 100) {
             this.porcentajeApertura = this.porcentajeApertura - porcentaje;
             if (this.porcentajeApertura < 0 ){
                 this.porcentajeApertura  = 0;
                 return true;
             }
             else{
                 this.porcentajeApertura = this.porcentajeApertura;
             }
        } else {
            System.out.println("Porcentaje invalido");
        }
        return this.porcentajeApertura == 0;
    }
}
