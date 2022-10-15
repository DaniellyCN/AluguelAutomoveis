import java.util.List;
import java.util.ArrayList;

public class Veiculo implements IVeiculos {

    private ArrayList<Veiculo> lista;
    private String placa;
    private int ano;
    private double valorDiaria;

    /**
     * @param placa
     * @param ano
     * @param valorDiaria
     */
    public Veiculo(String placa, int ano, double valorDiaria){
        this.placa=placa;
        this.ano=ano;
        this.valorDiaria=valorDiaria;
    }

    
    @Override
    public void add(Veiculo v) {
        lista = new ArrayList<>();       
    }

    @Override
    public Veiculo get(String placa) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String getInfo(String placa) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String getInfo() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String getResumoInfo() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean remove(String placa) {
        for(int i=0;i<lista.size();i++){
            
        }
        return false;
    }

    @Override
    public boolean existe(String placa) {
        // TODO Auto-generated method stub
        return false;
    }
}
