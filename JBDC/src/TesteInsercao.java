import java.sql.*;

public class TesteInsercao {
    public static void main(String[] args) throws SQLException{
        ConnectionFactory cf = new ConnectionFactory();
        try(Connection con = cf.recuperarConexao()){
            con.setAutoCommit(false);

            try(PreparedStatement stm = con.prepareStatement("insert into produto (nome, descricao) VALUES (?, ?)", Statement.RETURN_GENERATED_KEYS)){
                adicionarVariavel("SmartTV", "45 polegadas", stm);
                adicionarVariavel("Radio", "Radio de Bateria", stm);
                con.commit();
            } catch (Exception e){
                e.printStackTrace();
                System.out.println("ROLLBACK EXECUTADO");
                con.rollback();
            }
        }
    }

    private static void adicionarVariavel(String nome, String descricao, PreparedStatement stm) throws SQLException{
        stm.setString(1, nome);
        stm.setString(2, descricao);

        stm.execute();
        try(ResultSet rst = stm.getGeneratedKeys()){
            while(rst.next()){
                Integer id = rst.getInt(1);
                System.out.println(id);
            }
        }
    }    
}
