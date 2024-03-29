public class Calculadora {
    private int operando1;
    private int operando2;

    public int getOperando1() {
        return operando1;
    }

    public void setOperando1(int operando1) {
        this.operando1 = operando1;
    }

    public int getOperando2() {
        return operando2;
    }

    public void setOperando2(int operando2) {
        this.operando2 = operando2;
    }

    public Calculadora(int operando1, int operando2) {
        this.operando1 = operando1;
        this.operando2 = operando2;
    }

    public Calculadora() {
    }

    @Override
    public String toString() {
        return "Calculadora{" +
                "operando1=" + operando1 +
                ", operando2=" + operando2 +
                '}';
    }
    public int suma(int operando1, int operando2){
        return operando1+operando2;
    }
    public int restar(int operando1, int operando2){
        return operando1-operando2;
    }
    public int multiplicar(int operando1, int operando2){
        return operando1*operando2;
    }
    public int dividir(int operando1, int operando2){
        return operando1/operando2;
    }
}
