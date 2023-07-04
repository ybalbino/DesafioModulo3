import com.sun.security.ntlm.Client;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Criando Vendedor
        Vendedor vendedor1 = new Vendedor("Matheus");
        Vendedor vendedor2 = new Vendedor("Carla");
        Vendedor vendedor3 = new Vendedor("Jorge");

        //Cadastrando Vendedor
        List<Cadastrar> vendedores = new ArrayList<>();
        vendedores.add(vendedor1);
        vendedores.add(vendedor2);
        vendedores.add(vendedor3);
        for (Cadastrar vendedor : vendedores){
            vendedor.cadastro();
        }
        //Criando Cliente
        Cliente cliente1 = new Cliente ("Lucas");
        Cliente cliente2 = new Cliente("Maria");
        Cliente cliente3 = new Cliente("Daniel");

        //Cadastrando Cliente
        List<Cadastrar> clientes = new ArrayList<>();
        clientes.add(cliente1);
        clientes.add(cliente2);
        clientes.add(cliente3);
        for (Cadastrar cliente : clientes){
            cliente.cadastro();
        }
        //Criando Venda
        Venda venda1 = new Venda(cliente1,vendedor1,700.00);
        Venda venda2 = new Venda(cliente2,vendedor2,200.00);
        Venda venda3 = new Venda(cliente3,vendedor3,150.00);

        //Cadastrando Venda
        List<Cadastrar> vendas = new ArrayList<>();
        vendas.add(venda1);
        vendas.add(venda2);
        vendas.add(venda3);
        for (Cadastrar venda : vendas) {
            venda.cadastro();
        }
    }
}