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
            System.out.println(" ---- Cadastro de veiculos -----");
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

        System.out.println("informe a média de km: ");
        carro.setMediaKm(entrada.nextDouble());

        System.out.println("informe o número de passageiros: ");
        carro.setNumePass(entrada.nextInt());

        System.out.println("Informe o número de porta do carro: ");
        carro.setNumPorta(entrada.nextInt());

        System.out.println("Cadastro finalizado!");
        gerenciarVeiculo.add(veiculo);
        
    }
    public void cadastroDeOnibus(){
        Veiculo veiculo = new Veiculo();
        Onibus onibus = new Onibus(null, null, false, false, 0);

        System.out.println("---Cadastro de onibus---");
        System.out.println("Informe a placa do ônibus: ");
        veiculo.setPlaca(entrada.nextLine());

        System.out.println("informe o ano do ônibus: ");
        veiculo.setAno(entrada.nextInt());

        System.out.println("informe o valor da diária: ");
        veiculo.setValorD(entrada.nextDouble());

        System.out.println("O ônibus possui internet? ");
        onibus.setInternet(entrada.nextBoolean());

        System.out.println("O ônibus possui ar condicionado?");
        onibus.setArC(entrada.nextBoolean());

        System.out.println("informe o numero de passageiro: ");
        onibus.setNumePass(entrada.nextInt());

        System.out.println("Cadastro finalizado!");
        gerenciarVeiculo.add(veiculo);
    }
    public void cadastroDeCaminhao(){
        Veiculo veiculo = new Veiculo();
        Caminhao caminhao = new Caminhao(null, 0, 0);

        System.out.println("---Cadastro de onibus---");
        System.out.println("Informe a placa do ônibus: ");
        veiculo.setPlaca(entrada.nextLine());

        System.out.println("informe o ano do ônibus: ");
        veiculo.setAno(entrada.nextInt());

        System.out.println("informe o valor da diária: ");
        veiculo.setValorD(entrada.nextDouble());

        System.out.println("informe o numero de eixos: ");
        caminhao.setNumEixos(entrada.nextInt());

        System.out.println("informe a carga máxima permitida: ");
        caminhao.seCargaMax(entrada.nextInt());

        System.out.println("Cadastro finalizado!");
        gerenciarVeiculo.add(veiculo);
    }
    public void verificarCadastroVeiculo(){
        System.out.println(gerenciarVeiculo.getInfo());
       System.out.println(carro.toString());
    }

   
    
}
