package Excecoes;

public class ArCondicionadoException extends RuntimeException{
    public ArCondicionadoException (){
        super("Só serão aceitas somente respostas com (1) Sim ou (2) Não");
   }
}

