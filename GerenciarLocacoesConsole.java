import java.util.Scanner;
public class GerenciarLocacoesConsole  {
    private GerenciarLocacoes gerenciarLocacoes = new GerenciarLocacoes();
    private GerenciarClientes gerenciarClientes = new GerenciarClientes();
    private GerenciarVeiculo gerenciarVeiculo = new GerenciarVeiculo();
    Scanner entrada = new Scanner(System.in);

    public GerenciarLocacoesConsole (GerenciarLocacoes gerenciarLocacoes){
        this.gerenciarLocacoes=gerenciarLocacoes;
    }
    public GerenciarLocacoesConsole(){

    }

    public void menuLocacao(){
        int op; 
        do{
            System.out.println("---- Cadastro da locação ----");
            System.out.println("\n 1.Cadastrar \n  2 - Verificar cadastro \n  3 - Deletar cadastro \n 4 -Sair");
            op = entrada.nextInt();
            entrada.nextLine();
            switch(op){
                case 1:
                CadastrarLocacao();
                    break;
                case 2: 
                verificarCadastro();
                case 3:
                deletarCadastro();
                case 4: 
                sair();
                default: 
            }
        }while(op!=0); 
    }

    public void CadastrarLocacao(){
        Locacao locacao = new Locacao();
      

        System.out.println("Digite o código da locação: ");
        locacao.setCodigoDaLocacao(entrada.nextInt());

        System.out.println("Informe o titular da locação");// cpf do cliente.
        locacao.setCliente(gerenciarClientes.get(entrada.nextInt()));
        


        System.out.println("informe o veículo para a locação");
        locacao.setVeiculo(gerenciarVeiculo.get(entrada.nextLine()));
        entrada.nextLine();

        System.out.println("informe se o veículo possui seguro: ");
        locacao.setSeguro(entrada.nextBoolean());
        entrada.nextLine();

        System.out.println("informe a data inicial da locação: ");
        locacao.setDataInicial(entrada.nextLine());
        
        System.out.println("informe a data final: ");
        locacao.setDataFinal(entrada.nextLine());

        gerenciarLocacoes.add(locacao);
    }
    public void verificarCadastro(){
        System.out.println("Verificar cadastro: ");
        System.out.println(gerenciarLocacoes.getInfo());
        
    }
    public void deletarCadastro(){
        System.out.println("deletar cadastro: ");
        System.out.println("informe o codigo da locação: ");
        int codigoDaLocacao=entrada.nextInt();
            if(gerenciarLocacoes.existe(codigoDaLocacao)){
                gerenciarLocacoes.remove(codigoDaLocacao);
                System.out.println("cadastro deletado");
            }
    } 
    public void sair (){
        MenuPrincipal menuPrincipal = new MenuPrincipal();
        menuPrincipal.menuPrincipal();
    }
}
 