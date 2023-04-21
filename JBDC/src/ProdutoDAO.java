import java.sql.*;
import java.util.*;

public class ProdutoDAO{
    
    private Connection con;

    public ProdutoDAO(Connection con){
        this.con = con;
    }

    public void inserir(Produto produto) throws SQLException{
        String sql = "INSERT INTO produto (NOME, DESCRICAO) VALUES (?, ?)";
        try(PreparedStatement pstm = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)){
            pstm.setString(1, produto.getNome());
            pstm.setString(2, produto.getDescricao());

            pstm.execute();

            try(ResultSet rs = pstm.getGeneratedKeys()){
                while(rs.next()){
                    produto.setId(rs.getInt(1));
                }
            }
        }
    }

    public List<Produto> listar() throws SQLException{
        List<Produto> produtos = new ArrayList<Produto>();
        String sql = "SELECT * FROM produto";
        try(PreparedStatement pstm = con.prepareStatement(sql)){
            pstm.execute();

            try(ResultSet rs = pstm.getResultSet()){
                while(rs.next()){
                    Produto produto = new Produto(rs.getInt(1), rs.getString(2), rs.getString(3));
                    produtos.add(produto);
                }
            }
        }
        return produtos;
    }

    public int remover(Integer id) throws SQLException{
        String sql = "DELETE FROM produto WHERE ID = ?";
        try(PreparedStatement pstm = con.prepareStatement(sql)){
            pstm.setInt(1, id);
            pstm.execute();
            return pstm.getUpdateCount();
        }
    }
}
