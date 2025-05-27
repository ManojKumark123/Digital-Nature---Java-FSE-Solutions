// Exercise 31 - Basic JDBC Connection
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Exercise_31 {
    public static void main(String[] args) {
        String url = "jdbc:sqlite:students.db"; // SQLite example

        try (Connection conn = DriverManager.getConnection(url);
             Statement stmt = conn.createStatement()) {

            ResultSet rs = stmt.executeQuery("SELECT * FROM students");
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") +
                                   ", Name: " + rs.getString("name"));
            }
        } catch (Exception e) {
            System.out.println("Database error: " + e.getMessage());
        }
    }
}
