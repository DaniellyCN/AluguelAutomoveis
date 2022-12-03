package gerenciar;

import java.util.ArrayList;
import java.util.List;

/*
 * Classe implementada da IClientes 
 */
public class GerenciarClientes implements IClientes {

    /**
     * lista de clientes
     */
    List<Cliente> listaDClientes; // = new ArrayList<>();

    public GerenciarClientes(List<Cliente> clientes) {
        this.listaDClientes = clientes;
    }

    public GerenciarClientes() {
        this.listaDClientes = new ArrayList<>();
    }

    /*
     * (non-Javadoc)
     * 
     * @see gerenciar.IClientes#add(gerenciar.Cliente)
     */
    public void add(Cliente c) {
        listaDClientes.add(c);
    }

    /*
     * (non-Javadoc)
     * 
     * @see gerenciar.IClientes#get(long)
     */
    public Cliente get(long CPF) {

        for (int i = 0; i < listaDClientes.size(); i++) {
            if (listaDClientes.get(i).getCpf() == CPF) {
                return listaDClientes.get(i);
            }
        }
        System.out.println("Cliente encontrado! O CPF do cliente é : " + CPF);
        return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see gerenciar.IClientes#getInfo(long)
     */
    public String getInfo(long CPF) {
        for (int i = 0; i < listaDClientes.size(); i++) {
            if (listaDClientes.get(i).getCpf() == CPF) {
                return "CPF do cliente: " + listaDClientes.get(i).getCpf();
            }
        }
        return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see gerenciar.IClientes#getInfo()
     */
    public String getInfo() {
        String dados = "";
        for (int i = 0; i < listaDClientes.size(); i++) {
            dados += "CPF do cliente: " + listaDClientes.get(i).getCpf() + "o nome do cliente e"
                    + listaDClientes.get(i).getNome();
        }
        return dados;
    }

    /*
     * (non-Javadoc)
     * 
     * @see gerenciar.IClientes#getResumoInfo()
     */
    public String getResumoInfo() {
        String dados = "";
        for (int i = 0; i < listaDClientes.size(); i++) {
            if (listaDClientes.get(i) != null) {
                dados += "\n Detalhes do cadastro do cliente: \n CPF: " + listaDClientes.get(i).getCpf() + " Nome: "
                        + listaDClientes.get(i).getNome() + " Rua: " + listaDClientes.get(i).getRua()
                        + " Número da casa: " + listaDClientes.get(i).getNumeroCasa() + " Bairro: "
                        + listaDClientes.get(i).getBairro() + " Cidade: " + listaDClientes.get(i).getCidade()
                        + " Telefone: " + listaDClientes.get(i).getTelefone() + " Carteira de motorista: "
                        + listaDClientes.get(i).getCnh() + " CEP: " + listaDClientes.get(i).getCep() + "\n ------";
            }
        }
        return dados;

    }

    /*
     * (non-Javadoc)
     * 
     * @see gerenciar.IClientes#remove(long)
     */
    public boolean remove(long CPF) {
        for (int i = 0; i < listaDClientes.size(); i++) {
            if (listaDClientes.get(i).getCpf() == CPF) {
                listaDClientes.remove(i);
                return true;
            }
        }
        System.out.println("\n CPf encontrado, o cpf do cliente é: " + CPF + "\n Nome do cliente: "
                + listaDClientes.get(0).getNome());
        return false;
    }

    /*
     * (non-Javadoc)
     * 
     * @see gerenciar.IClientes#existe(long)
     */
    public boolean existe(long CPF) {
        for (int i = 0; i < listaDClientes.size(); i++) {
            if (listaDClientes.get(i).getCpf() == CPF) {
                return true;
            }
        }
        return false;
    }

}
