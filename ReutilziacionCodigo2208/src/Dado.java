public class Dado {
    private int valor;

    public int getValor() {
        return valor;
    }

    public Dado(int valor) {
        this.valor = valor;
    }

    public Dado() {
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Dado{" +
                "valor=" + valor +
                '}';
    }
    public void tirar (){
        System.out.println();
    }
}
