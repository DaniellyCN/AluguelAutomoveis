package gerenciar;



public class Cliente {
    private String nome;
    private long cpf;
    private long cnh;
    private String rua;
    private int numCasa;
    private String bairro;
    private String cidade;
    private long cep;
    private long telefone;

    public Cliente(String nome, long cpf, long cnh, String rua, int numCasa, String bairro, String cidade, long cep,
            long telefone) {
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

    public String getNome() {
        return nome;
    }

    public long getCpf() {
        return cpf;
    }

    public long getCnh() {
        return cnh;
    }

    public String getRua() {
        return rua;
    }

    public int getNumeroCasa() {
        return numCasa;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public long cep() {
        return cep;
    }

    public long getTelefone() {
        return telefone;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public void setCnh(long cnh) {
        this.cnh = cnh;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public void setNumeroCasa(int numero) {
        numCasa = numero;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setCep(long cep) {
        this.cep = cep;
    }

    public void setTelefone(long telefone) {
        this.telefone = telefone;
    }

    public String toString() {
        return "Nome: " + nome + " CPF: " + cpf + " cnh: " + cnh + " rua: " + rua + " numero da casa: " + numCasa
                + " bairro: "
                + bairro + " cidade: " + cidade + " cep: " + cep + " telefone: " + telefone;
    }

}
