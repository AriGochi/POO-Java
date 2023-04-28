import org.example.Calculadora;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PruebaCalculadora {

    @Test
    public void ProbarSuma() {
        System.out.println("Pruebas suma");

        // Prueba 1: Suma de dos números positivos
        Calculadora calc = new Calculadora(5, 10);
        int esperado = 15;
        Assertions.assertEquals(esperado, calc.Sumar());

    }

    @Test
    public void ProbarSumaNegativos() {
        // Prueba 2: Suma de dos números negativos
        Calculadora calc2 = new Calculadora(-5, -10);
        int esperado2 = -15;
        Assertions.assertEquals(esperado2, calc2.Sumar());
    }

    @Test
    public void ProbarSuma3() {
        // Prueba 2: Suma de dos números negativos
        Calculadora calc3 = new Calculadora(5, -10);
        int esperado3 = -5;
        Assertions.assertEquals(esperado3, calc3.Sumar());

    }

    @Test
    public void ProbarSuma4() {
        // Prueba 2: Suma de dos números negativos
        Calculadora calc3 = new Calculadora(5, 0);
        int esperado4 = 5;
        Assertions.assertEquals(esperado4, calc3.Sumar());
    }

    @Test
    public void ProbarSuma5() {
        // Prueba 2: Suma de dos números negativos
        Calculadora calc3 = new Calculadora(999999999, 999999999);
        int esperado5 = 1999999998;
        Assertions.assertEquals(esperado5, calc3.Sumar());
    }

    @Test
    public void ProbarResta() {
        // Prueba 2: Suma de dos números negativos
        Calculadora calc3 = new Calculadora(10, 5);
        int esperado6 = 5;
        Assertions.assertEquals(esperado6, calc3.Restar());
    }

    @Test
    public void ProbarResta2() {
        // Prueba 2: Suma de dos números negativos
        Calculadora calc3 = new Calculadora(-10, -5);
        int esperado7 = -5;
        Assertions.assertEquals(esperado7, calc3.Restar());
    }

    @Test
    public void ProbarResta3() {
        // Prueba 2: Suma de dos números negativos
        Calculadora calc3 = new Calculadora(10, -5);
        int esperado8 = 15;
        Assertions.assertEquals(esperado8, calc3.Restar());
    }

    @Test
    public void ProbarResta4() {
        // Prueba 2: Suma de dos números negativos
        Calculadora calc3 = new Calculadora(10, -5);
        int esperado9 = 15;
        Assertions.assertEquals(esperado9, calc3.Restar());
    }

    @Test
    public void ProbarResta5() {
        // Prueba 2: Suma de dos números negativos
        Calculadora calc3 = new Calculadora(10, -5);
        int esperado10 = 15;
        Assertions.assertEquals(esperado10, calc3.Restar());

    }

    @Test
    public void ProbarMultiplicar() {
        // Prueba 2: Suma de dos números negativos
        Calculadora calc3 = new Calculadora(10, 5);
        int esperado11 = 50;
        Assertions.assertEquals(esperado11, calc3.Multiplicar());
    }

    @Test
    public void ProbarMultiplicar2() {
        // Prueba 2: Suma de dos números negativos
        Calculadora calc3 = new Calculadora(-10, -5);
        int esperado12 = -5;
        Assertions.assertEquals(esperado12, calc3.Restar());
    }

    @Test
    public void ProbarMultiplicar3() {
        // Prueba 2: Suma de dos números negativos
        Calculadora calc3 = new Calculadora(5, -10);
        int esperado12 = 15;
        Assertions.assertEquals(esperado12, calc3.Restar());
    }

    @Test
    public void ProbarMultiplicar4() {
        // Prueba 2: Suma de dos números negativos
        Calculadora calc3 = new Calculadora(5, 0);
        int esperado12 = 5;
        Assertions.assertEquals(esperado12, calc3.Restar());
    }

    @Test
    public void ProbarMultiplicar5() {
        // Prueba 2: Suma de dos números negativos
        Calculadora calc3 = new Calculadora(999999999, 999999999);
        int esperado12 = 0;
        Assertions.assertEquals(esperado12, calc3.Restar());
    }

    @Test
    public void ProbarDividir() {
        // Prueba 2: Suma de dos números negativos
        Calculadora calc3 = new Calculadora(10, 5);
        int esperado16 = 2;
        Assertions.assertEquals(esperado16, calc3.Dividir());
    }

    @Test
    public void ProbarDividir2() {
        // Prueba 2: Suma de dos números negativos
        Calculadora calc3 = new Calculadora(-10, -5);
        int esperado17 = 2;
        Assertions.assertEquals(esperado17, calc3.Dividir());
    }

    @Test
    public void ProbarDividir3() {
        // Prueba 2: Suma de dos números negativos
        Calculadora calc3 = new Calculadora(10, -5);
        int esperado18 = -2;
        Assertions.assertEquals(esperado18, calc3.Dividir());
    }

    @Test
    public void ProbarDividir4() {
        // Prueba 3: División de un número positivo y otro negativo
        Calculadora calc3 = new Calculadora(10, -5);
        int esperado19 = -2;
        Assertions.assertEquals(esperado19, calc3.Dividir());
    }

    @Test
    public void ProbarDividir5() {
        // Prueba 5: División de dos números grandes
        Calculadora calc3 = new Calculadora(999999999, 3);
        int esperado20 = 333333333;
        Assertions.assertEquals(esperado20, calc3.Dividir());
    }

}





