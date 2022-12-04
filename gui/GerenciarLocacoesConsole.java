package gui;
import java.util.InputMismatchException;
import java.util.Scanner;
//import java.util.concurrent.ExecutionException;

import Excecoes.SeguroException;
import gerenciar.GerenciarClientes;
import gerenciar.GerenciarLocacoes;
import gerenciar.GerenciarVeiculo;
import gerenciar.Locacao;


///alterei o método cadastro


/*
 * Classe de interface gráfica responsável por cadastrar, verificar e deletar locações.
 */
public class GerenciarLocacoesConsole  {
    private int totalLocacoes;
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

    private int criarCodigoLocacao(){
        this.totalLocacoes++;
        return this.totalLocacoes;
    }
    /**
     * Método para cadastrar locação de veículos.
     */
    public void CadastrarLocacao(){
        Locacao locacao = new Locacao();
        boolean CadasLocacao = true;
       
        /*
         * Código da locação gera um código automatico para o cliente.
         */
        System.out.println("O código da locação: ");   
        int novoCodigoLocacao = this.criarCodigoLocacao();        
        System.out.println(novoCodigoLocacao);

        locacao.setCodigoDaLocacao(novoCodigoLocacao);
        
        do{
            System.out.println("Informe o CPF do titular: ");
            try{
                locacao.setCliente(gerenciarClientes.get(entrada.nextLong()));
                CadasLocacao = false;
            }catch(InputMismatchException e ){
                System.out.println("Por favor, insira um valor numérico");
            }
            finally{
                entrada.nextLine();
            }
        }while(CadasLocacao);
        
        CadasLocacao=true;
        do{
            System.out.println("Informe a placa do veiculo");
            try{
            locacao.setVeiculo(gerenciarVeiculo.get(entrada.nextLine()));
            CadasLocacao=false;
            }catch(InputMismatchException e){
                System.out.println("Por favor, insira um valor numérico");
            }
        }while(CadasLocacao);

        CadasLocacao=true;
        do{   
            System.out.println("Informe se o veículo possui seguro: (1) sim (2) não");
            try {
                locacao.setSeguro(entrada.nextInt());
                CadasLocacao=false;
            } catch (SeguroException e) {
                System.out.println(e.getMessage());
            }
            finally{
                entrada.nextLine();
            }
        }while(CadasLocacao); 
    
        CadasLocacao=true;
       do{
            System.out.println("Informe a data inicial da locação: "); 
            try{
                locacao.setDataInicial(entrada.nextLine());
                CadasLocacao=false;
            }catch(InputMismatchException e){
            System.out.println("Por favor, insira um valor válido");
           }
       }while(CadasLocacao);

       CadasLocacao=true;
       do{
            System.out.println("Informe a data final:"); 
            try{
                locacao.setDataFinal(entrada.nextLine());
                CadasLocacao=false;
            }catch(InputMismatchException e){
            System.out.println("Por favor, insira um valor válido");
           }
       }while(CadasLocacao);

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
   
}
 