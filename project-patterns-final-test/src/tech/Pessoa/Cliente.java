package tech.Pessoa;

public class Cliente extends Pessoa.Pessoa {
    private  String codigo;
    private String profissao;

    public Cliente(String nome, String sobrenome, String dataNasc, String endereco, String contato) {
        super(nome, sobrenome, dataNasc, endereco, contato);
    }

    public void cadastrar(String nome, String dataNasc, String endereco, String contato,
                   String codigo, String profissao){
            setNome(nome);
            setDataNasc(dataNasc);
            setEndereco(endereco);
            setContato(contato);
            this.codigo = codigo;
            this.profissao = profissao;
    }
}
