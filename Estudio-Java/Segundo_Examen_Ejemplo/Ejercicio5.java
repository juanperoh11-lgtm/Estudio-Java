import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Ejercicio5{
	public static void main (String [] args){
		ArrayList<String> titulos = new ArrayList<>();
		try(BufferedReader br = new BufferedReader(new FileReader("Archivo.txt"))) {
			String linea;
			while((linea = br.readLine()) != null){
				String [] partes =  linea.split(":");
				titulos.add(partes[0]);
			}

		}catch(IOException e){
			System.out.println(e.getMessage());
		}

		System.out.println("Numero de títulos: " + titulos.size());
		for(String t :titulos)
			System.out.println(t);
	}
}