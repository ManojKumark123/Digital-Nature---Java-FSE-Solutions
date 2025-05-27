// Exercise 32 - Insert and Update Operations in JDBC
import java.sql.*;

public class Exercise_32 {
    public static void main(String[] args) {
        String url = "jdbc:sqlite:students.db";

        try (Connection conn = DriverManager.getConnection(url)) {
            String insertSQL = "INSERT INTO students(id, name) VALUES(?, ?)";
            try (PreparedStatement pstmt = conn.prepareStatement(insertSQL)) {
                pstmt.setInt(1, 1);
                pstmt.setString(2, "John Doe");
                pstmt.executeUpdate();
            }

            String updateSQL = "UPDATE students SET name=? WHERE id=?";
            try (PreparedStatement pstmt = conn.prepareStatement(updateSQL)) {
                pstmt.setString(1, "Jane Doe");
                pstmt.setInt(2, 1);
                pstmt.executeUpdate();
            }

            System.out.println("Insert and update complete.");
        } catch (SQLException e) {
            System.out.println("SQL Error: " + e.getMessage());
        }
    }
}
