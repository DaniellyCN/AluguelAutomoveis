package gerenciar;

import java.util.InputMismatchException;

/*
 * Classe veículo
 */
public class Veiculo{

    private String placa;
    private int ano;
    private int valorDiaria;
    /**
     * Contrutor da classe veiculo com três param
     * @param placa
     * @param ano
     * @param valorDiaria
     */
    public Veiculo(String placa, int ano, int valorDiaria){
        this.placa=placa;
        this.ano=ano;
        this.valorDiaria=valorDiaria;
    }

    /**
     * @param placa
     * @param ano
     */
    public Veiculo(String placa, int ano){
        this.placa=placa;
        this.ano=ano;
        this.valorDiaria=0;
    }
    
 
    public Veiculo(){
        
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
    public void setAno(int ano) {
        
        this.ano=ano;
         
    }

    /**
     * @return double
     */
    public int getValorD(){return valorDiaria;}

    /**
     * @param valorDiaria
     */
    public void setValorD(int valorDiaria){this.valorDiaria=valorDiaria;}

    @Override
    public String toString (){
        return " Placa: "+placa+" Ano: "+ano+" Valor da diária: "+ valorDiaria +" ";
    }
}
