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
     * @return um string de ar condicionado 
     */
    public String getArC() {
        if (arC == true) {
           return "Sim"; 
        } else {
            return "Não";
        }
        
    }

    public void setArC(int arCondicionado) throws ArCondicionadoException{
        switch (arCondicionado) {
            case 1:
            arC = true;
                break;
            case 2:
            arC = false;
                break;
            default:
            throw new ArCondicionadoException();
        }
        
        /*if(arCondicionado == 1){
            arC = true;
        }else if(arCondicionado == 2){
            arC = false;
        }else{   
            throw new ArCondicionadoException();
        } */       
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
        return super.toString()+" Ar condicionado: "+getArC()+" km:"+mediaKm+" Número de passageiros:"+ numeroPass +" Número de portas:"+numeroPorta;
    }
}
