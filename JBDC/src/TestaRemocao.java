import java.sql.*;

public class TestaRemocao {
    public static void main(String[] args) throws SQLException{
        ConnectionFactory cf = new ConnectionFactory();
        Connection con = cf.recuperarConexao();

        PreparedStatement stm = con.prepareStatement("delete from produto where id >= ?");
        stm.setInt(1, 2);
        stm.execute();

        Integer linhasModificadas = stm.getUpdateCount();
        System.out.println(linhasModificadas);
    }
}
