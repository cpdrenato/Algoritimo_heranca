package locadoradeveiculo;
/**
 *
 * @author Renato Lucena
 */
public class Cliente extends Pessoa {
    private int cpf;
    private String tipoPessoa;

    public Cliente(int cpf) {
        this.cpf = cpf;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getFone() {
        return fone;
    }

    public void setFone(int fone) {
        this.fone = fone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    @Override
    public void tipoPessoa(){
        System.out.println("Cadastro para pessoa fisica!");
    }
}
