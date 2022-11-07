package gerenciar;


import java.util.ArrayList;

public class GerenciarClientes implements IClientes{

    ArrayList<Cliente> listaDClientes=new ArrayList<>();
    
   
    public void add(Cliente c) {
         listaDClientes.add(c);    
    }

    
   
    public Cliente get(long CPF) {
        for(int i=0;i<listaDClientes.size();i++){
            if (listaDClientes.get(i).getCpf()== CPF) {
                return listaDClientes.get(i);
            } 
        } System.out.println(" o cliente é : " + CPF);
        return null;
    }

  
  
    public String getInfo(long CPF) {
        for(int i=0;i<listaDClientes.size();i++){
            if (listaDClientes.get(i).getCpf()==CPF) {
                return "CPF do cliente: "+listaDClientes.get(i).getCpf();
            }
        }
        return null;
    }

   
    public String getInfo() {
        String dados = "";
        for(int i=0;i<listaDClientes.size();i++){
            dados += "CPF do cliente: "+listaDClientes.get(i).getCpf();
        }
        return dados;
    } 

    
    public String getResumoInfo() {
        String dados = "";
        for(int i=0;i<listaDClientes.size();i++){
            if(listaDClientes.get(i) != null){
                dados += "\n Detalhes do cadastro do cliente: \n CPF: "+listaDClientes.get(i).getCpf()+ " Nome: "+listaDClientes.get(i).getNome()+" Rua: " + listaDClientes.get(i).getRua()+" Número da casa: "+ listaDClientes.get(i).getNumeroCasa()+ " Bairro: "+ listaDClientes.get(i).getBairro()+" Cidade: "+listaDClientes.get(i).getCidade()+" Telefone: "+listaDClientes.get(i).getTelefone()+ "Carteira de motorista: " + listaDClientes.get(i).getCnh()+ "\n ------";
            }
        }
        return dados;

    }
    
    public boolean remove(long CPF) {
        for(int i=0;i<listaDClientes.size();i++){
            if (listaDClientes.get(i).getCnh()== CPF) {
                listaDClientes.remove(i);
                return true;
            }
        } System.out.println("\n CPf encontrado, o cpf do cliente é: "+ CPF + "\n Nome do cliente: "+ listaDClientes.get(0).getNome());
        return false;
    }


   
    public boolean existe(long CPF) {
        for(int i=0;i<listaDClientes.size();i++){
            if (listaDClientes.get(i).getCpf()== CPF){
                return true;
            }
        }
        return false;
    }

}