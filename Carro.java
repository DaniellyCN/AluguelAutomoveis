public class Carro extends Veiculo {
    protected String arC;
    protected double mediaKm;
    protected int numeroPass, numeroPorta;

    public Carro(String placa) {
        super(placa);
    }

    public String getArC() {
        return arC;
    }

    public double getMediaKm() {
        return mediaKm;
    }

    public int getNumePass() {
        return numeroPass;
    }

    public int getNumePorta() {
        return numeroPorta;
    }

    public void setArC(String arC) {
        this.arC = arC;
    }

    public void setMediaKm(double mediaKm) {
        this.mediaKm = mediaKm;
    }

    public void setNumePass(int numeroPass) {
        this.numeroPass = numeroPass;
    }

    public void setNumPorta(int numeroPorta) {
        this.numeroPorta = numeroPorta;
    }
}
