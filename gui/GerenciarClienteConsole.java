package gui;


import java.util.InputMismatchException;
import java.util.Scanner;

import gerenciar.Cliente;
import gerenciar.GerenciarClientes;


/*
 * Classe de interface gráfica do cliente, responsável por abrir, verificar e deletar cadastro do cliente.
 */
public class GerenciarClienteConsole {
    private  GerenciarClientes gerenciarClientes;
    Scanner entrada = new Scanner(System.in);

    /**
     * @param gerenciarClientes  Passa de parâmetro gerenciar clientes onde possui os métodos para manipular a classe.
     */
    public GerenciarClienteConsole(GerenciarClientes gerenciarClientes) {
        this.gerenciarClientes = gerenciarClientes;
    }
    public GerenciarClienteConsole() {}

    /**
     * Menu de cadastro, verificação e exclusão.
     */
    public void menuCadastroCliente() {
        int op;
        do {
            System.out.println(" **** Cadastro de clientes ****");
            System.out.println("[1] Abrir cadastro");
            System.out.println("[2] Verificar cadastro");
            System.out.println("[3] Deletar cadastro");
            System.out.println("[4] Sair");

            op = entrada.nextInt();
            entrada.nextLine();
            switch (op) {
                case 1:
                    abrircadastro();
                    break;
                case 2:
                    verificarCadastro();
                    break;
                case 3:
                    deletarCadastro();
                default:
                    op = 0;
            }
        } while (op != 0);
    }

    /**
     * Método para abrir cadastro do cliente
     */
    public void abrircadastro() {
        try {
            Cliente cliente = new Cliente(null, 0, 0, null, 0, null, null, 0, 0);

            System.out.println("-----------------------------------------");
            System.out.println(" Abertura do cadastro: ");
            System.out.print("Informe o seu nome: ");
            cliente.setNome(entrada.nextLine());
    
            System.out.print("Informe o CPF do titular: ");
            cliente.setCpf(entrada.nextLong());
    
            System.out.print("informe sua carteira de motorista: ");
            cliente.setCnh(entrada.nextLong());
    
            System.out.print("Informe a rua: ");
            cliente.setRua(entrada.nextLine());
            entrada.nextLine();
            System.out.print("Informe o número da casa: ");
            cliente.setNumeroCasa(entrada.nextInt());
    
            System.out.print("Informe o bairro: ");
            cliente.setBairro(entrada.nextLine());
            entrada.nextLine();
    
            System.out.print("Informe a cidade: ");
            cliente.setCidade(entrada.nextLine());
    
            System.out.print("Informe o telefone do titular: ");
            cliente.setTelefone(entrada.nextLong());
    
            System.out.println("Conta cadastrada!!");
            System.out.println("-----------------------------------------");
            gerenciarClientes.add(cliente);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
       

    }


    /**
     *Método que verifica o cadastro do cliente.
     */
    public void verificarCadastro() {
        System.out.println(gerenciarClientes.getResumoInfo());
    }

    /**
     * Método para deletar cadastro do cliente.
     */
    public void deletarCadastro() {
        Scanner entrada = new Scanner(System.in);
        int opcao = 0;
        do{
            try {
                System.out.println("\n\nDeseja excluir esse cadastro ?\n  1.Sim\n  2.Não");
                opcao = entrada.nextInt();
                if (opcao == 1) {
                    System.out.println("Digite seu CPF:");
                    long cpf = entrada.nextLong();
        
                    if (gerenciarClientes.existe(cpf)) {
                        gerenciarClientes.remove(cpf);
                        System.out.println("Conta excluida!!");
                    }
                }
                if (opcao == 2) {
                    System.out.println("Processo cancelado");
                }
            }catch (Exception e) {
                System.out.println("Digite um valor válido");
            }finally{
                entrada.nextLine();
            }
            
        }while(opcao!=1 && opcao!=2);
        

    }

    
}
