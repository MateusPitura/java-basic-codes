import java.sql.*;
import java.util.*;

public class App {
    public static void main(String[] args) throws SQLException {
        Produto comoda = new Produto("Comoda", "Comoda vertical");

        try(Connection con = new ConnectionFactory().recuperarConexao()){
            DAO produtoDao = new DAO(con);

            produtoDao.salvarProduto(comoda);

            System.out.println();

            List<Produto> listaDeProduto = produtoDao.listar();
            listaDeProduto.forEach(produto -> {
                System.out.println(produto);
            });

            System.out.println();

            System.out.println(produtoDao.remover());

            System.out.println();

            listaDeProduto = produtoDao.listar();
            listaDeProduto.forEach(produto -> {
                System.out.println(produto);
            });
        }  
    }
}
