import java.sql.*;
import java.util.*;

public class TesteCategoria {
    public static void main(String[] args) throws SQLException{
        
        try(Connection con = new ConnectionFactory().recuperarConexao()){
            CategoriaDAO categoriaDAO = new CategoriaDAO(con);

            // categoriaDAO.inserir(brinquedo);

            // System.out.println();

            List<Categoria> listaDeCategoria = categoriaDAO.listarComProduto();
            listaDeCategoria.forEach(categoria -> {
                System.out.println(categoria);
                for(Produto produto : categoria.getProdutos()){
                    System.out.println(categoria.getNome() + " - " + produto.getNome());
                }
            });

            // System.out.println();

            // System.out.println(categoriaDAO.remover(4));;

            // System.out.println();

            // listaDeCategoria = categoriaDAO.listar();
            // listaDeCategoria.forEach(categoria -> {
            //     System.out.println(categoria);
            // });
        }
    }
}
