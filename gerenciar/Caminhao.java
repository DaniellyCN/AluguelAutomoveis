package gerenciar;


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
     * @return número de eixos do carro
     */
    public int getNumEixos(){return numEixos;}
    
    /**
     * @param numEixos
     */
    public void setNumEixos(int numEixos){this.numEixos=numEixos;}

    /**
     * @return carga máxima do caminhão
     */
    public int getCargaMax(){return cargaMax;}

    /**
     * @param cargaMax
     */
    public void seCargaMax(int cargaMax){this.cargaMax=cargaMax;}


    /* (non-Javadoc)
     * @see gerenciar.Veiculo#toString()
     */
    public String toString (){
        return super.toString()+" Número de eixos : "+numEixos+" Carga máxima: "+ cargaMax;
    }
}