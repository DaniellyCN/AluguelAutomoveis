package gerenciar;

import Excecoes.SeguroException;

//import java.util.InputMismatchException;

//import javax.xml.catalog.Catalog;

/*
 * Classe locação
 */

public class Locacao{
    private int codigoDaLocacao = 0;
    private int codigo;
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
    public Locacao ( Cliente cliente, Veiculo veiculo, boolean seguro, String dataInicial, String dataFinal){
        this.codigo = codigoDaLocacao++;
        this.cliente = cliente;
        this.veiculo = veiculo;
        this.seguro = seguro;
        this.dataInicial = dataInicial;
        this.dataFinal = dataFinal;
    }

    public Locacao () {
        
    }
     /**
     * @return código da locação
     */
    public int getCodigoDaLocacao() {
        return this.codigoDaLocacao;   
    }
    /**
     * @param codigoDaLocacao
     */
    public void setCodigoDaLocacao(int codigoDaLocacao){
        this.codigoDaLocacao= codigoDaLocacao;
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
    //public boolean getSeguro() {
       // return seguro;
   // }

    public String getSeguro() {
        if (seguro == true) {
           return "Sim"; 
        } else {
            return "Não";
        }

    }




     /**
     * @param seguro
     */
    public void setSeguro( int seguroDeCarro) throws SeguroException {
        
        
        switch (seguroDeCarro) {
            case 1:
            seguro = true;
                break;
            case 2:
            seguro = false;
                break;
            default:
            throw new SeguroException();
        }
        //boolean arC;
        //i//f(seguro.toLowerCase().equals("sim")){
            //arC = true;
        //}else{
           // arC = false;
        //}
       
       // setSeguro(arC);

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
