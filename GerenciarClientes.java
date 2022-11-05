import java.util.ArrayList;

public class GerenciarClientes implements IClientes{

    ArrayList<Cliente> listaDClientes=new ArrayList<>();
    
   
    public void add(Cliente c) {
         listaDClientes.add(c);    
    }

    
    @Override
    public Cliente get(long CPF) {
        for(int i=0;i<listaDClientes.size();i++){
            if (listaDClientes.get(i).getCpf()== CPF) {
                return listaDClientes.get(i);
            } 
        }
        return null;
    }

  
    @Override
    public String getInfo(long CPF) {
        for(int i=0;i<listaDClientes.size();i++){
            if (listaDClientes.get(i).getCpf()==CPF) {
                return "CPF do cliente: "+listaDClientes.get(i).getCpf();
            }
        }
        return null;
    }

    @Override
    public String getInfo() {
        String dados = "";
        for(int i=0;i<listaDClientes.size();i++){
            dados += "CPF do cliente: "+listaDClientes.get(i).getCpf();
        }
        return dados;
    } 

    @Override
    public String getResumoInfo() {
        String dados = "";
        for(int i=0;i<listaDClientes.size();i++){
            if(listaDClientes.get(i) != null){
                dados += "\n Detalhes do cadastro do cliente: \n CPF: "+listaDClientes.get(i).getCpf()+ "\n Nome: "+listaDClientes.get(i).getNome()+"\n Rua: " + listaDClientes.get(i).getRua()+"\n Número da casa: "+ listaDClientes.get(i).getRua()+ "\n Bairro: "+ listaDClientes.get(i).getBairro()+"\n Cidade: "+listaDClientes.get(i).getCidade()+"\n Telefone: "+listaDClientes.get(i).getTelefone()+" \n ------";
            }
        }
        return dados;

    }
    @Override
    public boolean remove(long CPF) {
        for(int i=0;i<listaDClientes.size();i++){
            if (listaDClientes.get(i).getCnh()== CPF) {
                listaDClientes.remove(i);
                return true;
            }
        } System.out.println("\n CPf encontrado, o cpf do cliente é: "+ CPF + "\n Nome do cliente: "+ listaDClientes.get(0).getNome());
        return false;
    }


    @Override
    public boolean existe(long CPF) {
        for(int i=0;i<listaDClientes.size();i++){
            if (listaDClientes.get(i).getCpf()== CPF){
                return true;
            }
        }
        return false;
    }

    //toString

}