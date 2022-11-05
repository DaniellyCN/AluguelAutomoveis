public class Caminhao extends Veiculo{
    private int numEixos;
    private int cargaMax;
    
    /**
     * @param numEixos
     * @param cargaMax
     */
    public Caminhao(String placa,int numEixos, int cargaMax) {
        super(placa);
        this.numEixos=numEixos;
        this.cargaMax=cargaMax;
    } 
    
    /**
     * @return
     */
    public int getNumEixos(){return numEixos;}
    
    /**
     * @param numEixos
     */
    public void setNumEixos(int numEixos){this.numEixos=numEixos;}

    /**
     * @return
     */
    public int getCargaMax(){return cargaMax;}

    /**
     * @param cargaMax
     */
    public void seCargaMax(int cargaMax){this.cargaMax=cargaMax;}


    public String toString (){
        return super.toString()+" Número de eixos : "+numEixos+" carga máxima: "+ cargaMax;
    }
}