
public class Cliente{
    private String nome;
    private int cpf;
    private int cnh;
    private String rua;
    private int numCasa;
    private String bairro;
    private String cidade;
    private int cep;
    private int telefone;

    public Cliente(String nome, int cpf, int cnh, String rua, int casa, String bairro, String cidade, int cep, int telefone){
        this.nome = nome;
        this.cpf = cpf;
        this.cnh = cnh;
        this.rua = rua;
        numCasa = casa;
        this.bairro = bairro;
        this.cidade = cidade;
        this.cep = cep;
        this.telefone = telefone;
    }

    public String getNome(){return nome;}
    public int getCpf(){return cpf;}
    public int getCnh(){return cnh;}
    public String getRua(){return rua;}
    public int getNumeroRua(){return numCasa;}
    public String getBairro(){return bairro;}
    public String getCidade(){return cidade;}
    public int cep(){return cep;}
    public int getTelefone(){return telefone;}

}