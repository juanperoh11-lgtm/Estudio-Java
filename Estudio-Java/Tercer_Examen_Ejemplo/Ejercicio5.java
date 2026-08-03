import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Ejercicio5 {
    public static void main (String [] args){
		ArrayList<Ejercicio4> lista = new ArrayList <>();
		try(BufferedReader br = new BufferedReader(new FileReader("biblioteca.txt"))){
		String linea;
		while((linea = br.readLine())!= null){
			String [] datos =  linea.split(":");
			if (datos.length == 6) {
                    // Conversión de datos
                    String titulo = datos[0];
                    String autor = datos[1];
                    String isbn = datos[2];
                    int anio = Integer.parseInt(datos[3]); // Conversión a int
                    String estado = datos[4];
                    String edicion = datos[5];

                    // Instanciamos y guardamos directamente en la lista del main
                    lista.add(new Ejercicio4(titulo, autor, isbn, anio, estado, edicion));
                }
            }

            System.out.println("¡Carga completada! Total libros en lista: " + lista.size());
		}catch(IOException e){
        System.out.println(e.getMessage());
        }
    }
}
