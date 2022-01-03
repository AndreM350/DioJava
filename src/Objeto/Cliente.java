package Objeto;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    public Integer codigo;
    public String nome;
    public String cpf;

    private List<Endereco> enderecos;

    public void adicionaEndereco(Endereco endereco){
        if (endereco == null){
            throw new NullPointerException("Endere�o n�o pode ser nulo");
        }
        if (endereco.cep == null){
            throw new NullPointerException("CEP n�o pode ser nulo");
        }
        getEnderecos().add(endereco);

    }

    private List<Endereco> getEnderecos() {
        if (enderecos == null) {
            enderecos = new ArrayList<Endereco>();
        }
        return enderecos;
    }


}
