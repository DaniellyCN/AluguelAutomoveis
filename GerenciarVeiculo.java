import java.util.List;
import java.util.ArrayList;

public class GerenciarVeiculo implements IVeiculos{

    ArrayList<Veiculo> listaV=new ArrayList<>();
    
    /* (non-Javadoc)
    * @see IVeiculos#add(Veiculo)
    */
    @Override
    public void add(Veiculo v) {
         listaV.add(v);    
    }

    /* (non-Javadoc)
     * @see IVeiculos#get(java.lang.String)
     */
    @Override
    public Veiculo get(String placa) {
        for(int i=0;i<listaV.size();i++){
            if (listaV.get(i).getPlaca()==placa) {
                return listaV.get(i);
            }
        }
        return null;
    }

    /* (non-Javadoc)
     * @see IVeiculos#getInfo(java.lang.String)
     */
    @Override
    public String getInfo(String placa) {
        for(int i=0;i<listaV.size();i++){
            if (listaV.get(i).getPlaca()==placa) {
                return "Placa: "+listaV.get(i).getPlaca()+" Ano: "+listaV.get(i).getAno()+" Valor da diária: "+listaV.get(i).getValorD();
            }
        }
        return null;
    }

    /* (non-Javadoc)
     * @see IVeiculos#getInfo()
     */
    @Override
    public String getInfo() {
        String dados = "";
        for(int i=0;i<listaV.size();i++){
            dados += "Placa: "+listaV.get(i).getPlaca()+" Ano: "+listaV.get(i).getAno()+" Valor da diária: "+listaV.get(i).getValorD()+"\n";
        }
        return dados;
    } 

    /* (non-Javadoc)
     * @see IVeiculos#getResumoInfo()
     */
    @Override
    public String getResumoInfo() {
        String dados = "";
        for(int i=0;i<listaV.size();i++){
            if(listaV.get(i) != null){
                dados += "Placa: "+listaV.get(i).getPlaca()+" Ano: "+listaV.get(i).getAno()+" Valor da diária: "+listaV.get(i).getValorD();
            }
        }
        return dados;

    }

    /* (non-Javadoc)
     * @see IVeiculos#remove(java.lang.String)
     */
    @Override
    public boolean remove(String placa) {
        for(int i=0;i<listaV.size();i++){
            if (listaV.get(i).getPlaca()==placa) {
                listaV.remove(i);
                return true;
            }
        }
        return false;
    }

    /* (non-Javadoc)
     * @see IVeiculos#existe(java.lang.String)
     */
    @Override
    public boolean existe(String placa) {
        for(int i=0;i<listaV.size();i++){
            if (listaV.get(i).getPlaca()==placa){
                return true;
            }
        }
        return false;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     
    public String toString(){
        String dados="Placa: "+placa+" Ano: "+ano+" Valor da diária: "+valorDiaria;
        for(Veiculo v: listaV){
            dados+=v.toString()+"\n";
        }
        return dados;
        
    }*/
}
