package EstruturaRepeticaoEArray.ExeRepeticao;

import java.util.Scanner;

public class exe2NotaJava {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int nota;

        System.out.println("Insira uma nota entre 0 e 10");
        nota = input.nextInt();

        while (nota < 0 | nota > 10 ){
            System.out.println("Nota inválida, insira um valor entre 0 e 10!");
            nota = input.nextInt();

        }




    }
}
