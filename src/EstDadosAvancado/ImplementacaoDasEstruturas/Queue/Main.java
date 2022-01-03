package EstDadosAvancado.ImplementacaoDasEstruturas.Queue;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        // offer x add
        //add se n�o conseguir adicionar retorna um erro
        //offer se n�o conseguir adicionar retorna false (sem erro)

        Queue<Carro> queueCarros = new LinkedList<>();

        queueCarros.add(new Carro("Ford"));
        queueCarros.add(new Carro("Chevrolet"));
        queueCarros.add(new Carro("Fiat"));

        System.out.println(queueCarros.add(new Carro("Peugeot")));
        System.out.println(queueCarros);

        System.out.println("---------------------------------------------------------");
        System.out.println(queueCarros.offer(new Carro("Renault")));
        System.out.println(queueCarros);

        System.out.println("---------------------------------------------------------");
        System.out.println(queueCarros.peek());
        System.out.println(queueCarros);

        System.out.println("---------------------------------------------------------");
        System.out.println(queueCarros.poll());
        System.out.println(queueCarros);

        System.out.println("---------------------------------------------------------");
        System.out.println(queueCarros.size());
        System.out.println(queueCarros);
    }
}
