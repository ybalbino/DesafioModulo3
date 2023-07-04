public class Venda implements Cadastrar{
    private Cliente cliente;
    private Vendedor vendedor;
    private double valor;

    public Venda (Cliente cliente, Vendedor vendedor, double valor){
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.valor = valor;
    }

    @Override
    public void cadastro() {
        System.out.printf("Cadastro Venda: \n Cliente: %s Vendedor: %s Valor: R$ %.2f \n", this.cliente.nome , this.vendedor.nome ,this.valor);
    }
}
