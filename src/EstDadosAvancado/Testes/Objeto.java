package EstDadosAvancado.Testes;

public class Objeto {

    int numero;

    public Objeto(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Objeto{" +
                "numero=" + numero +
                '}';
    }
}
