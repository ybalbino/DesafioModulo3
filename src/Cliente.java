public class Cliente extends Dados{
   //Construtor de Dados
    public Cliente(String nome) {
        super(nome);
    }
    public void Cadastrar(){
        System.out.println("Cadastro Cliente "+ this.nome);
    }

    @Override
    public void cadastro() {
        System.out.println(this.nome);
    }
}
