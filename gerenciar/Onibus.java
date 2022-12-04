package gerenciar;

import java.util.StringTokenizer;

import Excecoes.ArCondicionadoException;

/*
 * Classe ônibus extends de veículo
 */
public class Onibus extends Veiculo {
    private String categoria;
    private boolean internet;
    private boolean arC;
    private  int numeroPass;
    private String teste;

    /**
     * @param placa placa do ônibus
     * @param categoria categoria do ônibus
     * @param internet  internet do ônibus 
     * @param arC   ar condicionado do ônibus
     * @param numeroPass número de passageiros
     */
    public Onibus(String placa, String categoria, boolean internet, boolean
    arC, int numeroPass) {
        super(placa);
        this.categoria = categoria;
        this.internet =internet;
        this.numeroPass = numeroPass;
        this.arC = arC;
    }

    public Onibus (){

    }
    /**
     * @return categoria
     */
    public String getCategoria () {//(leito, executivo ou convencional)
        if (categoria == "leito 1") {
            return "Leito";
        } else if (categoria == "executivo 2") {
            return "Executivo";
        }else if (categoria == "convencional 3"){
            return "Convencional";
        }else{
            return " ";
        }
    }

    /**
     * @return internet do ônibus 
     */
    public String getInternet() {
        if (internet == true) {
            return "Sim"; 
        } else {
            return "Não";
        }
        
    }

    /**
     * @return ar condicionado do ônibus 
     */
    public String getArC() {
        if (arC == true) {
            return "Sim"; 
        } else {
            return "Não";
        }
    }

    /**
     * @return número de passageiros do ônibus
     */
    public int getNumePass() {
        return numeroPass;
    }
        /**
     * @param arCondicionado
     */
    public void setArC(int arCondicionado) throws ArCondicionadoException{
        switch (arCondicionado) {
            case 1:
            arC = true;
                break;
            case 2:
            arC = false;
                break;
            default:
            throw new ArCondicionadoException();
        }
    }
    /**
     * @param internet
     */
    public void setInternet(int net) throws Exception{
        switch (net) {
            case 1:
            internet = true;    
                break;
            case 2:
            internet=false;
                break;
            default:
                break;
        }
    }

    /**
     * @param categoria
     */
    public void setCategoria(int cat) {
        switch (cat) {
            case 1:
             categoria = "leito 1" ;  
                break;
            case 2:
            categoria = "executivo 2" ;   
                break;
            case 3:
            categoria = "convencional 3" ;    
                break;
            default:
                break;
        }
        
    }

    /**
     * @param numeroPass
     */
    public void setNumePass(int numeroPass) throws Exception{
        if (numeroPass <= 50 && numeroPass >=0 ) {
            this.numeroPass = numeroPass; 
         } else {
            throw new Exception("O número máximo de passageiros é 50.");
         }
       
    }

    /* (non-Javadoc)
     * @see gerenciar.Veiculo#toString()
     */
    public String toString (){
        return super.toString()+" Categoria: "+getCategoria()+" Internet:  "+getInternet()+" Ar condicionado: "+ getArC() +" Número de passageiro"+ numeroPass;
    }
}
