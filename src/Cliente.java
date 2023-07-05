public class Cliente extends Dados{
   //Construtor de Dados
    public Cliente(String nome) {
        super(nome);
    }

    @Override
    public void cadastro() {
        System.out.println(this.nome);
    }
}
