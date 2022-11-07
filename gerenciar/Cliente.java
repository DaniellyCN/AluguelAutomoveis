package gerenciar;

/*
 * Classe cliente
 */

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

    /**
     * @param nome nome do cliente
     * @param cpf cpf do clinte
     * @param cnh carteira de motorista do cliente
     * @param rua endereço de rua do cliente
     * @param numCasa número da casa do cliente
     * @param bairro endereço de bairro do cliente
     * @param cidade cidade onde o cliente reside
     * @param cep   cep do cliente
     * @param telefone telefone do cliente
     */
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

    /**
     * @return nome do cliente
     */
    public String getNome() {
        return nome;
    }

    /**
     * @return cpf do cliente
     */
    public long getCpf() {
        return cpf;
    }

    /**
     * @return carteira de motorista
     */
    public long getCnh() {
        return cnh;
    }

    /**
     * @return rua do cliente
     */
    public String getRua() {
        return rua;
    }

    /**
     * @return número da cada do cliente
     */
    public int getNumeroCasa() {
        return numCasa;
    }

    /**
     * @return bairro do cliente
     */
    public String getBairro() {
        return bairro;
    }

    /**
     * @return cidade do cliente
     */
    public String getCidade() {
        return cidade;
    }

    /**
     * @return cep do cliente
     */
    public long cep() {
        return cep;
    }

    /**
     * @return telefone do cliente
     */
    public long getTelefone() {
        return telefone;
    }

    /**
     * @param nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @param cpf
     */
    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    /**
     * @param cnh
     */
    public void setCnh(long cnh) {
        this.cnh = cnh;
    }

    /**
     * @param rua
     */
    public void setRua(String rua) {
        this.rua = rua;
    }

    /**
     * @param numero
     */
    public void setNumeroCasa(int numero) {
        numCasa = numero;
    }

    /**
     * @param bairro
     */
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    /**
     * @param cidade
     */
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    /**
     * @param cep
     */
    public void setCep(long cep) {
        this.cep = cep;
    }

    /**
     * @param telefone
     */
    public void setTelefone(long telefone) {
        this.telefone = telefone;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    public String toString() {
        return "Nome: " + nome + " CPF: " + cpf + " cnh: " + cnh + " rua: " + rua + " numero da casa: " + numCasa
                + " bairro: "
                + bairro + " cidade: " + cidade + " cep: " + cep + " telefone: " + telefone;
    }

}
