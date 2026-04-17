import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/pacman_db";
    private static final String USER = "root";   // change if your MySQL username is different
    private static final String PASSWORD = "Mange$h9767"; // replace with your MySQL password

    public static Connection getConnection() throws Exception {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
