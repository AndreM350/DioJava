package EstDadosAvancado.Testes;

public class main {
    public static void main(String[] args) {

        int a = 1;
        int b = a;

        System.out.println("a="+a);
        System.out.println("b="+b);



        //atribui��o de refer�ncia de mem�ria
        Objeto objeto1 = new Objeto(255);
        Objeto objeto2 = objeto1;

        System.out.println("Objeto1=" + objeto1 + "Objeto2=" + objeto2);
        objeto1.setNumero(598);
        System.out.println("Objeto1=" + objeto1 + "Objeto2=" + objeto2);


    }
}
