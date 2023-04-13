import java.sql.*;

public class TestaListagem { 
    public static void main(String[] args) throws SQLException{
        
        ConnectionFactory criarConexao = new ConnectionFactory();
        Connection con = criarConexao.recuperarConexao();

        Statement stm = con.createStatement();
        stm.execute("select * from produto");
        ResultSet rst = stm.getResultSet();

        while(rst.next()){
            Integer id = rst.getInt(1);
            String nome = rst.getString(2);
            String desc = rst.getString(3);
            System.out.println("Id: " + id + "\nNome: " + nome + "\nDescrição: " + desc + '\n');
        }

        con.close();
    }
}
