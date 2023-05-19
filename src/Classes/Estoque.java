package Classes;

import java.util.ArrayList;

public class Estoque {
    private ArrayList<Produto> produtos;

    public Estoque(){
        produtos = new ArrayList<>();
    }

    public void addProduto(Produto novoProduto){
        produtos.add(novoProduto);
    }

    public void removerProduto(String nomeProduto){
        var removeuProduto = produtos.removeIf(
                (produto) -> produto.getNome().toLowerCase().equals(nomeProduto.toLowerCase())
        );

        if(removeuProduto){
            System.out.println("Produto removido com sucesso!");
        } else {
            System.out.println("Produto não localizado para remover, tente outro produto!");
        }
    }

    public void relatorioEstoque(){
        var valorTotalEstoque = 0.0;
        for (var produto: produtos) {
            produto.mostrarInformacoes();
            valorTotalEstoque += produto.valorTotalEstoque();
        }
        System.out.println("Valor total de produtos em estoque: R$" + valorTotalEstoque);
    }

    public void aumentarEstoqueProduto(String nomeProduto, int quantidade){
        var produtoOptional = produtos.stream().filter(
                (produto) -> produto.getNome().toLowerCase().equals(nomeProduto.toLowerCase())
        ).findFirst();

        if(produtoOptional.isPresent()){
            var produtoEncontrado = produtoOptional.get();
            produtoEncontrado.aumentarEstoque(quantidade);
        } else {
            System.out.println("Produto não encontrado, tente novamente!");
        }
    }

    public void diminuirEstoqueProduto(String nomeProduto, int quantidade){
        var produtoOptional = produtos.stream().filter(
                (produto) -> produto.getNome().toLowerCase().equals(nomeProduto.toLowerCase())
        ).findFirst();

        if(produtoOptional.isPresent()){
            var produtoEncontrado = produtoOptional.get();
            produtoEncontrado.diminuirEstoque(quantidade);
        } else {
            System.out.println("Produto não encontrado, tente novamente!");
        }
    }
}
