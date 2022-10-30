import java.sql.Date;

public class Locacao{
    private int codigoDaLocacao;
    private Cliente cliente;
    private Veiculo veiculo;
    private boolean seguro;
    private Date dataInicial;
    private Date dataFinal;
    
    public Locacao (int codigoDaLocacao, Cliente cliente, Veiculo veiculo, boolean seguro, Date dataInicial, Date dataFinal){
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
    public Date getDataInicial() {
        return dataInicial;
    }
    public void setDataInicial(Date dataInicial) {
        this.dataInicial = dataInicial;
    }
    public Date getDataFinal() {
        return dataFinal;
    }
    public void setDataFinal(Date dataFinal) {
        this.dataFinal = dataFinal;
    }

    public String toString (){
        return "Código da locação: "+codigoDaLocacao+ "Cliente"+cliente+"Veículo"+veiculo + "Seguro: "+seguro+ "Data inicial da locação: "+dataInicial+"Data final da locação: "+dataFinal;
      
    }
}
