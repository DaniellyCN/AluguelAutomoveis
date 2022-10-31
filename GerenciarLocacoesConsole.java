//import java.util.List;

//import java.util.ArrayList;
import java.util.Scanner;

public class GerenciarLocacoesConsole  {
    private GerenciarLocacoes gerenciarLocacoes = new GerenciarLocacoes();
    private GerenciarClientes gerenciarClientes = new GerenciarClientes();
    Scanner entrada = new Scanner(System.in);

    public void menuLocacao(){
        int op; 
        do{
            System.out.println("Locação de veículos");
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
                veiculos();// fazer igual ao case 1
                    break;
                case 3:
                adicionarLocacao();
                    default: 
            }
        }while(op!=0); 
    }

    public void veiculos(){
        //retirar esse método dps que implementar a GerenciarVeiculosConsole.
    }
    public void adicionarLocacao(){
        Locacao locacao = new Locacao();
        
        int opcao; 
        System.out.println("\n 1.Cadastrar \n  2 - Verificar cadastro \n  3 - Deletar cadastro ");
        opcao = entrada.nextInt();

        if(opcao == 1){
        System.out.println("Digite o código da locação: ");
        locacao.setCodigoDaLocacao(entrada.nextInt());

        System.out.println("Informe o titular da locação");// cpf do cliente.
        locacao.setCliente(gerenciarClientes.get(entrada.nextInt()));

        System.out.println("informe o veículo para a locação");//classe GerenciarVeiculoConsole não implementada.
        

        System.out.println("informe se o veículo possui seguro: ");
        locacao.setSeguro(entrada.nextBoolean());

        System.out.println("informe a data inicial da locação: ");
        locacao.setDataInicial(entrada.nextInt());

        System.out.println("informe a data final: ");
        locacao.setDataFinal(entrada.nextInt());
        
        
        }if (opcao == 2){
            System.out.println("Verificar cadastro: ");
            System.out.println(gerenciarLocacoes.toString());
        }if(opcao == 3){
            System.out.println("deletar cadastro: ");
            System.out.println("informe o codigo da locação: ");
            int codigoDaLocacao=entrada.nextInt();
                if(gerenciarLocacoes.existe(codigoDaLocacao)){
                    gerenciarLocacoes.remove(codigoDaLocacao);
                    System.out.println("cadastro deletado");
                }
        }
    }
    
}
 