package AluguelAutomoveis;
import java.util.List;



public  class  GerenciarLocacoes implements ILocacoes{
    private List <Locacao> listaDeLocacoes;
    private String codigoDaLocacao;


    public void incluir (Locacao locacao){
        this.add(locacao);

    }


    public void alterar (int codigo, Locacao locacao){
        //if(get.codigo() ){

        }
    


    public void capturar(int codigo){

    }

    //add uma locação
    public void add(Locacao l){
        listaDeLocacoes.add(l);

    }


    //
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
      return null;
    }
    


    public boolean remove(int codigo){
        for(int i= 0; i<listaDeLocacoes.size();i++){
            if(listaDeLocacoes.get(i).getCodigoDaLocacao() == codigo){
                listaDeLocacoes.remove(i);
                return true;
            }

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
        String dados = "Código da locação " + codigoDaLocacao;
        for(Locacao l : listaDeLocacoes){
            dados += l.toString()+"\n";
        }
        return dados;
     }

}
