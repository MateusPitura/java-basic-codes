import java.sql.*;
import java.util.*;

public class TesteProduto {
    public static void main(String[] args) throws SQLException {

        try(Connection con = new ConnectionFactory().recuperarConexao()){
            ProdutoDAO produtoDao = new ProdutoDAO(con);

            // System.out.println();

            List<Produto> listaDeProduto = produtoDao.listar();
            listaDeProduto.forEach(produto -> {
                System.out.println(produto);
            });

            //System.out.println(produtoDao.remover(1));

            // System.out.println();

            // listaDeProduto = produtoDao.listar();
            // listaDeProduto.forEach(produto -> {
            //     System.out.println(produto);
            // });
        }  
    }
}
