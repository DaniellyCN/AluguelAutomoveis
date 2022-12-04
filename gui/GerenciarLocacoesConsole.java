package gui;
import java.util.Calendar;
import java.util.InputMismatchException;
import java.util.Scanner;
//import java.util.concurrent.ExecutionException;

import Excecoes.CalendarioException;
import Excecoes.CodigoInexistenteException;
import Excecoes.LocacaoNaoPodeSerEfetuada;
import Excecoes.PlacaException;
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
    private final String TEXTO_PREENCHER_CPF = "Informar o cpf do titular";
    private final String TEXTO_PREENCHER_PLACA = "Informe a placa do veiculo";
    private final String TEXTO_PREENCHER_DATAINICIAL = "Informe a data inicial da locação:";
    private final String TEXTO_PREENCHER_DATAFINAL = "Informe a data final da locação:";
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


    ///// DEU CERTO   
    private long obterEntradaLong(String cpfDoTitular){
        long resultado = 0;
        boolean CadastroLocacao = true;

        do{
            System.out.println(cpfDoTitular);
            try{
                resultado= entrada.nextLong();
                CadastroLocacao = false;
            }catch(InputMismatchException e ){
                System.out.println("Por favor, insira um valor numérico");
            }finally{
                entrada.nextLine();
            }
        }while(CadastroLocacao);
    return resultado;
    }

    //AQUIIIIII
    private String obterEntradaString(String placaDoVeiculo){
        String resultado = "";
        boolean CadastroLocacao = true;

        do{
            System.out.println(placaDoVeiculo);
            try{
                resultado = entrada.nextLine();
                CadastroLocacao = false;
            }catch(InputMismatchException e ){
                System.out.println("Por favor, insira um valor numérico");
            }
        }while(CadastroLocacao);
        return resultado;
    }













    private int obterEntradaInt (String pergunta) {
        int resultado = 0;
        boolean CadasLocacao = true;

        do{
            System.out.println(pergunta);
            try{
                
                resultado = entrada.nextInt();
                CadasLocacao = false;
            }catch(InputMismatchException e ){
                System.out.println("Por favor, insira um valor válido");
            }
            finally{
                entrada.nextLine();
            }
        }while(CadasLocacao);
        return resultado;
    }
    

    
    private String obterEntrada(String dataInicial){
        String resultado = "";
        boolean CadasLocacao = true;

        do{
            System.out.println(dataInicial);
            try{
                resultado = entrada.nextLine();
                CadasLocacao = false;
            }catch(InputMismatchException e ){
                System.out.println("por favor, digite um numero valido ");
            }
            finally{
                entrada.nextLine();
            }
        }while(CadasLocacao);
        return resultado;
    }

    private String obterEntradaFinal(String dataFinal){
        String resultado = "";
        boolean CadasLocacao = true;

        do{
            System.out.println(dataFinal);
            try{
                resultado = entrada.nextLine();
                CadasLocacao = false;
                
            }catch(InputMismatchException e ){
                System.out.println("Por favor, insira um valor numérico");
                entrada.nextLine();
            }
            
        }while(CadasLocacao);
        return resultado;
    }

    private String preencherData(String pergunta) {
        boolean cadastroLocacao =true;
        String data ="";
        do{   
            try {
                System.out.println(pergunta);
                int dia = this.obterEntradaInt("informe o dia ");
                int mes = this.obterEntradaInt("informe o mês ");
                int ano = this.obterEntradaInt("informe o ano ");
                data = dia + "/" + mes + "/" + ano;
                cadastroLocacao=false;
            } catch (CalendarioException e) {
                System.out.println(e.getMessage());
            }
        }while(cadastroLocacao); 
        return data;
    }

    public void CadastrarLocacao(){
        Locacao locacao = new Locacao();
        boolean CadasLocacao = true;
       
        System.out.println("O código da locação: ");   
        int novoCodigoLocacao = this.criarCodigoLocacao();        
        System.out.println(novoCodigoLocacao);

        locacao.setCodigoDaLocacao(novoCodigoLocacao);
        
        locacao.setCliente(gerenciarClientes.get(this.obterEntradaLong(this.TEXTO_PREENCHER_CPF)));
        locacao.setVeiculo(gerenciarVeiculo.get(this.obterEntradaString(this.TEXTO_PREENCHER_PLACA)));

        CadasLocacao=true;
        do{   
            try {

               int valor = this.obterEntradaInt("Informe se o veículo possui seguro: (1) sim (2) não");
                if (valor != 1 && valor != 2){
                    throw new SeguroException();
                }
                
                CadasLocacao=false;
            } catch (SeguroException e) {
                System.out.println(e.getMessage());
                entrada.nextLine();
            }
        }while(CadasLocacao); 
    
        locacao.setDataInicial(this.preencherData("Digite a data inicial"));
        locacao.setDataInicial(this.preencherData("Digite a data final"));
        this.gerenciarLocacoes.add(locacao);
    }
       
    /**
     * Método para verificar cadastro de veículos.
     */
    public void verificarCadastro(){
        try{
            System.out.println("Verificar cadastro: ");
            System.out.println(gerenciarLocacoes.getInfo());
            
        }catch(RuntimeException e ){
            System.out.println(e.getMessage());
        }
    }
    
    /**
     * Método para deletar cadastro de veículos.
     */
    public void deletarCadastro(){
        System.out.println("Deletar cadastro: ");
       
        System.out.println("Informe o codigo da locação: ");
        int codigoDaLocacao=entrada.nextInt();
        boolean teste = false;

        try{
            teste = gerenciarLocacoes.existe(codigoDaLocacao);
            if(teste == true){
                System.out.println("Deseja excluir esse cadastro? \n 1.Sim\n2.Não");
                int opcao = entrada.nextInt();
    
                if(opcao == 1){
                    gerenciarLocacoes.remove(codigoDaLocacao);
                    System.out.println("Conta excluida");
                }else if(opcao == 2){
                    System.out.println("processo cancelado ");
                }else {
                    System.out.println("opcao invalida");
                }
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    } 
}
 