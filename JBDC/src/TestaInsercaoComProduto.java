import java.sql.*;

public class TestaInsercaoComProduto {
    public static void main(String[] args) throws SQLException {
        Produto comoda = new Produto("Comoda", "Comoda vertical");

        try(Connection con = new ConnectionFactory().recuperarConexao()){
            String sql = "INSERT INTO produto (NOME, DESCRICAO) VALUES (?, ?)";
            try(PreparedStatement pstm = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)){
                pstm.setString(1, comoda.getNome());
                pstm.setString(2, comoda.getDescricao());
    
                pstm.execute();

                try(ResultSet rs = pstm.getGeneratedKeys()){
                    while(rs.next()){
                        comoda.setId(rs.getInt(1));
                    }
                }
            }
        }
        System.out.println(comoda);   
    }
}
