import java.util.Scanner;

 
    /**
     * classe principal para simular uma locação de veículos.
     */
public class MenuPrincipal {
    private GerenciarLocacoes gerenciarLocacoes = new GerenciarLocacoes();
    private GerenciarClientes gerenciarClientes = new GerenciarClientes();
    private GerenciarVeiculo gerenciarVeiculo = new GerenciarVeiculo();
   
    Scanner entrada = new Scanner(System.in);

    public void menuPrincipal(){
        int op; 
        do{
            System.out.println(" ***** Seja bem vindo a Locadora de veículos ***** ");
            System.out.println(" Para realizar uma locação você precisa estar cadastrado! Digite 1 para cadastrar: ");
            System.out.println("1.Clientes");
            System.out.println("2.Veiculos");
            System.out.println("3.Locacoes");


            op = entrada.nextInt();
            entrada.nextLine();
            switch(op){
                case 1:
                GerenciarClienteConsole gerenciarClienteConsole = new GerenciarClienteConsole(gerenciarClientes);
                gerenciarClienteConsole.menuCadastroCliente();
                    break;
                case 2: 
                GerenciarVeiculosConsole gerenciarVeiculosConsole = new GerenciarVeiculosConsole(gerenciarVeiculo);
                gerenciarVeiculosConsole.menuCadastroVeiculo();
                    break;
                case 3: 
                GerenciarLocacoesConsole gerenciarLocacoesConsole= new GerenciarLocacoesConsole(gerenciarLocacoes);
                gerenciarLocacoesConsole.menuLocacao();
            }
        }while(op!=0); 
    }
}
