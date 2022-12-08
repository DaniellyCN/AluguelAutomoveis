package gerenciar;
import Excecoes.ArCondicionadoException;

public class Carro extends Veiculo {
    protected boolean arC;
    protected int mediaKm;
    protected int numeroPass, numeroPorta, arCint;

    /**
     * @param placa
     * @param arC
     * @param mediaKm
     * @param numeroPass
     * @param numeroPorta
     */
    public Carro(String placa, boolean arC, int mediaKm, int numeroPass, int numeroPorta) {
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
    public int getArCint(){
        return arCint;
    }


    /**
     * @return media de km do carro
     */

    public int getMediaKm() {
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

    public void setArC(int arCondicionado) throws ArCondicionadoException{
        switch (arCondicionado) {
            case 1:
            arC = true;
            arCint=1;
                break;
            case 2:
            arC = false;
            arCint=1;
                break;
            default:
            throw new ArCondicionadoException();
        }
          
    }
    /**
     * @param mediaKm
     */
    public void setMediaKm(int mediaKm) {
        this.mediaKm = mediaKm;
    }

    /**
     * @param numeroPass
     */
    public void setNumePass(int numeroPass) throws Exception{
        if (numeroPass <= 4 && numeroPass >=0 ) {
           this.numeroPass = numeroPass; 
        } else {
            throw new Exception("O número de passageiros deve ser entre 0 e 4.");
        }
        
    }

    /**
     * @param numeroPorta
     */
    public void setNumPorta(int numeroPorta) throws Exception{
        if (numeroPorta == 2 || numeroPorta == 4) {
           this.numeroPorta = numeroPorta; 
        } else {
            throw new Exception("São aceitas somente as opções 2 portas ou 4 portas.");
        }
        
 
    }
    
    /* (non-Javadoc)
     * @see gerenciar.Veiculo#toString()
     */
    public String toString (){
        return super.toString()+" Ar condicionado: "+getArC()+" km:"+mediaKm+" Número de passageiros:"+ numeroPass +" Número de portas:"+numeroPorta;
    }
}
