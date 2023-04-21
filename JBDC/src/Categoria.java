import java.util.*;

public class Categoria {
    Integer id;
    String nome;
    private List<Produto> produtos = new ArrayList<>();

    public Categoria(String nome){
        this.nome = nome;
    }

    public Categoria(Integer id, String nome){
        this.id=id;
        this.nome=nome;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void adicionar(Produto produto){
        produtos.add(produto);
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    @Override
    public String toString(){
        return ("Categoria: " + this.id + ", " + this.nome);
    }
}
