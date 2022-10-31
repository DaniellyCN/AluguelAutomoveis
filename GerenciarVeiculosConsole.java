import java.util.Scanner;

public class GerenciarVeiculosConsole {
    private GerenciarVeiculo gerenciarVeiculo;
    private GerenciarVeiculo gVeiculo = new GerenciarVeiculo();
    private Carro carro = new Carro();
    Scanner entrada = new Scanner(System.in);

    public GerenciarVeiculosConsole (GerenciarVeiculo gerenciarVeiculo){
        this.gerenciarVeiculo= gerenciarVeiculo;
    }

    public void menuCadastroVeiculo(){
        int op; 
        do{
            System.out.println(" ---- Cadastro de veiculos -----");// a logica para esse menu pode ser diferente!
            System.out.println("1.Cadastro de carro");
            System.out.println("2.Cadastro de ônibus");
            System.out.println("3.Cadastro de Caminhão");
            System.out.println("4.Verificar cadastros dos veículos");

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
                case 4: 
                verificarCadastroVeiculo();
                    default: 
                    //System.out.println("Opção inválida");
            }
        }while(op!=0); 
    }
    public void cadastroDeCarro(){
        Veiculo veiculo = new Veiculo();
        Carro carro = new Carro();

        System.out.println("---Cadastro de carros---");
        System.out.println("Informe a placa do carro: ");
        veiculo.setPlaca(entrada.nextLine());

        System.out.println("informe o ano do carro: ");
        veiculo.setAno(entrada.nextInt());

        System.out.println("informe o valor da diária: ");
        veiculo.setValorD(entrada.nextDouble());

        System.out.println("informe se o carro possui ar condicionado: ");
        carro.setArC(entrada.nextBoolean());

        System.out.println("Cadastro finalizado!");
        gerenciarVeiculo.add(veiculo);
        
    }
    public void cadastroDeOnibus(){
        
    }
    public void cadastroDeCaminhao(){
    
    }
    public void verificarCadastroVeiculo(){
        System.out.println(gerenciarVeiculo.getInfo());
       
    }
}
