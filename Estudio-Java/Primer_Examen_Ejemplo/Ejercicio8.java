import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Ejercicio8 {
    private final static String URL = "jdbc:mysql://localhost:3306/instituto";
    private final static String USUARIO = "root";
    private final static String PASSWORD = "";

    public static void main(String[] args) {

        String sql = "Select nombre, nota from alumno";
        try (Connection conn = DriverManager.getConnection(URL, USUARIO, PASSWORD);
                PreparedStatement pstmt = conn.prepareStatement(sql);
                ResultSet rst = pstmt.executeQuery()) {

            while (rst.next()) {
                String nombre = rst.getString("nombre");
                int nota = rst.getInt("nota");
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
