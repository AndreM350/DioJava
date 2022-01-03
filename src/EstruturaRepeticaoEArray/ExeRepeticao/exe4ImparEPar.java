package EstruturaRepeticaoEArray.ExeRepeticao;

import java.util.Scanner;

public class exe4ImparEPar {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        int numPar = 0, numImpar = 0;
        int numQnt;
        int contador = 0;
        int num;


        System.out.println("Insira a quantidade de números: ");
        numQnt = input.nextInt();

        do {

            System.out.println("Insira um número: ");
            num = input.nextInt();
            if (num % 2 == 0) numPar++;
            else numImpar++;
            contador++;

        } while (contador < numQnt);
        System.out.println("Números pares:" + numPar);
        System.out.println("Números pares:" + numImpar);






    }

}
