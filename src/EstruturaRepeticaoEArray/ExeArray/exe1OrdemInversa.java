package EstruturaRepeticaoEArray.ExeArray;

public class exe1OrdemInversa {

    public static void main(String[] args) {

        int[] vetor = {-5, -6, 15, 50, 8, 4};


        System.out.print("Vetor: ");
        int contador = 0;
        while (contador < (vetor.length)) {
            System.out.print(vetor[contador] + " ");
            contador++;
        }

        System.out.print("\nVetor Invertido: ");
        int i = (vetor.length - 1);
        while (i >= 0) {
            System.out.print(vetor[i] + " ");
            i--;
        }

    }

}
