public class Ejercicio3_Producto {
    private String nombre;
	private double precio;

	public Ejercicio3_Producto (String nombre, double precio){
		this.nombre = nombre;
		this.precio = precio;
	}

	public void mostrar(){
		System.out.println("Nombre: " +nombre +" Precio: " + precio); ;
	}
}
