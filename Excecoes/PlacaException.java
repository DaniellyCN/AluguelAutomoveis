package Excecoes;

public class PlacaException extends RuntimeException {
    public PlacaException (){
        super("Por favor, insira um valor válido");
    }
}
