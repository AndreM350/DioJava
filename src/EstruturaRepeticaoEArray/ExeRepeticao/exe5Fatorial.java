package EstruturaRepeticaoEArray.ExeRepeticao;

import java.util.Scanner;

public class exe5Fatorial {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Fatorial: ");
        int fatorial = input.nextInt();
        int multiplicacao = 1;

        System.out.print(fatorial + "!=");
        for(int i = fatorial ; i >= 1; i--){
            multiplicacao = multiplicacao * i;
        }
        System.out.println(multiplicacao);
    }


}
