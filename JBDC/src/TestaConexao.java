import java.sql.*;

public class TestaConexao {
    public static void main(String[] args) throws SQLException{
        ConnectionFactory criaconexao = new ConnectionFactory();
        Connection connection = criaconexao.recuperarConexao();
        connection.close();
    }
}
