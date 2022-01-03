package Objeto;

import java.util.ArrayList;

public class EntregaCartaoApp {
    public static void main(String[] args) {

        Endereco endereco =  new Endereco();


        Cliente cliente1 = new Cliente();

        cliente1.adicionaEndereco(endereco);
        System.out.println("Endereço adicionado com sucesso.");


    }
}
