package Excecoes;

public class CodigoInexistenteException extends RuntimeException{
    public CodigoInexistenteException(){
        super("Codigo não encontrado, insira uma placa válidp");
    }
}
