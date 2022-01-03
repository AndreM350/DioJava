package EstDadosAvancado.ImplementacaoDasEstruturas.HashSet;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        //não preserva ordem de inserção
        Set<Carro> hashSetCarro = new HashSet<>();
        hashSetCarro.add(new Carro("Ford"));
        hashSetCarro.add(new Carro("Chevrolet"));
        hashSetCarro.add(new Carro("Fiat"));
        hashSetCarro.add(new Carro("Peugeot"));
        hashSetCarro.add(new Carro("Zip"));
        hashSetCarro.add(new Carro("Alfa Romeo"));

        System.out.println(hashSetCarro);

        Set<Carro> treeSetCarros = new TreeSet<>();

        treeSetCarros.add(new Carro("Ford"));
        treeSetCarros.add(new Carro("Chevrolet"));
        treeSetCarros.add(new Carro("Fiat"));
        treeSetCarros.add(new Carro("Peugeot"));
        treeSetCarros.add(new Carro("Zip"));
        treeSetCarros.add(new Carro("Alfa Romeo"));

        System.out.println(treeSetCarros);


    }
}
