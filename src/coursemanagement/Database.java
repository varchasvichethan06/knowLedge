package coursemanagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Database {


    private final static String url = "jdbc:mysql://localhost:3306/coursemanagement";
    private final static String user = "root";
    private final static String password = "";
    private static Connection connection;

    /*
     * Returns the database connection.
     *
     * @return database connection
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public static Connection getConnection() {
        if (connection == null) {
            try {
                connection = DriverManager.getConnection(url, user, password);
            }
            catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return connection;
    }
}