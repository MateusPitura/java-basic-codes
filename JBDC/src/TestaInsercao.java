import java.sql.*;

public class TestaInsercao {
    public static void main(String[] args) throws SQLException{
        ConnectionFactory cf = new ConnectionFactory();
        Connection con = cf.recuperarConexao();
        
        Statement inserir = con.createStatement();
        inserir.execute("insert into produto (nome, descricao) VALUES ('TV'," +
        " 'TV LG')", Statement.RETURN_GENERATED_KEYS);
        ResultSet rst = inserir.getGeneratedKeys();

        while(rst.next()){
            Integer id = rst.getInt(1);
            System.out.println(id);
        }

        con.close();
    }
}
