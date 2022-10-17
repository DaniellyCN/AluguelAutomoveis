public class Onibus extends Veiculo {
    protected String categoria, internet, arC;
    protected int numeroPass;

    public Onibus(String placa) {
        super(placa);

    }

    public String getCategoria() {
        return categoria;
    }

    public String getInternet() {
        return internet;
    }

    public String getArC() {
        return arC;
    }

    public int getNumePass() {
        return numeroPass;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setInternet(String internet) {
        this.internet = internet;
    }

    public void setArC(String arC) {
        this.arC = arC;
    }

    public void setNumePass(int numeroPass) {
        this.numeroPass = numeroPass;
    }
}
