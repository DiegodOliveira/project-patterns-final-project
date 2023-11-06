package tech.Pessoa;

public class Funcionario extends Pessoa.Pessoa {

    private String cargo;
    private int matricula;
    private double salario;
    private String dataAdmissao;

    public void reajusteSalarial(double percentual){
        double acrescimo = (percentual/100) + 1;
        this.salario = this.salario * acrescimo;

    }

    public void promover(String NovoCargo){
        this.cargo = NovoCargo;
    }

    public Funcionario(String nome, String sobrenome, String dataNasc, String endereco, String contato, String cargo
    , int matricula, double salario, String dataAdmissao) {
        super(nome, sobrenome,dataNasc, endereco, contato);
        this.cargo = cargo;
        this.matricula = matricula;
        this.salario = salario;
        this.dataAdmissao = dataAdmissao;
    }
}
