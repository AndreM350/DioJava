package EstruturaRepeticaoEArray.ExeRepeticao;

import java.util.Scanner;

public class exe3ParEImpar {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numero;
        int maior = 0;
        int contador = 0;
        int total = 0;

        do {

            System.out.println("Número: ");
            numero = input.nextInt();
            total += numero;
            contador++;
            if(numero > maior){
                maior = numero;
            }

        } while(contador < 5);

        int media = total / contador;
        System.out.println("O maior número foi: " + maior);
        System.out.println("O somatório dos números é: " + total);
        System.out.println("A média dos números é: " + media);


    }
}
