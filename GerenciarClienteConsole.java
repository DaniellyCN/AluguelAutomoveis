import java.util.Scanner;

public class GerenciarClienteConsole{
    private GerenciarClientes gerenciarClientes;
    Scanner entrada = new Scanner(System.in);
    

    public GerenciarClienteConsole (GerenciarClientes gerenciarClientes){
        this.gerenciarClientes = gerenciarClientes;
    }

    public GerenciarClienteConsole(){

    }

    public void menuCadastroCliente(){
        int op; 
        do{
            System.out.println("-------- cadastro de clientes -------");
            System.out.println("1.Abrir conta");
            System.out.println("2.Verificar conta");
            System.out.println("3.Deletar conta");

            op = entrada.nextInt();
            entrada.nextLine();
            switch(op){
                case 1: 
                abrirConta();
                    break;
                case 2: 
                verificarConta();
                    break;
                case 3:
                deletarConta();
                    default: 
                case 4:
                GerenciarLocacoesConsole gerenciarLocacoesConsole = new GerenciarLocacoesConsole();
                gerenciarLocacoesConsole.menuLocacao();
                    //System.out.println("Opção inválida");
            }
        }while(op!=0); 
    }


    public void abrirConta(){
        
        Cliente cliente = new Cliente(null, 0, 0, null, 0, null, null, 0, 0);
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("Abertura de conta");
            System.out.print("Informe o seu nome : ");
            cliente.setNome(entrada.nextLine());

            System.out.print("Informe o CPF do titular: ");
            cliente.setCpf(entrada.nextInt());
            entrada.nextLine();
            System.out.print("Informe a rua: ");
            cliente.setRua(entrada.nextLine());

            System.out.print("Informe o numCasa: ");
            cliente.setNumeroCasa(entrada.nextInt());

            System.out.print("Informe o bairro: ");
            cliente.setBairro(entrada.nextLine());
            entrada.nextLine();
            System.out.print("Informe o cidade: ");
            cliente.setCidade(entrada.nextLine());

            System.out.print("Informe o telefone do titular: ");
            cliente.setTelefone(entrada.nextInt());

            System.out.println("Conta cadastrada!!");
            System.out.println("----------------------------------------------------------------------------");
            add(cliente);
        
    }

    private void add(Cliente cliente) {
       gerenciarClientes.add(cliente);
    }
    public void verificarConta(){
        System.out.println(gerenciarClientes.getResumoInfo());
    }
    public void deletarConta(){
       
        int opcao; 
        
        System.out.println("\n\nDeseja excluir esse cadastro ?\n  1.Sim\n  2.Não");
        opcao = entrada.nextInt();
        if(opcao == 1){
            System.out.println("Digite seu CPF:");
            long cpf = entrada.nextLong();
            
            if(gerenciarClientes.existe(cpf)){
                gerenciarClientes.remove(cpf);
                System.out.println("Conta excluida");
            }
            }if(opcao == 2){
                System.out.println("Cadastro cancelado");
            }

    }
}
