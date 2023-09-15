package zooAnimales;
import java.util.ArrayList;

public class Ave extends Animal {
	
	private static ArrayList<Ave> listado;
	public static int halcones;
	public static int aguilas;
	private String colorPlumas;
	public static int nAves;
	
	public Ave (String nombre, int edad, String habitad, String genero, String colorPlumas) {
		super(nombre, edad, habitad, genero);
		this.colorPlumas = colorPlumas;
		nAves++;
	}
	public Ave() {
		nAves++;
	}
	
	public static int cantidadAves() {
		return nAves;
	}
	public String movimiento() {
		return "volar";
	}
	public static Ave crearHalcon(String nombre, int edad, String habitad, String genero) {
		Ave halcon = new Ave();
		halcones++;
		return halcon;
	}
	public static Ave crearAguila(String nombre, int edad, String habitad, String genero) {
		Ave aguila = new Ave();
		aguilas++;
		return aguila;
	}
	public ArrayList<Ave> getListado(){
		return listado;
	}
	public void setListado(ArrayList<Ave> listado) {
		Ave.listado = listado;
	}
	public String getColorPlumas() {
		return colorPlumas;
	}
	public void setColorPlumas(String colorPlumas) {
		this.colorPlumas = colorPlumas;
	}
	
}
