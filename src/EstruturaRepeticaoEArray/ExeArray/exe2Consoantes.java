package EstruturaRepeticaoEArray.ExeArray;

import java.util.Scanner;

public class exe2Consoantes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] consoantes = new String[3];
        int quantidadeConsoantes = 0;
        int contador = 0;

        do {
            System.out.println("Letra: ");
            String letra = input.next();
            if (!(letra.equalsIgnoreCase("a")) |
                    (letra.equalsIgnoreCase("e")) |
                    (letra.equalsIgnoreCase("i")) |
                    (letra.equalsIgnoreCase("o")) |
                    (letra.equalsIgnoreCase("u"))) {
                consoantes[contador] = letra;
                quantidadeConsoantes++;
            }
            contador++;
        } while (contador < consoantes.length);

        System.out.println("Consoantes: ");
        for (String consoante : consoantes) {
            if (consoante != null) {
                System.out.print(consoante + " ");

            }

        }

        System.out.println("Quantidade de consoantes: " + quantidadeConsoantes);
        System.out.println(consoantes.length);

    }
}
