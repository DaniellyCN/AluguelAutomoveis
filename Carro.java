<<<<<<< HEAD
public class Carro extends Veiculo {
    protected boolean arC;
    protected double mediaKm;
    protected int numeroPass, numeroPorta;

    public Carro(String placa, boolean arC, double mediaKm, int numeroPass, int numeroPorta) {
        super(placa);
        this.arC= arC;
        this.mediaKm = mediaKm;
        this.numeroPass = numeroPass;
        this.numeroPorta = numeroPorta;
    }

    public boolean getArC() {
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

    public void setArC( boolean arC) {
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
=======
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
>>>>>>> b8ee1708f47d4b61e84ebb376be23d5f356dcb31
