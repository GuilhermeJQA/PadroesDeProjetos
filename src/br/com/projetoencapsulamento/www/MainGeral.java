package br.com.projetoencapsulamento.www;

public class MainGeral {
    public static void main(String[] args) {
        Cargo cargo1 = new Cargo("Professor");
        Telefone telefone1 = new Telefone("8394733633");
        Endereco endereco1 = new Endereco("Rua Maria das Graças 213",11313);
        Funcionario funcionario = new Funcionario("Alberto","10/11/1998",323,"23/04/2020",1200,endereco1,telefone1,cargo1);
        System.out.println("Funcionário: "+funcionario.nome);
        System.out.println("Endereço: "+funcionario.endereco.endereco);
        System.out.println("Data de admissão: "+funcionario.dataAdmiss);

        Endereco endereco2 = new Endereco("Rua José Anchieta 232 Bessa",231244);
        Telefone telefone2 = new Telefone("83947342424");
        Profissao profissao1 = new Profissao("Engenheiro");
        Cargo cargo2 = new Cargo("Engenheiro chefe");
        Cliente cliente = new Cliente("Carlos Almeida","22/03/2000",12331,endereco2,telefone2,profissao1,cargo2);
        System.out.println("\nCliente: "+cliente.nome);
        System.out.println("Endereco: "+cliente.endereco.endereco);
        System.out.println("Código: "+cliente.codigo);
    }
}
