package Excecoes;

public class ArCondicionadoException extends RuntimeException{
    public ArCondicionadoException (){
        super("Só serão aceitas somente respostas com (Sim) ou (Não)");
;    }
}