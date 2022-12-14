package gerenciar;


import java.util.List;

import Excecoes.LocacaoNaoPodeSerEfetuada;

import java.util.ArrayList;

/*
 * Classe implementada da ILocacoes
 */
public  class  GerenciarLocacoes implements ILocacoes{
    private List <Locacao> listaDeLocacoes;
    private List <Veiculo> listaVeiculos;
    private List <Cliente> listaClientes;
  
    /**
     * Lista de locações
     */
    public GerenciarLocacoes (){
        listaDeLocacoes = new ArrayList<>();
    }

    public GerenciarLocacoes (List<Locacao> listaLocacoes, List<Cliente> listaClientes, List<Veiculo> listaVeiculos ){
        this.listaDeLocacoes = listaLocacoes;
        this.listaVeiculos = listaVeiculos;
        this.listaClientes = listaClientes;
    }

    /* (non-Javadoc)
     * @see gerenciar.ILocacoes#add(gerenciar.Locacao)
     */
    public void add(Locacao l){
        listaDeLocacoes.add(l);

    }

   
    public Locacao get(int codigo) {
        Locacao locacao = null;

        if(listaDeLocacoes.size() < 1){
            throw new RuntimeException("Não existe uma locacao cadastrada. ");
        }
        for(int i=0; i<listaDeLocacoes.size();i++){
            listaDeLocacoes.get(i);
            if(listaDeLocacoes.get(i).getCodigoDaLocacao() == codigo){
                locacao =  listaDeLocacoes.get(i);
            }
        } 
        if(locacao == null){
            throw new RuntimeException("Não foi possível encontrar o código. "+codigo);
       }
       return locacao;
    }


     
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


    public String getInfo(){ /// se essa lista estiver vazia
        if(listaDeLocacoes.size() < 1){
            throw new RuntimeException("Não existe uma locação cadastrada. "); 
        } 
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
    
    
    public List <Locacao> getListaLocacoes(){ ////////////// Add
        return this.listaDeLocacoes;
    }
    
    public int getQuantElementos() { ///////////// Add
        int quant = 0;
       for(int i=0;i<listaDeLocacoes.size();i++){
            quant++;
        }
        return quant;
    }

    public boolean remove(int codigo){

        if(listaDeLocacoes.size()<1){
            
            throw new RuntimeException("Não foi possível deletar "); 
        }
        for(int i= 0; i<listaDeLocacoes.size();i++){
            listaDeLocacoes.get(i);
            if(listaDeLocacoes.get(i).getCodigoDaLocacao() == codigo){
                listaDeLocacoes.remove(i);
                return true;
            }
        }
        return false;
    }

    public boolean existe(int codigo){
        if(listaDeLocacoes.size()<1){
            
            throw new RuntimeException(""); 
        }
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

    public List<Locacao> getListaDeLocacoes() {
        return listaDeLocacoes;
    }

    public void setListaDeLocacoes(List<Locacao> listaDeLocacoes) {
        this.listaDeLocacoes = listaDeLocacoes;
    }

    public List<Veiculo> getListaVeiculos() {
        return listaVeiculos;
    }

    public void setListaVeiculos(List<Veiculo> listaVeiculos) {
        this.listaVeiculos = listaVeiculos;
    }

    public List<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(List<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
        
   
    }
    
    
    
    
    
}

