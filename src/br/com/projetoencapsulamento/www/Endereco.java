package br.com.projetoencapsulamento.www;

public class Endereco{
    String endereco;
    Integer cep;

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Integer getCep() {
        return cep;
    }

    public void setCep(Integer cep) {
        this.cep = cep;
    }

    public Endereco(String endereco, Integer cep) {
        this.endereco = endereco;
        this.cep = cep;
    }
}
