package livraria.data;

import livraria.model.Produto;

import java.util.ArrayList;
import java.util.List;

public class Estoque {

    private List<Produto> produtos = new ArrayList();

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void addProduto(Produto produto){
        this.produtos.add(produto);
    }

    public void putProduto(Produto newProduto){

        for (Produto produto: produtos){

            if (newProduto.getId() == produto.getId()){

                produto.setNome(newProduto.getNome());
                produto.setPreco(newProduto.getPreco());
                produto.setAdultContent(newProduto.getAdultContent());

            }

        }

    }

    public void delProduto(Produto delProduto){

        for (Produto produto: produtos){

            if (delProduto.getId() == produto.getId()){

                produtos.remove(produto);

            }
        }
    }

    public void imprimirListaProdutos(){
        for (Produto produto: produtos) {
            System.out.println(produto.getId() + " - " + produto.getNome() + " - R$" + produto.getPreco() + " - " + produto.getAdultContent() + " - " + produto.getClass());
        }
    }

    public void imprimirListaProdutosPorCategoria(Class categoria){
        for (Produto produto: produtos) {
            if(produto.getClass().equals(categoria)) {
                System.out.println(produto.getNome());
            }
        }
    }
}
