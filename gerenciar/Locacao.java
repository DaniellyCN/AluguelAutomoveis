package gerenciar;

/*
 * Classe locação
 */

public class Locacao{
    private int codigoDaLocacao;
    private Cliente cliente;
    private Veiculo veiculo;
    private boolean seguro;
    private String dataInicial;
    private String dataFinal;
    /**
     * @param codigoDaLocacao código da locação 
     * @param cliente  cliente
     * @param veiculo  veículo
     * @param seguro   seguro do veículo
     * @param dataInicial  data inicial da locação
     * @param dataFinal   data final da locação
     */
    public Locacao (int codigoDaLocacao, Cliente cliente, Veiculo veiculo, boolean seguro, String dataInicial, String dataFinal){
        this.codigoDaLocacao = codigoDaLocacao;
        this.cliente = cliente;
        this.veiculo = veiculo;
        this.seguro = seguro;
        this.dataInicial = dataInicial;
        this.dataFinal = dataFinal;
    }

    public Locacao (){
        
    }
     /**
     * @return código da locação
     */
    public int getCodigoDaLocacao() {
        return codigoDaLocacao;
    }
    /**
     * @param codigoDaLocacao
     */
    public void setCodigoDaLocacao(int codigoDaLocacao) {
        this.codigoDaLocacao = codigoDaLocacao;
    }
    /**
     * @return cliente
     */
    public Cliente getCliente(){
        return cliente;
    }
    /**
     * @param cliente
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    /**
     * @return veiculo
     */
    public Veiculo getVeiculo() {
        return veiculo;
    }
      /**
     * @param veiculo
     */
    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }
    /**
     * @return seguro
     */
    public boolean getSeguro() {
        return seguro;
    }
     /**
     * @param seguro
     */
    public void setSeguro( String seguro) {
        boolean arC;
        if(seguro == "Sim" || seguro == "Sim".toLowerCase() || seguro == "Sim".toUpperCase()){
            arC = true;
        }else{
            arC = false;
        }
    }
    /**
     * @param seguro
     */
    public void setSeguro(boolean seguro) {
        this.seguro = seguro;
    }
     /**
     * @return data inicial da locação
     */
    public String getDataInicial() {
        return dataInicial;
    }
    /**
     * @param dataInicial
     */
    public void setDataInicial(String dataInicial) {
        this.dataInicial = dataInicial;
    }
    /**
     * @return data final da locação
     */
    public String getDataFinal() {
        return dataFinal;
    }
    /**
     * @param dataFinal
     */
    public void setDataFinal(String dataFinal) {
        this.dataFinal = dataFinal;
    }
    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    public String toString (){
        return "Código da locação: "+codigoDaLocacao+ "Cliente"+cliente+"Veículo"+veiculo + "Seguro: "+seguro+ "Data inicial da locação: "+dataInicial+"Data final da locação: "+dataFinal;
      
    }
}
