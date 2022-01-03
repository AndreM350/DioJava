package EstruturaRepeticaoEArray.Introdutorios;

public class PassaParametro {
    public static void main(String[] args) {

        int i = 10;
        System.out.println("valor de i fora: " + i);


    }

    public void multiplica(int i) {
        i = i + 10;
        System.out.println("valor de i dentro: " + i);
    }

}
