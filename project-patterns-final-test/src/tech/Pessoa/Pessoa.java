package Pessoa;

public class Pessoa {
    private String nome, sobrenome, dataNasc, endereco, contato;

    public Pessoa(String nome, String sobrenome, String dataNasc, String endereco, String contato){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNasc = dataNasc;
        this.endereco = endereco;
        this.contato = contato;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        sobrenome = sobrenome;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        dataNasc = dataNasc;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        endereco = endereco;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        contato = contato;
    }

    public void Cadastrar(String nome, String sobrenome, String endereco, String contato){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.endereco = endereco;
        this.contato = contato;

    }

    public int obterIdade(){
        int idade = 0;
        return idade;
    }
}
