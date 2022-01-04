package Desafios;

import java.io.IOException;
import java.util.Scanner;

public class Desafio1Teste1 {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);

        int min = leitor.nextInt(); //minutos restantes para fim do expediente.
        int A = leitor.nextInt();
        int B = leitor.nextInt();
        int soma = A + B;

        //TODO: Complete o If com a condição que soluciona o problema.
        if (soma > min)
            System.out.println("Deixa para amanhã!");
        else
            System.out.println("Farei hoje!");
    }
}
