public class Venda implements Cadastrar{
    private Cliente cliente;
    private Vendedor vendedor;
    private double valor;

    public Venda (Cliente cliente, Vendedor vendedor, double valor){
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.valor = valor;
    }
    public void Cadastrar(){
        System.out.println("Cadastro Venda: Cliente: " + this.cliente+ ", Vendedor: "+this.vendedor+", Valor: "+this.valor);
    }

    @Override
    public void cadastro() {

    }
}
