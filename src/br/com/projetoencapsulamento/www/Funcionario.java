package br.com.projetoencapsulamento.www;

public class Funcionario extends Pessoa {
    public Funcionario(String nome, String dataNasc) {
        super(nome, dataNasc);
    }
    int matricula;
    String dataAdmiss;
    double salario;
    Endereco endereco;
    Telefone telefone;
    Cargo cargo;

    public Funcionario(String nome, String dataNasc, int matricula, String dataAdmiss, double salario, Endereco endereco, Telefone telefone, Cargo cargo) {
        super(nome, dataNasc);
        this.matricula = matricula;
        this.dataAdmiss = dataAdmiss;
        this.salario = salario;
        this.endereco = endereco;
        this.telefone = telefone;
        this.cargo = cargo;
    }

    static void cadastrar(){}
    static void obterIdade(){}
    static void reajustarSalario(double reajuste){}
    static void promover(Cargo cargoNovo){}
}
