package br.com.projetoencapsulamento.www;

public class Cliente extends Pessoa{

    public Cliente(String nome, String dataNasc) {
        super(nome, dataNasc);
    }
    int codigo;
    Endereco endereco;
    Telefone telefone;
    Profissao profissao;
    Cargo cargo;

    static void cadastrar(){}
    static void obterIdade(){}
    static void promover(Cargo cargoNovo){}

    public Cliente(String nome, String dataNasc, int codigo, Endereco endereco, Telefone telefone, Profissao profissao, Cargo cargo) {
        super(nome, dataNasc);
        this.codigo = codigo;
        this.endereco = endereco;
        this.telefone = telefone;
        this.profissao = profissao;
        this.cargo = cargo;
    }
}
