import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Ejercicio9 {
    private final static String URL = "jdbc:mysql://localhost:3306/instituto";
    private final static String USUARIO = "root";
    private final static String PASSWORD = "";

    public static void main(String[] args) {
        String sql = "INSERT INTO alumnos (nombre, nota) VALUES (?, ?)";
        try (Connection conn = DriverManager.getConnection(URL, USUARIO, PASSWORD);
                PreparedStatement pstmt = conn.prepareStatement(sql);
                ResultSet rst = pstmt.executeQuery()) {
            while (rst.next()) {
                int id = rst.getInt("id");
                String nombre = rst.getString("Nombre");
                int nota = rst.getInt("tipo");
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
