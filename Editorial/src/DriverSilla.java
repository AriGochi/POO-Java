import java.awt.*;

public class DriverSilla {
    public static void main(String[] args) {
        Silla silla1 = new Silla();
        Silla silla2 = new Silla("madera",Color.BLACK,35, "Patito");

        silla2.setColor(Color.blue);
        System.out.println(silla2);

    }
}
