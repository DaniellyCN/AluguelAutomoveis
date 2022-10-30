
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

    public Cliente(String nome, int cpf, int cnh, String rua, int numCasa, String bairro, String cidade, int cep, int telefone){
        this.nome = nome;
        this.cpf = cpf;
        this.cnh = cnh;
        this.rua = rua;
        this.numCasa = numCasa;
        this.bairro = bairro;
        this.cidade = cidade;
        this.cep = cep;
        this.telefone = telefone;
    }

    public String getNome(){return nome;}
    public int getCpf(){return cpf;}
    public int getCnh(){return cnh;}
    public String getRua(){return rua;}
    public int getNumeroCasa(){return numCasa;}
    public String getBairro(){return bairro;}
    public String getCidade(){return cidade;}
    public int cep(){return cep;}
    public int getTelefone(){return telefone;}

    public void setNome(String nome){this.nome = nome;}
    public void setCpf(int cpf){this.cpf = cpf;}
    public void setCnh(int cnh){this.cnh = cnh;}
    public void setRua(String rua){this.rua = rua;}
    public void setNumeroCasa(int numero){numCasa = numero;}
    public void setBairro(String bairro){this.bairro = bairro;}
    public void setCidade(String cidade){this.cidade = cidade;}
    public void setCep(int cep){this.cep = cep;}
    public void setTelefone(int telefone){this.telefone = telefone;}
    
    public String toString (){
        return "Nome: "+nome+"CPF"+cpf+"cnh"+ cnh+"rua"+rua+"numero da casa"+numCasa+"bairro"+bairro+"cidade"+cidade+"cep"+cep+"telefone"+telefone;
    }

}