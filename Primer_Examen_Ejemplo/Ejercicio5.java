import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio5 {
    public static void main(String[] args) {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("biblioteca.txt"));
            String linea = "";

            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(":");

                if (partes.length >= 5) {
                    String titulo = partes[0];
                    String estado = partes[4];

                    if ("DISPONIBLE".equals(estado)) {
                        System.out.println(titulo);
                    }
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}