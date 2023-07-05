public class Vendedor extends Dados{
   //contrutor usando o contrutor de dados
    public Vendedor(String nome){
        super(nome);
    }

    @Override
    public void cadastro() {
        System.out.println(this.nome);
    }
}
