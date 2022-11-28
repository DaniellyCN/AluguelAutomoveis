package gui;

import java.util.Scanner;


import gerenciar.Caminhao;
import gerenciar.Carro;
import gerenciar.GerenciarVeiculo;
import gerenciar.Onibus;
import gerenciar.Veiculo;

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

        System.out.println("---Cadastro de carros---");
        System.out.println("Informe a placa do carro: ");
        carro.setPlaca(entrada.nextLine());

        System.out.println("informe o ano do carro: ");
        carro.setAno(entrada.nextInt());

        System.out.println("informe o valor da diária: ");
        carro.setValorD(entrada.nextDouble());

        System.out.println("informe se o carro possui ar condicionado: ");
        carro.setArC(entrada.nextLine());

        entrada.nextLine();

        System.out.println("informe a média de km: ");
        carro.setMediaKm(entrada.nextDouble());

        System.out.println("informe o número de passageiros: ");
        carro.setNumePass(entrada.nextInt());

        System.out.println("Informe o número de porta do carro: ");
        carro.setNumPorta(entrada.nextInt());

        System.out.println("Cadastro finalizado!");
        gerenciarVeiculo.add(carro);
        
    }
    public void cadastroDeOnibus(){
        
        Onibus onibus = new Onibus(null, null, false, false, 0);

        System.out.println("---Cadastro de ônibus---");
        System.out.println("Informe a placa do ônibus: ");
        onibus.setPlaca(entrada.nextLine());

        System.out.println("informe o ano do ônibus: ");
        onibus.setAno(entrada.nextInt());

        System.out.println("informe o valor da diária: ");
        onibus.setValorD(entrada.nextDouble());

        System.out.println("O ônibus possui internet? ");
        onibus.setInternet(entrada.nextLine());

        entrada.nextLine();

        System.out.println("O ônibus possui ar condicionado?");
        onibus.setArC(entrada.nextLine());

        System.out.println("informe o numero de passageiro: ");
        onibus.setNumePass(entrada.nextInt());

        System.out.println("Cadastro finalizado!");
        gerenciarVeiculo.add(onibus);
    }
    public void cadastroDeCaminhao(){
        
        Caminhao caminhao = new Caminhao(null, 0, 0);

        System.out.println("---Cadastro do Caminhão ---");
        System.out.println("Informe a placa do caminhão: ");
        caminhao.setPlaca(entrada.nextLine());

        System.out.println("Informe o ano do caminhão : ");
        caminhao.setAno(entrada.nextInt());

        System.out.println("Informe o valor da diária: ");
        caminhao.setValorD(entrada.nextDouble());

        System.out.println("Informe o numero de eixos: ");
        caminhao.setNumEixos(entrada.nextInt());

        System.out.println("Informe a carga máxima permitida: ");
        caminhao.seCargaMax(entrada.nextInt());

        System.out.println("Cadastro finalizado!");
        gerenciarVeiculo.add(caminhao);

        
        
    }
        public void verificarCadastroVeiculo(){
        System.out.println(gerenciarVeiculo.getInfo());
        System.out.println("tamanho"+gerenciarVeiculo.getLista().size());
        for (Veiculo v : gerenciarVeiculo.getLista()) {
            System.out.println("batata"+v.getPlaca());
        }
       
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
