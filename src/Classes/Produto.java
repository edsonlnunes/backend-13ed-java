package Classes;

public class Produto {
    private String nome;
    private double preco;
    private int qtdEstoque;

    public Produto(String nome, double preco, int qtdEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.qtdEstoque = qtdEstoque;
    }

    public String getNome() {
        return nome;
    }

    public double valorTotalEstoque(){
        return preco * qtdEstoque;
    }

    public void mostrarInformacoes(){
        System.out.printf(
                "Produto: %s, Preço: R$ %.2f, Estoque: %d, Valor Est.: %.2f \n",
                nome, preco, qtdEstoque, valorTotalEstoque()
        );
    }

    public void aumentarEstoque(int qtdProdutosComprados){
        qtdEstoque += qtdProdutosComprados;
    }

    public void diminuirEstoque(int qtdProdutosVendidos){
        qtdEstoque -= qtdProdutosVendidos;
    }
}
