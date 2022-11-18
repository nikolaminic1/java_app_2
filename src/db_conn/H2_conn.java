package db_conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class H2_conn {

    public static void connect() throws SQLException {
        String url = "jcdb:h2:file:C:/ProgramData/qm2_studio/data/h2database";
        Connection connection = DriverManager.getConnection(url);
    }
}
