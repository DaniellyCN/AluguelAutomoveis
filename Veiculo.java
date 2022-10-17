import java.util.List;
import java.util.ArrayList;
public class Veiculo implements IVeiculos{

    private String placa;
    private int ano;
    private double valorDiaria;
    ArrayList<Veiculo> listaV = new ArrayList<>();

    /**
     * Contrutor da classe veiculo com três param
     * @param placa
     * @param ano
     * @param valorDiaria
     */
    public Veiculo(String placa, int ano, double valorDiaria){
        //listaV= new ArrayList<>();
        this.placa=placa;
        this.ano=ano;
        this.valorDiaria=valorDiaria;
    }

    /**
     * Construtor da classe Veiculo com um param
     * @param placa
     */
    public Veiculo(String placa){
       // listaV= new ArrayList<>();
        this.placa=placa;
        this.ano=0;
        this.valorDiaria=0;
    }

    /**
     * Construtor da classe Veiculo sem param
     * @param placa
     */
    public Veiculo(){
        //listaV= new ArrayList<>();
        this.placa="AAA0000";
        this.ano=0;
        this.valorDiaria=0;
    }

    /**
     * @return String
     */
    public String getPlaca(){return placa;}

    /**
     * @param placa
     */
    public void setPlaca(String placa){this.placa=placa;}

    /**
     * @return int
     */
    public int getAno(){return ano;}

    /**
     * @param ano
     */
    public void setAno(int ano){this.ano=ano;}

    /**
     * @return double
     */
    public double getValorD(){return valorDiaria;}

    /**
     * @param valorDiaria
     */
    public void setValorD(double valorDiaria){this.valorDiaria=valorDiaria;}

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
        for(int i=0;i<listaV.size();i++){
            return "Placa: "+listaV.get(i).getPlaca()+" Ano: "+listaV.get(i).getAno()+" Valor da diária: "+listaV.get(i).getValorD();
        }
        return null;
    } 

    /* (non-Javadoc)
     * @see IVeiculos#getResumoInfo()
     */
    @Override
    public String getResumoInfo() {
        for(int i=0;i<listaV.size();i++){
            return "Placa: "+listaV.get(i).getPlaca()+" Ano: "+listaV.get(i).getAno()+" Valor da diária: "+listaV.get(i).getValorD();
        }
        return null;

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
     */
    public String toString(){
        String dados="Placa: "+placa+" Ano: "+ano+" Valor da diária: "+valorDiaria;
        for(Veiculo v: listaV){
            dados+=v.toString()+"\n";
        }
        return dados;
        
    }
}
