package gerenciar;

import java.util.ArrayList;
import java.util.List;
import Excecoes.PlacaInexistenteException;
public class GerenciarVeiculo implements IVeiculos{
    
    List<Veiculo> listaV; // = new ArrayList<>();

    public GerenciarVeiculo (List<Veiculo> veiculos){
        this.listaV = veiculos;
    }

    public GerenciarVeiculo (){
        this.listaV = new ArrayList<>();
    }
    
    /* (non-Javadoc)
    * @see IVeiculos#add(Veiculo)
    */
   
    public void add(Veiculo v) {
         listaV.add(v);    
    }

    /* (non-Javadoc)
     * @see IVeiculos#get(java.lang.String)
     */
    
    public Veiculo get(String placa) throws PlacaInexistenteException{
        for(int i=0;i<listaV.size();i++){
            if (listaV.get(i).getPlaca().equals(placa)) {
                return listaV.get(i);
            }
        } 
        throw new PlacaInexistenteException(); 
        
    }

   

    public List <Veiculo> getLista(){ //////////////
        return this.listaV;
    }
    /* (non-Javadoc)
     * @see IVeiculos#getInfo(java.lang.String)
     */

    public String getInfo(String placa) throws PlacaInexistenteException{
        for(int i=0;i<listaV.size();i++){
            if (listaV.get(i).getPlaca().equals(placa)) {
                return "Placa: "+listaV.get(i).getPlaca()+" Ano: "+listaV.get(i).getAno()+" Valor da diária: "+listaV.get(i).getValorD();
            }
        }
        throw new PlacaInexistenteException();
        
    }

    /* (non-Javadoc)
     * @see IVeiculos#getInfo()
     */
   
    public String getInfo() {
        String dados = "";
        for(int i=0;i<listaV.size();i++){
            dados += "veiculo"+listaV.get(i).toString()+"\n";
        }
        return dados;
    } 

    /* (non-Javadoc)
     * @see IVeiculos#getResumoInfo()
     */
    
    public String getResumoInfo() {
        
        String dados = "";
        for(int i=0;i<listaV.size();i++){
            if(listaV.get(i) != null){
                dados += " Placa: "+listaV.get(i).getPlaca()+" Ano: "+listaV.get(i).getAno()+" Valor da diária: "+listaV.get(i).getValorD();
            }
        }
        return dados;

    }

    /* (non-Javadoc)
     * @see IVeiculos#remove(java.lang.String)
     */
 
    public boolean remove(String placa) {
        for(int i=0;i<listaV.size();i++){
            if (listaV.get(i).getPlaca().equals(placa)) {
                listaV.remove(i);
                return true;
            }
        }
        return false;
    }


    /* (non-Javadoc)
     * @see IVeiculos#existe(java.lang.String)
     */
    
    public boolean existe(String placa) throws PlacaInexistenteException{
        for(int i=0;i<listaV.size();i++){
            if (listaV.get(i).getPlaca().equals(placa)){ 
                return true;
            }
        }
        throw new PlacaInexistenteException();
    }
    
    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    public String toString(){
        String dados="";
        for(Veiculo v: listaV){
            dados+=v.toString()+"\n";
        }
        return dados;
        
    }
}