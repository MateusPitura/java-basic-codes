import java.sql.*;

public class TestaRemocao {
    public static void main(String[] args) throws SQLException{
        ConnectionFactory cf = new ConnectionFactory();
        Connection con = cf.recuperarConexao();

        Statement stm = con.createStatement();
        stm.execute("delete from produto where id > 2");

        Integer linhasModificadas = stm.getUpdateCount();
        System.out.println(linhasModificadas);
    }
}
