package gerenciar;
import Excecoes.ArCondicionadoException;

public class Carro extends Veiculo {
    protected boolean arC;
    protected double mediaKm;
    protected int numeroPass, numeroPorta;

    /**
     * @param placa
     * @param arC
     * @param mediaKm
     * @param numeroPass
     * @param numeroPorta
     */
    public Carro(String placa, boolean arC, double mediaKm, int numeroPass, int numeroPorta) {
        super(placa);
        this.arC= arC;
        this.mediaKm = mediaKm;
        this.numeroPass = numeroPass;
        this.numeroPorta = numeroPorta;
    }
    public Carro(){
    }

    /**
     * @return um boleean de ar condicionado 
     */
    public boolean getArC() {
        return arC;
    }

    public void setArC(String arCondicionado) throws ArCondicionadoException{
        if(arCondicionado == "Sim" || arCondicionado == "Sim".toLowerCase() || arCondicionado == "Sim".toUpperCase()){
            arC = true;
        }else{
            arC = false;
            throw new ArCondicionadoException("Por favor, serão aceitas somente respostas com (Sim) ou (Não)");
        }
        
    }

    /**
     * @return media de km do carro
     */

    public double getMediaKm() {
        return mediaKm;
    }

    /**
     * @return número de passageiro
     */
    public int getNumePass() {
        return numeroPass;
    }

    /**
     * @return número de portas do carro
     */
    public int getNumePorta() {
        return numeroPorta;
    }

    /**
     * @param arC
     */
    public void setArC( boolean arC) {
        this.arC = arC;
    }
    /**
     * @param mediaKm
     */
    public void setMediaKm(double mediaKm) {
        this.mediaKm = mediaKm;
    }

    /**
     * @param numeroPass
     */
    public void setNumePass(int numeroPass) {
        this.numeroPass = numeroPass;
    }

    /**
     * @param numeroPorta
     */
    public void setNumPorta(int numeroPorta) {
        this.numeroPorta = numeroPorta;
 
    }


    
    /* (non-Javadoc)
     * @see gerenciar.Veiculo#toString()
     */
    public String toString (){
        return super.toString()+" Ar condicionado: "+arC+" km:"+mediaKm+" Número de passageiros:"+ numeroPass +" Número de portas:"+numeroPorta;
    }
}
