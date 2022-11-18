package _inititailize;

import java.sql.SQLException;

import static db_conn.H2_conn.connect;

public class AppInit {
    public void start_app() throws SQLException {
        connect();
    }
}
