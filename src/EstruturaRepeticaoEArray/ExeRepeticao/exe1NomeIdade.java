package EstruturaRepeticaoEArray.ExeRepeticao;

import java.util.Scanner;

public class exe1NomeIdade {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String nome;
        int idade;

        while(true){
            System.out.println("Nome: ");
            nome = input.next();
            if(nome.equals("0")) break;            //if(nome == 0) não funciona aqui


            System.out.println("Idade: ");
            idade = input.nextInt();
        }

    }

}
