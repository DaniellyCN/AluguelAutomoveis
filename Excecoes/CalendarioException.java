package Excecoes;

public class CalendarioException extends RuntimeException{
    public CalendarioException (){
        super("Digite uma data como DD/MM/AAAA");
    }
}
