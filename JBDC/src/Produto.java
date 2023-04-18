public class Produto {
    Integer id;
    String nome;
    String descricao;

    public Produto(String nome, String descricao){
        this.nome = nome;
        this.descricao = descricao;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString(){
        return ("O produto criado foi: " + this.id + ", " + this.nome + ", " + this.descricao);
    }
}
