import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        sistema_Interfaces_Generic();
    }

    public static void sistema_Interfaces_Generic() {

        Produtos<nome, id> produto = new Produtos<>();

        produto.addProdutos(new Livro("Harry Potter"));
        produto.addProdutos(new Livro("Percy Jackson"));
        produto.addProdutos(new Livro("Jogador Numero 1"));
        produto.addProdutos(new Livro("Senhor dos Aneis"));
        produto.addProdutos(new Livro("Game of Thrones"));

        produto.addProdutos(new Filmes("Click"));
        produto.addProdutos(new Filmes("Batman"));
        produto.addProdutos(new Filmes("Coringa"));
        produto.addProdutos(new Filmes("Forest Gump - O Contador de Histórias"));
        produto.addProdutos(new Filmes("Psicopata Americano"));

        produto.addProdutos(new Jogos("God of War Ragnarok"));
        produto.addProdutos(new Jogos("Bioshock Infinite"));
        produto.addProdutos(new Jogos("Hotline Miami"));
        produto.addProdutos(new Jogos("Elden Ring"));
        produto.addProdutos(new Jogos("Sekiro: Shadows Die Twice"));

        produto.addProdutos(new Musicas("Jack Johnson"));
        produto.addProdutos(new Musicas("The Strokes"));
        produto.addProdutos(new Musicas("The Smiths"));
        produto.addProdutos(new Musicas("Joji"));
        produto.addProdutos(new Musicas("Tom Jobin"));

        produto.addProdutos(new Brinquedos("Woody"));
        produto.addProdutos(new Brinquedos("Buzz Lightyear"));
        produto.addProdutos(new Brinquedos("Arma NERF"));
        produto.addProdutos(new Brinquedos("Beyblade"));
        produto.addProdutos(new Brinquedos("Quest"));

        Collections.sort(produto.getProdutos());

    }
}
