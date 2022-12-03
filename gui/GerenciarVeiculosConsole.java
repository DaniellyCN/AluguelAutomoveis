package gui;

import java.util.Scanner;


import gerenciar.Caminhao;
import gerenciar.Carro;
import gerenciar.GerenciarVeiculo;
import gerenciar.Onibus;
import gerenciar.Veiculo;
import java.util.InputMismatchException;
import Excecoes.ArCondicionadoException;

public class GerenciarVeiculosConsole{

    private GerenciarVeiculo gerenciarVeiculo;


    Scanner entrada = new Scanner(System.in);

    public GerenciarVeiculosConsole (GerenciarVeiculo gerenciarVeiculo){
        this.gerenciarVeiculo= gerenciarVeiculo;
    }

    public void menuCadastroVeiculo(){
        int op; 
        do{
            System.out.println(" ---- Cadastro de veiculos -----");
            System.out.println("1.Cadastro de carro");
            System.out.println("2.Cadastro de ônibus");
            System.out.println("3.Cadastro de Caminhão");
            System.out.println("4.Verificar cadastros dos veículos");
            System.out.println("5. deletar veiculo");
            System.out.println("6.Sair");
            
            op = entrada.nextInt();
            entrada.nextLine();
            switch(op){
                case 1: 
                cadastroDeCarro();
                    break;
                case 2: 
                cadastroDeOnibus();
                    break;
                case 3:
                cadastroDeCaminhao();
                break;
                case 4: 
                verificarCadastroVeiculo();
                break;
                case 5: 
                
                deletarVeiculos();
                break;
                case 6: 
                
                    default: 
                    //System.out.println("Opção inválida");
            }
        }while(op!=6); 
    }

    public void cadastroDeCarro(){
        
        Carro carro = new Carro();
        boolean testCarro = true;

        System.out.println("---Cadastro de carros---");
        System.out.println("Informe a placa do carro: ");
        carro.setPlaca(entrada.nextLine());

        do{
            
            System.out.println("Informe o ano do carro: ");
            try {
                carro.setAno(entrada.nextInt());
                testCarro=false;
            } catch (InputMismatchException e) {
                System.out.println("Por favor, insira um valor numérico");
                entrada.nextLine();
               
            }
        }while(testCarro);
         
        testCarro=true;
        do{   
            System.out.println("Informe o valor da diária: ");
            try {
                carro.setValorD(entrada.nextDouble());
                testCarro=false;
            } catch (InputMismatchException e) {
                System.out.println("Por favor, insira um valor numérico");
                entrada.nextLine();  
            }
        }while(testCarro);
  
        testCarro=true;
        do{   
            System.out.println("Informe se o carro possui ar condicionado: (1) sim (2) não");
            try {
                carro.setArC(entrada.nextInt());
                testCarro=false;
            } catch (ArCondicionadoException e) {
                System.out.println(e.getMessage());
            }
        }while(testCarro);            
        

        testCarro=true;
        do{   
            System.out.println("Informe a média de km: ");
            try {
                carro.setMediaKm(entrada.nextDouble());
                testCarro=false;
            } catch (InputMismatchException e) {
                System.out.println("Por favor, insira um valor numérico");
                entrada.nextLine();  
            }
        }while(testCarro);

        testCarro=true;
        do{   
            System.out.println("Informe o número de passageiros: ");
            try {
                carro.setNumePass(entrada.nextInt());
                testCarro=false;
            } catch (InputMismatchException e) {
                System.out.println("Por favor, insira um valor numérico");
                entrada.nextLine();  
            } catch(Exception e1){
                System.out.println(e1.getMessage());

            }
        }while(testCarro);
        
        testCarro=true;
        do{   
             System.out.println("Informe o número de porta do carro: ");
            try {
                carro.setNumPorta(entrada.nextInt());
                testCarro=false;
            } catch (InputMismatchException e) {
                System.out.println("Por favor, insira um valor numérico");
                entrada.nextLine();  
            } catch (Exception e1){
                System.out.println(e1.getMessage());
            }
        }while(testCarro);
        

        System.out.println("Cadastro finalizado!");
        gerenciarVeiculo.add(carro);
        
    }
    public void cadastroDeOnibus(){
        
        Onibus onibus = new Onibus(null, null, false, false, 0);
        boolean testOnibus =true;

        System.out.println("---Cadastro de ônibus---");
        System.out.println("Informe a placa do ônibus: ");
        onibus.setPlaca(entrada.nextLine());

        testOnibus =true;
        do{
            System.out.println("informe o ano do ônibus: ");
            try {
                onibus.setAno(entrada.nextInt());
                testOnibus=false;
            } catch (InputMismatchException e) {
                System.out.println("Por favor, insira um valor numérico");
                entrada.nextLine();
            }
        }while(testOnibus);

        testOnibus =true;
        do{   
            System.out.println("Informe o valor da diária: ");
            try {
                onibus.setValorD(entrada.nextDouble());
                testOnibus=false;
            } catch (InputMismatchException e) {
                System.out.println("Por favor, insira um valor numérico");
                entrada.nextLine();  
            }
        }while(testOnibus);

        testOnibus=true;
        do{   
            System.out.println("O ônibus possui internet? (1) sim (2) não"); 
            try {
                onibus.setInternet(entrada.nextInt());
                testOnibus=false;
            } catch (ArCondicionadoException e) {
                System.out.println(e.getMessage());
            } catch(Exception e1){
                System.out.println(e1.getMessage());
            }
        }while(testOnibus);
        
        
        testOnibus=true;
        do{   
            System.out.println("O ônibus possui ar condicionado? (1) sim (2) não"); 
            try {
                onibus.setArC(entrada.nextInt());
                testOnibus=false;
            } catch (ArCondicionadoException e) {
                System.out.println(e.getMessage());
            }
        }while(testOnibus); 

        testOnibus=true;
        do{   
            System.out.println("Informe o numero de passageiro: ");
            try {
                onibus.setNumePass(entrada.nextInt());
                testOnibus=false;
            } catch (InputMismatchException e) {
                System.out.println("Por favor, insira um valor numérico");
                entrada.nextLine();  
            }
        }while(testOnibus);
        

        System.out.println("Cadastro finalizado!");
        gerenciarVeiculo.add(onibus);
    }
    public void cadastroDeCaminhao(){
        
        Caminhao caminhao = new Caminhao(null, 0, 0);

        System.out.println("---Cadastro do Caminhão ---");
        System.out.println("Informe a placa do caminhão: ");
        caminhao.setPlaca(entrada.nextLine());

        boolean testCaminhao1 =true;
        do{
            System.out.println("Informe o ano do caminhão : ");
            try {
                caminhao.setAno(entrada.nextInt());
                testCaminhao1=false;
            } catch (InputMismatchException e) {
                System.out.println("Por favor, insira um valor numérico");
                entrada.nextLine();
            }
        }while(testCaminhao1);

        boolean testCaminhao2 =true;
        do{   
            System.out.println("Informe o valor da diária: ");
            try {
                caminhao.setValorD(entrada.nextDouble());
                testCaminhao2=false;
            } catch (InputMismatchException e) {
                System.out.println("Por favor, insira um valor numérico");
                entrada.nextLine();  
            }
        }while(testCaminhao2);

        boolean testCaminhao3 =true;
        do{   
            System.out.println("Informe o numero de eixos: ");
            try {
                caminhao.setNumEixos(entrada.nextInt());
                testCaminhao3=false;
            } catch (InputMismatchException e) {
                System.out.println("Por favor, insira um valor numérico");
                entrada.nextLine();  
            }
        }while(testCaminhao3);

        boolean testCaminhao4 =true;
        do{   
            System.out.println("Informe a carga máxima permitida: ");
            try {
                caminhao.seCargaMax(entrada.nextInt());
                testCaminhao4=false;
            } catch (InputMismatchException e) {
                System.out.println("Por favor, insira um valor numérico");
                entrada.nextLine();  
            }
        }while(testCaminhao4);        

        System.out.println("Cadastro finalizado!");
        gerenciarVeiculo.add(caminhao);

    }
    public void verificarCadastroVeiculo(){
    System.out.println(gerenciarVeiculo.getInfo());

    }
       
    
    
    public void deletarVeiculos (){
        System.out.println("\n Deseja excluir esse cadastro ?\n  1.Sim\n  2.Não");
        int opcao = entrada.nextInt();
        entrada.nextLine();
        if (opcao == 1) {
            System.out.println("Digite o número da placa:");
             String placa = entrada.nextLine();

            if (gerenciarVeiculo.existe(placa)) {
                gerenciarVeiculo.remove(placa);
                System.out.println("Conta excluida!!");
            }
        }
        if (opcao == 2) {
            System.out.println("Processo cancelado");
        }

    }
    
}
