package EstruturaRepeticaoEArray.TestesGerais;

public class testeDeForEach {
    public static void main(String[] args) {


        //forEach

        //Tendo o Array lista percorra todo o array e guarde seus elementos dentro da vari�vel numeros
        //por�m caso seja necess�rio ter acesso ao �ndice do array, ent�o teremos que usar o array comum.
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
