public class Vendedor extends Dados{
    public Vendedor(String nome){
        super(nome);

    }
    public void cadastrar(){
        System.out.println("Cadastro Vendedor: "+ nome);
    }

    @Override
    public void cadastro() {
        System.out.println(this.nome);
    }
}
