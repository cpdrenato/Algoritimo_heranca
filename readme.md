<p align="center">
  <img src="http://www.ifpe.edu.br/campus/palmares/noticias/divulgado-resultado-do-curso-de-extensao-em-java/javalogo.png/@@images/b7cea780-021b-47d5-bf97-647d06ef4129.png"/>
</p>

# Algoritmo Java – locação de veículos por uma locadora.
# Abstração, encapsulamento, classes, objetos, Atributos, métodos, herança múltipla e polimorfismo.

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
///////////////////////////////////////////////////////////////////////////////////
public class LocarDeVeiculo {
   public static void main(String[] args) {
        Cliente c = new Cliente(1111111111);
        Veiculos v1 = new Veiculos("Fiesta","prata","ngk 8888",true);
        Veiculos v2 = new Veiculos("Fusion","vermelha","hpv 3344",false);
        c.setNome("Renato");
        c.setFone(62984306136);
        c.setEndereco("Rua. X");
        System.out.println("Nome: " + c.getNome() + "\n" + "Fone: " + c.getFone() + "\n"                     + "Endereço: " + c.getEndereco() + "\n" + "CPF: " + c.getCpf());
        System.out.println("Dados Veiculo" + "\n");
        v2.alugarVeiculo();
        }
    }
///////////////////////////////////////////////////////////////////////////////////////
public abstract class Pessoa {
    protected String nome;
    protected int fone;
    protected String endereco;
    private String cidade;
    public void tipoPessoa(){
    }
}
//////////////////////////////////////////////////////////////////////////////////
public class Veiculos{
    private String modelo;
	private String marca;
	private String cor;
    private String placa;
    private boolean status;
    public Veiculos(String modelo, String marca, String cor, String placa, boolean status) {
        this.modelo = modelo;
		this.marca = marca;
        this.cor = cor;
        this.placa = placa;
        this.status = status;
    }    
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
	public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public boolean getStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }
    public void alugarVeiculo(){
        if(this.getStatus() == true){
            System.out.println("Modelo: " + this.getModelo());
	     System.out.println("Marca: " + this.getMarca());
            System.out.println("Cor: " + this.getCor());
            System.out.println("Placa: " + this.getPlaca());
            System.out.println("Carro Alugado!");
        }else{
            System.out.println("O veiculo ja esta alugado! ");
            System.out.println("Modelo: " + this.getModelo());
	     System.out.println("Marca: " + this.getMarca());
            System.out.println("Cor: " + this.getCor());
            System.out.println("Placa: " + this.getPlaca());
        }
    }
}

- Renato Lucena 2018
