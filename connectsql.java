package simple_demo.db_client;

import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;

public class connectsql {

    public static Conection HelloApplicationConnection(){

        Connection con = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:3306;databaseName=persondb;username=root;password=123";
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBConnection.class.getName()).Log(Level.SEVERE, null, ex);
        }
        return (Conection) con;
    }
}
