package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    public static Connection getConnection() throws SQLException {
        String hostName = "localhost";
        String dbName = "new_schema";
        String userName = "root";
        String password = "root";
        String connectionURL = "jdbc:mysql://" + hostName + ":3306/" + dbName;

        Connection connection = DriverManager.getConnection(connectionURL, userName, password);
        connection.setAutoCommit(false);
        
        return connection;
    }
}
