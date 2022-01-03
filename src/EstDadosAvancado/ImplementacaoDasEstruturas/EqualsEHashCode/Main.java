package EstDadosAvancado.ImplementacaoDasEstruturas.EqualsEHashCode;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Carro> listaCarros = new ArrayList<>();

        listaCarros.add(new Carro("Ford"));
        listaCarros.add(new Carro("Chevrolet"));
        listaCarros.add(new Carro("Volkswagen"));

        System.out.println(listaCarros.contains(new Carro("Ford")));
        System.out.println((new Carro("Ford").hashCode())); //comparando o nome mesmo, não posição de memória
        System.out.println((new Carro("Ford").hashCode()));
        System.out.println((new Carro("Ford1").hashCode()));

        Carro carro1 = new Carro("Ford");
        Carro carro2 = new Carro("Chevrolet");
        Carro carro3 = new Carro("Ford");

        System.out.println(carro1.equals(carro2)); // retorna false
        System.out.println(carro1.equals(carro3)); // retorna true


    }
}
