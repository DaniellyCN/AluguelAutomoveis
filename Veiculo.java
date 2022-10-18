public abstract class Veiculo{

    private String placa;
    private int ano;
    private double valorDiaria;
    /**
     * Contrutor da classe veiculo com três param
     * @param placa
     * @param ano
     * @param valorDiaria
     */
    public Veiculo(String placa, int ano, double valorDiaria){
        this.placa=placa;
        this.ano=ano;
        this.valorDiaria=valorDiaria;
    }

    /**
     * Construtor da classe Veiculo com um param
     * @param placa
     */
    public Veiculo(String placa){
        this.placa=placa;
        this.ano=0;
        this.valorDiaria=0;
    }

    /**

     * @return String
     */
    public String getPlaca(){return placa;}

    /**
     * @param placa
     */
    public void setPlaca(String placa){this.placa=placa;}

    /**
     * @return int
     */
    public int getAno(){return ano;}

    /**
     * @param ano
     */
    public void setAno(int ano){this.ano=ano;}

    /**
     * @return double
     */
    public double getValorD(){return valorDiaria;}

    /**
     * @param valorDiaria
     */
    public void setValorD(double valorDiaria){this.valorDiaria=valorDiaria;}
}
