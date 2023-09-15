package zooAnimales;
import java.util.ArrayList;

public class Anfibio extends Animal {
	private static ArrayList<Anfibio> listado;
	public static int ranas ;
	public static int salamandras;
	private String colorPiel;
	private boolean venenoso;
	public static int nAnfibios;
	
	public Anfibio (String nombre, int edad, String habitad, String genero, String colorPiel, boolean venenoso) {
		super(nombre, edad, habitad, genero);
		this.colorPiel = colorPiel;
		this.venenoso = venenoso;
		nAnfibios++;		
	}
	public Anfibio() {
		nAnfibios++;
	}
	
	public static int cantidadAnfibios() {
		return nAnfibios;
	}
	public String movimiento() {
		return "saltar";
	}
	public static Anfibio crearRana(String nombre, int edad, String genero) {
		Anfibio rana = new Anfibio(nombre, edad, "selva", genero, "rojo", true);
		ranas++;
		return rana;
	}
	public static Anfibio crearSalamandra(String nombre, int edad, String genero) {
		Anfibio salamandra = new Anfibio(nombre, edad, "selva", genero, "negro y amarillo", false);
		salamandras++;
		return salamandra;
	}
	public static ArrayList<Anfibio> getListado(){
		return listado;
	}
	public static void setListado(ArrayList<Anfibio> listado) {
		Anfibio.listado = listado;
	}
	public String getColorPiel() {
		return colorPiel;
	}
	public void setColorPiel(String colorPiel) {
		this.colorPiel = colorPiel;
	}
	public boolean isVenenoso() {
		return venenoso;
	}
	public void setVenenoso(boolean venenoso) {
		this.venenoso = venenoso;
	}
}
