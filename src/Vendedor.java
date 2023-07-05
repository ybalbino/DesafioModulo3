public class Vendedor extends Dados{
   //contrutor usando o contrutor de dados
    public Vendedor(String nome){
        super(nome);
    }
    public void cadastrar(){
        System.out.println("Cadastro Vendedor: "+ this.nome);
    }

    @Override
    public void cadastro() {
        System.out.println(this.nome);
    }
}
