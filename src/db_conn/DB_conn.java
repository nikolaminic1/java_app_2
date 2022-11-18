package db_conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Properties;

public class DB_conn {

    public static void connection()
    {
        String url = "jdbc:postgresql://localhost/javadb";
        Properties props = new Properties();
        props.setProperty("user", "postgres");
        props.setProperty("password", "IchBinEinBerliner1");

        Connection conn;
        Statement stmt;

        try
        {
            conn = DriverManager.getConnection(url, props);
            stmt = conn.createStatement();
            String sql =
                    "CREATE TABLE Students" +
                    "(ID INT PRIMARY KEY NOT NULL ," +
                    "NAME TEXT NOT NULL)";

            stmt.executeUpdate(sql);
            stmt.close();
            conn.close();
        }
        catch (Exception e)
        {

        }

    }

}
