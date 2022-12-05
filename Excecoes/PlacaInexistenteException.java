package Excecoes;

public class PlacaInexistenteException extends RuntimeException{
    public PlacaInexistenteException (){
        super("Placa não encontrada, insira uma placa válida");
    }
    
}