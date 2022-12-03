package gui;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;

import gerenciar.GerenciarClientes;
import gerenciar.GerenciarLocacoes;
import gerenciar.GerenciarVeiculo;
import gerenciar.Locacao;


///alterei o método cadastro


/*
 * Classe de interface gráfica responsável por cadastrar, verificar e deletar locações.
 */
public class GerenciarLocacoesConsole  {
    private GerenciarLocacoes gerenciarLocacoes;// = new GerenciarLocacoes();
    private GerenciarClientes gerenciarClientes;// = new GerenciarClientes();
    private GerenciarVeiculo gerenciarVeiculo;
    Scanner entrada = new Scanner(System.in);

    /**
     * @param gerenciarLocacoes Passa de parâmetro gerenciarLocacoes onde possui os métodos para manipular a classe.
     */
    public GerenciarLocacoesConsole (GerenciarLocacoes gerenciarLocacoes, GerenciarClientes gerenciarClientes, GerenciarVeiculo gerenciarVeiculo){
        this.gerenciarLocacoes = gerenciarLocacoes;
        this.gerenciarClientes = gerenciarClientes;
        this.gerenciarVeiculo = gerenciarVeiculo;
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
                    break;
                    case 3:
                        deletarCadastro();
                    break;
                    case 4: 
                    
                    default: 
                    //op=0;
                
                }
            
            
        }while(op!=4); 
    }

    /**
     * Método para cadastrar locação de veículos.
     */
    public void CadastrarLocacao(){
        boolean ok;
        Locacao locacao = new Locacao();
       
           
                System.out.println("O código da locação: ");
                System.out.println(Locacao.getCodigoDaLocacao());

        do{
            try{
                ok = true;
                System.out.println("Informe o CPF do titular: ");
                locacao.setCliente(gerenciarClientes.get(entrada.nextLong()));
            
            }
            catch(InputMismatchException e ){
                ok= false;
                System.out.println("erro: digite um valor valido");

            }
            finally{
                entrada.nextLine();
            }
        }while(!ok);

        do{
            try{
                System.out.println("Informe a placa do veiculo para a locação");
                locacao.setVeiculo(gerenciarVeiculo.get(entrada.nextLine()));
                
            
                System.out.println("Informe se o veículo possui seguro: "); //erro se o usuário informar um numero 
                locacao.setSeguro(entrada.nextLine());
            
                System.out.println("Informe a data inicial da locação: "); // 
                locacao.setDataInicial(entrada.nextLine());
                
                System.out.println("Informe a data final: ");
                locacao.setDataFinal(entrada.nextLine());

                System.out.println(" Cadastro concluído! ");
                gerenciarLocacoes.add(locacao);
            }
            catch(InputMismatchException e){
                ok= false;
                System.out.println("erro: ");
            }
            

        }while(!ok);
       
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
   
}
 