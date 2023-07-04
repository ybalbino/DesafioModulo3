public class Cliente extends Dados{
    public Cliente(String nome) {
        super(nome);
    }
    public void Cadastrar(){
        System.out.println("Cadastro Cliente "+ nome);
    }

    @Override
    public void cadastro() {

    }
}
