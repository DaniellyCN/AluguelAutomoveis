import java.util.ArrayList;
import java.util.List;

import gerenciar.Cliente;
import gerenciar.GerenciarClientes;
import gerenciar.GerenciarLocacoes;
import gerenciar.GerenciarVeiculo;
import gerenciar.Locacao;
import gerenciar.Veiculo;
import gui.MenuPrincipal;

public class Main {
    public static void main(String[] args){
       List<Veiculo> veiculos = new ArrayList<>(); 
       List<Cliente> clientes = new ArrayList<>();
       List<Locacao> locacoes = new ArrayList<>();

       
       

       MenuPrincipal menuPrincipal = new MenuPrincipal(new GerenciarLocacoes(locacoes, clientes, veiculos), new GerenciarClientes(clientes), new GerenciarVeiculo(veiculos));
        
        //MenuPrincipal menuPrincipal = new MenuPrincipal(new GerenciarLocacoes(), new GerenciarClientes(), new GerenciarVeiculo());
        menuPrincipal.menuPrincipal();
    }
}
