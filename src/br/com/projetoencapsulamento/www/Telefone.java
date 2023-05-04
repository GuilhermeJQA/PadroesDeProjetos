package br.com.projetoencapsulamento.www;

public class Telefone {
    String telefone;

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Telefone(String telefone) {
        this.telefone = telefone;
    }
}
