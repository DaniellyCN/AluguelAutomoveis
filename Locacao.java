
public class Locacao{
    private int codigoDaLocacao;
    private Cliente cliente;
    private Veiculo veiculo;
    private boolean seguro;
    private int dataInicial;
    private int dataFinal;
    
    public Locacao (int codigoDaLocacao, Cliente cliente, Veiculo veiculo, boolean seguro, int dataInicial, int dataFinal){
        this.codigoDaLocacao = codigoDaLocacao;
        this.cliente = cliente;
        this.veiculo = veiculo;
        this.seguro = seguro;
        this.dataInicial = dataInicial;
        this.dataFinal = dataFinal;
    }

    public int getCodigoDaLocacao() {
        return codigoDaLocacao;
    }
    public void setCodigoDaLocacao(int codigoDaLocacao) {
        this.codigoDaLocacao = codigoDaLocacao;
    }
    public Cliente getCliente() {
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
    public int getDataInicial() {
        return dataInicial;
    }
    public void setDataInicial(int dataInicial) {
        this.dataInicial = dataInicial;
    }
    public int getDataFinal() {
        return dataFinal;
    }
    public void setDataFinal(int dataFinal) {
        this.dataFinal = dataFinal;
    }

    public String toString (){
        return "Código da locação: "+codigoDaLocacao+"Cliente"+cliente+"Veículo"+veiculo+"Seguro: "+seguro+ "Data inicial da locação: "+dataInicial+"Data final da locação: "+dataFinal;
    } 
        

}
