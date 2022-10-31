import java.util.Scanner;

public class GerenciarVeiculosConsole {
    private GerenciarVeiculo gerenciarVeiculo;
    Scanner entrada = new Scanner(System.in);

    public GerenciarVeiculosConsole (GerenciarVeiculosConsole gerenciarVeiculosConsole){
        this.gerenciarVeiculo= gerenciarVeiculo;
    }

    public void menuCadastroVeiculo(){
        int op; 
        do{
            System.out.println("cadastro de veiculos");// a logica para esse menu pode ser diferente!
            System.out.println("1.Cadastro de carro");
            System.out.println("2.Cadastro de ônibus");
            System.out.println("3.Cadastro de Caminhão");

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
                    default: 
                    //System.out.println("Opção inválida");
            }
        }while(op!=0); 
    }
    public void cadastroDeCarro(){
        
    }
    public void cadastroDeOnibus(){

    }
    public void cadastroDeCaminhao(){
    
    }
}
