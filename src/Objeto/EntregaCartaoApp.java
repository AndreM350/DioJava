package Objeto;

import java.util.ArrayList;

public class EntregaCartaoApp {
    public static void main(String[] args) {

        Endereco endereco =  new Endereco();
        endereco.cep = "04524000";


        Cliente cliente1 = new Cliente();

        try {

            cliente1.adicionaEndereco(endereco);
            System.out.println("Endereço adicionado com sucesso.");

        } catch (Exception e){

            System.err.println("House um erro ao adicionar o endereço: " + e.getMessage());

        }




    }
}
