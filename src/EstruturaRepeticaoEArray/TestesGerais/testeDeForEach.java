package EstruturaRepeticaoEArray.TestesGerais;

public class testeDeForEach {
    public static void main(String[] args) {


        //forEach

        //Tendo o Array lista percorra todo o array e guarde seus elementos dentro da variável numeros
        //porém caso seja necessário ter acesso ao índice do array, então teremos que usar o array comum.
        int[] lista = {10, 20, 30, 40};
        for (int numeros : lista) {
            System.out.print(numeros + " ");
        }

        System.out.println("\n-----------------");
        //for normal
        for (int i = 0; i < lista.length; i++) {

            System.out.print(lista[i] + " ");

        }


    }
}
