import org.example.Empleado;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EmpleadoPruebas {
    @Test
    public void PruebascalcularSueldoBase() {
        Empleado empl = new Empleado("Panchito", 456789, 10000, 5, 2);
        double esperado = 50000;

        Assertions.assertEquals(esperado, empl.calcularSueldoBase());
    }

    @Test
    public void PruebascalcularSueldoConHorasExtra() {
        Empleado empl = new Empleado("Panchito", 456789, 10000, 5, 2);
        double esperado = 50500;
        Assertions.assertEquals(esperado, empl.calcularSueldoConHorasExtra());
    }
}


