package gerenciar;


import java.util.List;
import java.util.ArrayList;

/*
 * Classe implementada da ILocacoes
 */
public  class  GerenciarLocacoes implements ILocacoes{
    private List <Locacao> listaDeLocacoes;
  
    /**
     * Lista de locações
     */
    public GerenciarLocacoes (){
        listaDeLocacoes = new ArrayList<>();
    }

    public GerenciarLocacoes (List<Locacao> listaLocacoes){
        this.listaDeLocacoes = listaLocacoes;
    }

    /* (non-Javadoc)
     * @see gerenciar.ILocacoes#add(gerenciar.Locacao)
     */
    public void add(Locacao l){
        listaDeLocacoes.add(l);

    }
//nullpointer  com uma mensagem especifica, codigo inexistente
    /* (non-Javadoc)
     * @see gerenciar.ILocacoes#get(int)
     */
    public Locacao get(int codigo){

      for(int i=0; i<listaDeLocacoes.size();i++){
        listaDeLocacoes.get(i);
        if(listaDeLocacoes.get(i).getCodigoDaLocacao() == codigo){
           return listaDeLocacoes.get(i);
        }
       }
       return null;
    }

   


    /* (non-Javadoc)
     * @see gerenciar.ILocacoes#getInfo(int)
     *///placa da erro 
    public String getInfo( int codigo){
        for(int i = 0; i<listaDeLocacoes.size();i++){
            listaDeLocacoes.get(i);
            if(listaDeLocacoes.get(i).getCodigoDaLocacao() == codigo){
                listaDeLocacoes.get(i);
                return "Código" + listaDeLocacoes.get(i).getCodigoDaLocacao();
            }
        } 
        return null;
    }

    /* (non-Javadoc)
     * @see gerenciar.ILocacoes#getInfo()
     */
    //public String getInfo(){
      // for(int i=0; i<listaDeLocacoes.size();){
        //listaDeLocacoes.get(i);
        //return  "Código:  " + Locacao.getCodigoDaLocacao()+"\n Titular da locação: "+listaDeLocacoes.get(i).getCliente()+"\n Veículo: "+listaDeLocacoes.get(i).getVeiculo()+"\n Seguro do veículo: "+listaDeLocacoes.get(i).getSeguro()+"\n Data inicia da locação"+listaDeLocacoes.get(i).getDataInicial()+"\n Data final da locação"+listaDeLocacoes.get(i).getDataFinal();
        //}
    //return null;
   // }


        public String getInfo(){
    String dados = "";
    for (int i = 0; i < listaDeLocacoes.size(); i++) {
        if (listaDeLocacoes.get(i) != null) {
            dados += "/n Código da locação:  " + listaDeLocacoes.get(i).getCodigoDaLocacao()+"\n Titular da locação: "
            +listaDeLocacoes.get(i).getCliente()+"\n Veículo: "+listaDeLocacoes.get(i).getVeiculo()+"\n O veículo possui seguro? "
            +listaDeLocacoes.get(i).getSeguro()+"\n Data inicia da locação"+listaDeLocacoes.get(i).getDataInicial()+
            "\n Data final da locação"+listaDeLocacoes.get(i).getDataFinal();
      
        }
    }
    return dados;

}




   // public String getInfo() {
       // String dados = "";
       // for(int i=0;i<listaDeLocacoes.size();i++){
           // dados += "Locacoes"+listaDeLocacoes.get(i).toString()+"\n";
      //  }
       // return dados;
    //} 






    /* (non-Javadoc)
     * @see gerenciar.ILocacoes#remove(int)
     */
   /* */ public boolean remove(int codigo){
        for(int i= 0; i<listaDeLocacoes.size();i++){
            listaDeLocacoes.get(i);
            if(listaDeLocacoes.get(i).getCodigoDaLocacao() == codigo){
                listaDeLocacoes.remove(i);
                return true;
            }
        }
        return false;
    }


   /*  public void remove (int codigo) throws IllegalArgumentException{
        for(int i= 0; i<listaDeLocacoes.size();i++){
            if(listaDeLocacoes.get(i).getCodigoDaLocacao() == codigo){
                listaDeLocacoes.remove(i);
                
            }
            throw new IllegalArgumentException("aaa");
        }
    }

    */
    public boolean existe(int codigo){
       for(int i =0; i<listaDeLocacoes.size();i++){
        listaDeLocacoes.get(i);
        if( listaDeLocacoes.get(i).getCodigoDaLocacao()==codigo){
            return true;
        }

       }
       return false;
    } 
    
    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    public String toString(){
        String dados = ""; 
        for(Locacao l : listaDeLocacoes){
            dados += l.toString()+"\n";
        }
        return dados;
     }
    
}
