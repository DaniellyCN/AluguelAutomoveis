package gerenciar;

/*
 * Classe ônibus extends de veículo
 */
public class Onibus extends Veiculo {
    private String categoria;
    private boolean internet;
    private boolean arC;
    private  int numeroPass;

    /**
     * @param placa placa do ônibus
     * @param categoria categoria do ônibus
     * @param internet  internet do ônibus 
     * @param arC   ar condicionado do ônibus
     * @param numeroPass número de passageiros
     */
    public Onibus(String placa, String categoria, boolean internet, boolean
    arC, int numeroPass) {
        super(placa);
        this.categoria = categoria;
        this.internet =internet;
        this.numeroPass = numeroPass;
        this.arC = arC;
    }

    public Onibus (){

    }
    /**
     * @return categoria
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * @return internet do ônibus 
     */
    public boolean getInternet() {
        return internet;
    }

    /**
     * @return ar condicionado do ônibus 
     */
    public boolean getArC() {
        return arC;
    }

    /**
     * @param arCondicionado
     */
    public void setArC( String arCondicionado) {
        if(arCondicionado == "Sim" || arCondicionado == "Sim".toLowerCase() || arCondicionado == "Sim".toUpperCase()){
            arC = true;
        }else{
            arC = false;
        }
    }
    /**
     * @param internet
     */
    public void setInternet( String internet) {
        if(internet == "Sim" || internet == "Sim".toLowerCase() || internet == "Sim".toUpperCase()){
            arC = true;
        }else{
            arC = false;
        }
    }

    /**
     * @return número de passageiros do ônibus
     */
    public int getNumePass() {
        return numeroPass;
    }

    /**
     * @param categoria
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    /**
     * @param internet
     */
    public void setInternet( boolean internet) {
        this.internet = internet;
    }

    /**
     * @param arC
     */
    public void setArC(boolean arC) {
        this.arC = arC;
    }

    /**
     * @param numeroPass
     */
    public void setNumePass(int numeroPass) {
        this.numeroPass = numeroPass;
    }

    /* (non-Javadoc)
     * @see gerenciar.Veiculo#toString()
     */
    public String toString (){
        return super.toString()+"Categoria: "+categoria+" internet:  "+internet+"Ar condicionado: "+ arC +" Número de passageiro"+ numeroPass;
    }
}