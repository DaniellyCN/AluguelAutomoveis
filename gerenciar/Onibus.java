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
        if (categoria == "Leito") {
            return "Leito";
        } else if (categoria == "Executivo") {
            return "Executivo";
        }else if (categoria == "Convencional"){
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
                throw new Exception("Insira uma opção válida (1)Sim (2)Não");
        }
    }

    /**
     * @param categoria
     */
    public void setCategoria(String cat) throws Exception{
        switch (cat) {
            case "Leito":
             categoria = "Leito" ;  
                break;
            case "Executivo":
            categoria = "Executivo" ;   
                break;
            case "Convencional":
            categoria = "Convencional" ;    
                break;
            default:
            throw new Exception("Insira uma opção válida (1)Leito (2)Executivo (3)Convencional");
                
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
        return super.toString()+" Categoria: "+getCategoria()+" Internet:  "+getInternet()+" Ar condicionado: "+ getArC() +" Número de passageiro: "+ numeroPass;
    }
}
