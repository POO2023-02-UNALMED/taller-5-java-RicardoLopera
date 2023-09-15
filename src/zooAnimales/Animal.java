package zooAnimales;
import gestion.Zona;

public class Animal {
	
	private static int totalAnimales;
	private String nombre;
	private int edad;
	private String habitad;
	private String genero;
	private Zona zona;
	
	public Animal(String nombre, int edad, String habitad, String genero) {
		this.nombre = nombre;
		this.edad = edad;
		this.habitad = habitad;
		this.genero = genero;
		totalAnimales++;
	}
	public Animal() {
		totalAnimales++;
	}
	
	public String movimiento() {
		return "desplazarse";
	}
	public static String totalPorTipo() {
		String cadena = "Mamiferos: " + Mamifero.cantidadMamiferos() + "\n" +"Aves: "+ Ave.cantidadAves()+"\n" + "Reptiles: " + Reptil.cantidadReptiles() + "\n" + 
				"Peces: " + Pez.cantidadPeces() + "\n" +
				"Anfibios: " + Anfibio.cantidadAnfibios();
		return cadena;
	}
	public String toString() {
		String cadena = "Mi nombre es " +this.nombre + "tengo una edad de " + this.edad + ", habito en " + this.habitad + "y mi genero es"
				+this.genero;
		if (this.zona != null) {
			String cadenaCompleta = cadena + ", la zona en la que me ubico es" + this.zona.getNombre() + ", en el" +this.zona.getZoo().getNombre();
			return cadenaCompleta;
		}
		return cadena;
	}
	
	public static int getTotalAnimales() {
		return totalAnimales;
	}
	public static void setTotalAnimales(int totalAnimales) {
		Animal.totalAnimales = totalAnimales;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getHabitad() {
		return habitad;
	}
	public void setHabitad(String habitad) {
		this.habitad = habitad;
	}
	public Zona getZona() {
		return zona;
	}
	public void setZona(Zona zona) {
		this.zona = zona;
	}
	
}
