package gerenciar;



public class Locacao{
    private int codigoDaLocacao;
    private Cliente cliente;
    private Veiculo veiculo;
    private boolean seguro;
    private String dataInicial;
    private String dataFinal;
    
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
    public int getCodigoDaLocacao() {
        return codigoDaLocacao;
    }
    public void setCodigoDaLocacao(int codigoDaLocacao) {
        this.codigoDaLocacao = codigoDaLocacao;
    }
    public Cliente getCliente(){
        return cliente;
    }
    
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public Veiculo getVeiculo() {
        return veiculo;
    }
      
    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }
    public boolean getSeguro() {
        return seguro;
    }
    public void setSeguro(boolean seguro) {
        this.seguro = seguro;
    }
    public String getDataInicial() {
        return dataInicial;
    }
    public void setDataInicial(String dataInicial) {
        this.dataInicial = dataInicial;
    }
    public String getDataFinal() {
        return dataFinal;
    }
    public void setDataFinal(String dataFinal) {
        this.dataFinal = dataFinal;
    }

    public String toString (){
        return "Código da locação: "+codigoDaLocacao+ "Cliente"+cliente+"Veículo"+veiculo + "Seguro: "+seguro+ "Data inicial da locação: "+dataInicial+"Data final da locação: "+dataFinal;
      
    }
}
