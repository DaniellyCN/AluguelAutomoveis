package Excecoes;

    public class LocacaoNaoPodeSerEfetuada extends RuntimeException {
    public LocacaoNaoPodeSerEfetuada (){
        super("Erro: cadastre primeiro um cliente e dps um veiculo");
    }
}
