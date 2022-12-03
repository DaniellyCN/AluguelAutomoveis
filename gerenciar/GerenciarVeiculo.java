package gerenciar;

import java.util.ArrayList;
import java.util.List;

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
    
    public Veiculo get(String placa) {
        for(int i=0;i<listaV.size();i++){
            if (listaV.get(i).getPlaca().equals(placa)) {
                return listaV.get(i);
            }
        }  
        return null;
    }

   

    public List <Veiculo> getLista(){ //////////////
        return this.listaV;
    }
    /* (non-Javadoc)
     * @see IVeiculos#getInfo(java.lang.String)
     */

    public String getInfo(String placa) {
        for(int i=0;i<listaV.size();i++){
            if (listaV.get(i).getPlaca().equals(placa)) {
                return "Placa: "+listaV.get(i).getPlaca()+" Ano: "+listaV.get(i).getAno()+" Valor da diária: "+listaV.get(i).getValorD();
            }
        }
        return null;
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
        }System.out.println("\n placa encontrada, a placa do carro é: "+ placa);
        return false;
    }


    /* (non-Javadoc)
     * @see IVeiculos#existe(java.lang.String)
     */
    
    public boolean existe(String placa) {
        for(int i=0;i<listaV.size();i++){
            if (listaV.get(i).getPlaca().equals(placa)){ 
                return true;
            }
        }
        return false;
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