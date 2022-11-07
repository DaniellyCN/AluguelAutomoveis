package gui;
import java.util.Scanner;
import gerenciar.GerenciarClientes;
import gerenciar.GerenciarLocacoes;
import gerenciar.GerenciarVeiculo;
import gerenciar.Locacao;

/*
 * Classe de interface gráfica responsável por cadastrar, verificar e deletar locações.
 */
public class GerenciarLocacoesConsole  {
    private GerenciarLocacoes gerenciarLocacoes = new GerenciarLocacoes();
    private GerenciarClientes gerenciarClientes = new GerenciarClientes();
    private GerenciarVeiculo gerenciarVeiculo = new GerenciarVeiculo();
    Scanner entrada = new Scanner(System.in);

    /**
     * @param gerenciarLocacoes Passa de parâmetro gerenciarLocacoes onde possui os métodos para manipular a classe.
     */
    public GerenciarLocacoesConsole (GerenciarLocacoes gerenciarLocacoes){
        this.gerenciarLocacoes=gerenciarLocacoes;
    }
    public GerenciarLocacoesConsole(){

    }

    /**
     * Menu da locação de veículos
     */
    public void menuLocacao(){
        int op; 
        do{
            System.out.println("---- Cadastro da locação ----");
            System.out.println(" 1.Cadastrar \n 2.Verificar cadastro \n 3.Deletar cadastro  \n 4.Sair");
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

    /**
     * Método para cadastrar locação de veículos.
     */
    public void CadastrarLocacao(){
        Locacao locacao = new Locacao();
    
        System.out.println("Digite o código da locação: ");
        locacao.setCodigoDaLocacao(entrada.nextInt());

        System.out.println("Informe o CPF do titular: ");
        locacao.setCliente(gerenciarClientes.get(entrada.nextLong()));
       
        System.out.println("Informe a placa do veiculo para a locação");
        locacao.setVeiculo(gerenciarVeiculo.get(entrada.nextLine()));
          
        entrada.nextLine();
        System.out.println("Informe se o veículo possui seguro: ");
        locacao.setSeguro(entrada.nextLine());
    
        System.out.println("Informe a data inicial da locação: ");
        locacao.setDataInicial(entrada.nextLine());
        
        System.out.println("Informe a data final: ");
        locacao.setDataFinal(entrada.nextLine());

        System.out.println(" Cadastro concluído! ");
        gerenciarLocacoes.add(locacao);
    }
    /**
     * Método para verificar cadastro de veículos.
     */
    public void verificarCadastro(){
        System.out.println("Verificar cadastro: ");
        System.out.println(gerenciarLocacoes.getInfo());
        
    }
    /**
     * Método para deletar cadastro de veículos.
     */
    public void deletarCadastro(){
        System.out.println("Deletar cadastro: ");
        System.out.println("Informe o codigo da locação: ");
        int codigoDaLocacao=entrada.nextInt();
            if(gerenciarLocacoes.existe(codigoDaLocacao)){
                gerenciarLocacoes.remove(codigoDaLocacao);
                System.out.println("Cadastro deletado!");
            }
    } 
    /**
     * Método para voltar para o menu principal.
     */
    public void sair (){
        MenuPrincipal menuPrincipal = new MenuPrincipal();
        menuPrincipal.menuPrincipal();
    }
}
 