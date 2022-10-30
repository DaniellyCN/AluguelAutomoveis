import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class GerenciarClienteConsole {
    private Locacao locacao;
    private GerenciarLocacoes gerenciarLocacoes = new GerenciarLocacoes();
    Scanner entrada = new Scanner(System.in);
    static ArrayList<Cliente> listaDClientes = new ArrayList<>();

    public void menuCadastroCliente() {
        int op;
        do {
            System.out.println("cadastro de clientes");
            System.out.println("1.Abrir conta");
            System.out.println("2.Verificar conta");
            System.out.println("3.Deletar conta");

            op = entrada.nextInt();
            entrada.nextLine();
            switch (op) {
                case 1:
                    abrirConta();
                    break;
                case 2:
                    verificarConta();
                    break;
                case 3:
                    deletarConta();
                default:
                    System.out.println("Opção inválida");
            }
        } while (op != 0);
    }

    public void abrirConta() {

        Cliente cliente = new Cliente("", 0, 0, "", 0, "", "", 0, 0);

        System.out.println("Abertura de conta");
        System.out.println("Informe o seu nome : ");
        cliente.setNome(entrada.nextLine());

        System.out.println("Informe o CPF do titular: ");
        cliente.setCpf(entrada.nextLong());

        System.out.println("Informe a rua: ");
        cliente.setRua(entrada.nextLine());

        System.out.println("Informe o numCasa: ");
        cliente.setNumeroCasa(entrada.nextInt());

        System.out.println("Informe o bairro: ");
        cliente.setBairro(entrada.nextLine());

        System.out.println("Informe o cidade: ");
        cliente.setCidade(entrada.nextLine());

        System.out.print("Informe o telefone do titular: ");
        cliente.setTelefone(entrada.nextLong());

        System.out.println("Conta cadastrada!!");

        GerenciarClienteConsole.add(cliente);

    }

    private static void add(Cliente cliente) {
        listaDClientes.add(cliente);
    }

    public void verificarConta() {
        System.out.println(listaDClientes.toString());
    }

    public void deletarConta() {
        System.out.println("você deseja excluir sua conta?");

    }

}
