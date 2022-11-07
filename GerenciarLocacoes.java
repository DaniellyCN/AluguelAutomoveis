import java.util.List;
import java.util.ArrayList;


public  class  GerenciarLocacoes implements ILocacoes{
    private List <Locacao> listaDeLocacoes;
  
    public GerenciarLocacoes (){
        listaDeLocacoes = new ArrayList<>();
    }

    public void add(Locacao l){
        listaDeLocacoes.add(l);

    }

    public Locacao get(int codigo){

       for(int i=0; i<listaDeLocacoes.size();i++){
        if(listaDeLocacoes.get(i).getCodigoDaLocacao() == codigo){
            return listaDeLocacoes.get(i);
        }
       }
       return null;
    }


    public String getInfo( int codigo){
        for(int i = 0; i<listaDeLocacoes.size();i++){
            if(listaDeLocacoes.get(i).getCodigoDaLocacao() == codigo){
                return "Código" + listaDeLocacoes.get(i).getCodigoDaLocacao();
            }
        } 
        return null;
    }



    public String getInfo(){
        for(int i=0; i<listaDeLocacoes.size();){
            return "Código:  " + listaDeLocacoes.get(i).getCodigoDaLocacao()+ "\n Titular da locação: "+listaDeLocacoes.get(i).getCliente()+"\n Veículo: "+listaDeLocacoes.get(i).getVeiculo()+"\n Seguro do veículo: "+listaDeLocacoes.get(i).getSeguro()+"\n Data inicia da locação"+listaDeLocacoes.get(i).getDataInicial()+"\n Data final da locação"+listaDeLocacoes.get(i).getDataFinal();
        }
      return null;
    }
    


    public boolean remove(int codigo){
        for(int i= 0; i<listaDeLocacoes.size();i++){
            if(listaDeLocacoes.get(i).getCodigoDaLocacao() == codigo){
                listaDeLocacoes.remove(i);
                return true;
            }
            System.out.println(" CPf encontrado, o cpf do cliente é: "+ codigo);
        }
        return false;
    }



    public boolean existe(int codigo){
       for(int i =0; i<listaDeLocacoes.size();i++){
        if(listaDeLocacoes.get(i).getCodigoDaLocacao()==codigo){
            return true;
        }

       }
       return false;
    } 
    

    public String toString(){

       
        String dados = ""; 
        for(Locacao l : listaDeLocacoes){
            dados += l.toString()+"\n";
        }
        return dados;
     }
    
}
