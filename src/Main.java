import Classes.Estoque;
import Classes.Produto;

public class Main {
    public static void main(String[] args) {
        var tv = new Produto("TV", 299, 5);
        var ps5 = new Produto("PS 5", 1999, 10);

        var estoque = new Estoque();

        estoque.addProduto(tv);
        estoque.addProduto(ps5);

        estoque.relatorioEstoque();

        System.out.println();
        System.out.println();

        estoque.diminuirEstoqueProduto("ps 5", 8);

        estoque.relatorioEstoque();
    }
}