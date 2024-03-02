package jm.task.core.jdbc.util;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private static Connection connection = null;

    public static Connection getConnection() throws SQLException {
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "root");
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("При соединении возникло исключение: " + e);
        }
        return connection;
    }
}
