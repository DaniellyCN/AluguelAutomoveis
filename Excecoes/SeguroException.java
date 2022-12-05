package Excecoes;

public class SeguroException  extends RuntimeException{
    public SeguroException (){
        super("Só serão aceitas somente respostas com (1) Sim ou (2) Não");
    }
}
