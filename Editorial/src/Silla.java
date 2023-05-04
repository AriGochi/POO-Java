import java.awt.*;

public class Silla {
    private String material;
    private Color color;
    private int altura;
    private String marca;

    public Silla() {
    }

    public Silla(String material, Color color, int altura, String marca) {
        this.material = material;
        this.color = color;
        this.altura = altura;
        this.marca = marca;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Silla{" +
                "material='" + material + '\'' +
                ", color=" + color +
                ", altura=" + altura +
                ", marca='" + marca + '\'' +
                '}';
    }
    public void pintar(Color c) {
        color = c;
    }
    public boolean mover (int cm){
        return true;
    }
}
