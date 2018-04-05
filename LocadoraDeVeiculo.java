package locadoradeveiculo;

/**
 *
 * @author Renato Lucena
 */
public class LocadoraDeVeiculo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cliente c = new Cliente(12233441);
        Cliente c1 = new Cliente(2223332);
        
        Veiculos v1 = new Veiculos("Gol","Branco","NLT 6666",true);
        Veiculos v2 = new Veiculos("Celta","Preto","NNN 4458",false);
        Veiculos v3 = new Veiculos("Clio","Vermelho","OLT 0000",true);
        Veiculos v4 = new Veiculos("Palio","Prata","OOO 0101",true);
        
        c.setNome("Renato");
        c.setFone(6284306136);
        c.setEndereco("Av. X");
        System.out.println("============Dados Cliente==============");
        System.out.println("Nome: " + c.getNome() + "\n"
                          + "Fone: " + c.getFone() + "\n"
                          + "Endereço: " + c.getEndereco() + "\n"
                          + "CPF: " + c.getCpf());
        System.out.println("=============Dados Veiculo===============");
        v2.alugarVeiculo();
        System.out.println("=============Dados Veiculo===============");
        v3.alugarVeiculo();
        
        
       
     
        
    }
    
}
