import java.sql.*;
import java.util.*;

public class CategoriaDAO{
    private Connection con;

    private Categoria ultima;

    public CategoriaDAO(Connection con){
        this.con = con;
    }

    public void inserir(Categoria categoria) throws SQLException{
        String sql = "INSERT INTO categoria (NOME) VALUES (?)";
        try(PreparedStatement pstm = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)){
            pstm.setString(1, categoria.getNome());

            pstm.execute();

            try(ResultSet rs = pstm.getGeneratedKeys()){
                while(rs.next()){
                    categoria.setId(rs.getInt(1));
                }
            }
        }
    }

    public List<Categoria> listar() throws SQLException{
        List<Categoria> categorias = new ArrayList<Categoria>();
        String sql = "SELECT * FROM categoria";
        try(PreparedStatement pstm = con.prepareStatement(sql)){
            pstm.execute();

            try(ResultSet rs = pstm.getResultSet()){
                while(rs.next()){
                    Categoria categoria = new Categoria(rs.getInt(1), rs.getString(2));
                    categorias.add(categoria);
                }
            }
        }
        return categorias;
    }

    public List<Categoria> listarComProduto() throws SQLException{
        List<Categoria> categorias = new ArrayList<Categoria>();
        String sql = "SELECT C.id, C.nome, P.id, P.nome, P.descricao FROM produto P INNER JOIN categoria C ON P.categoria_id = C.id";
        try(PreparedStatement pstm = con.prepareStatement(sql)){
            pstm.execute();

            try(ResultSet rs = pstm.getResultSet()){
                while(rs.next()){
                    if(ultima == null || !ultima.getNome().equals(rs.getString(2))){
                        Categoria categoria = new Categoria(rs.getInt(1), rs.getString(2));
                        ultima = categoria;
                        categorias.add(categoria);
                    }
                    Produto produto = new Produto(rs.getInt(3), rs.getString(4), rs.getString(5));
                    ultima.adicionar(produto);
                }
            }
        }
        return categorias;
    }

    public int remover(Integer id) throws SQLException{
        String sql = "DELETE FROM categoria WHERE ID = ?";
        try(PreparedStatement pstm = con.prepareStatement(sql)){
            pstm.setInt(1, id);
            pstm.execute();
            return pstm.getUpdateCount(); 
        }
    } 
}
