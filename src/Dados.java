//Classe abstrata que será extendida por Vendedor e Cliente e Venda
abstract public class Dados implements Cadastrar {
    protected String nome;
    protected int CPF;

    //Construtor
    public Dados(String nome) {
        this.nome = nome;
        this.CPF = CPF;
    }
}
