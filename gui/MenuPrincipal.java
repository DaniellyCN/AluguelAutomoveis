package gui;


import java.util.Scanner;

import gerenciar.GerenciarClientes;
import gerenciar.GerenciarLocacoes;
import gerenciar.GerenciarVeiculo;


 
    /**
     * classe principal para simular uma locação de veículos.
     */
public class MenuPrincipal {
    private GerenciarLocacoes gerenciarLocacoes = new GerenciarLocacoes();
    private GerenciarClientes gerenciarClientes = new GerenciarClientes();
    private GerenciarVeiculo gerenciarVeiculo = new GerenciarVeiculo();

    Scanner entrada = new Scanner(System.in);

    /**
     * Menu principal do programa.
     */
    public void menuPrincipal(){
        int op; 

        GerenciarClienteConsole gerenciarClienteConsole = new GerenciarClienteConsole(gerenciarClientes);
        GerenciarVeiculosConsole gerenciarVeiculosConsole = new GerenciarVeiculosConsole(gerenciarVeiculo);
        GerenciarLocacoesConsole gerenciarLocacoesConsole= new GerenciarLocacoesConsole(gerenciarLocacoes);
        do{
            System.out.println(" ***** Seja bem vindo a Locadora de veículos ***** ");
            System.out.println("Para realizar uma locação de veículos você precisa estar cadastrado! \n Digite 1 para entrar em clientes e se cadastrar \n Digete 2 para entrar e cadastrar um veículo \n Digite 3 para cadastrar uma locação");
            System.out.println("\n [1] Clientes \n [2] Veículos \n [3] Locações");
            op = entrada.nextInt();
            entrada.nextLine();
            switch(op){
                case 1:
               
                gerenciarClienteConsole.menuCadastroCliente();
                    break;
                case 2: 
               
                gerenciarVeiculosConsole.menuCadastroVeiculo();
                    break;
                case 3: 
                
                gerenciarLocacoesConsole.menuLocacao();
            }
        }while(op!=0); 
    }
}
