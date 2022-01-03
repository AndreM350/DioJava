package EstruturaRepeticaoEArray.Introdutorios;

/**
 * Classe principal dos exerc�cios da Aula 1 de M�todos.
 */
public class Main {

    public static void main(String[] args) {

        // EstruturaRepeticaoEArray.Introdutorios.Calculadora
        System.out.println("Exerc�cio calculadora-------------");
        Calculadora.soma(3, 6);
        Calculadora.subtracao(9, 1.8);
        Calculadora.multiplicacao(7, 8);
        Calculadora.divisao(5, 2.5);

        // EstruturaRepeticaoEArray.Introdutorios.Mensagem
        System.out.println("Exerc�cio mensagem------------");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(1);

        // Empr�stimo
        System.out.println("Exerc�cio empr�stimo--------------");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);

        // Quadril�tero
        System.out.println("Exerc�cio quadril�tero");
        Quadrilatero.area(3);
        Quadrilatero.area(5d,5d);
        Quadrilatero.area(7,8,9);
        Quadrilatero.area(5f,5f);

        // Retornos
        System.out.println("Exerc�cio retornos---------------");

        double areaQuadrado = QuadrilateroRetorno.area(3);
        System.out.println("�rea do quadrado:" + areaQuadrado);

        double areaRetangulo = QuadrilateroRetorno.area(5,5);
        System.out.println("�rea do ret�ngulo:" + areaRetangulo);

        double areaTrapezio = QuadrilateroRetorno.area(7,8,9);
        System.out.println("�rea do trap�zio:" + areaTrapezio);

    }
}