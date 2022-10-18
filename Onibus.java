public class Onibus extends Veiculo {
    private String categoria;
    private boolean internet;
    private boolean arC;
    private  int numeroPass;

    public Onibus(String placa, String categoria, boolean internet, boolean
    arC, int numeroPass) {
        super(placa);
        this.categoria = categoria;
        this.internet =internet;
        this.numeroPass = numeroPass;
        this.arC = arC;
    }

    public String getCategoria() {
        return categoria;
    }

    public boolean getInternet() {
        return internet;
    }

    public boolean getArC() {
        return arC;
    }

    public int getNumePass() {
        return numeroPass;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setInternet( boolean internet) {
        this.internet = internet;
    }

    public void setArC(boolean arC) {
        this.arC = arC;
    }

    public void setNumePass(int numeroPass) {
        this.numeroPass = numeroPass;
    }
}
