import java.sql.*;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class ConnectionFactory {

    public DataSource ds;

    public ConnectionFactory(){
        ComboPooledDataSource pool = new ComboPooledDataSource();
        pool.setJdbcUrl("jdbc:mysql://localhost/loja_virtual?useTimezone=true&serverTimezone=UTC");
        pool.setUser("root");
        pool.setPassword("Engenharia.33");

        this.ds = pool;
    }

    public Connection recuperarConexao() throws SQLException{
        return this.ds.getConnection();
    }
}
