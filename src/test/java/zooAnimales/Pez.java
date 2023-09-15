package zooAnimales;
import java.util.ArrayList;
public class Pez extends Animal {
	private static ArrayList<Pez> listado;
	public static int salmones;
	public static int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;
	public static int nPeces;
	
	public Pez(String nombre, int edad, String habitad, String genero, String colorEscamas, int cantidadAletas ) {
		super(nombre, edad, habitad, genero);
		this.cantidadAletas = cantidadAletas;
		this.colorEscamas = colorEscamas;
		nPeces++;
	}
	
	public Pez() {
		nPeces++;
	}
	public static int cantidadPeces() {
		return nPeces;
	}
	public String movimiento() {
		return "nadar";
	}
	public static Pez crearSalmon(String nombre, int edad, String genero) {
		Pez salmon = new Pez(nombre, edad, "oceano", genero, "rojo", 6);
		salmones++;
		return salmon;
	}
	public static Pez crearBacalao(String nombre, int edad, String genero) {
		Pez bacalao = new Pez(nombre, edad, "oceano", genero, "gris", 6);
		bacalaos++;
		return bacalao;
	}
	public static ArrayList<Pez> getListado(){
		return listado;
	}
	public static void setListado(ArrayList<Pez> listado) {
		Pez.listado = listado;
	}
	public String getColorEscamas() {
		return colorEscamas;
	}
	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}
	public int getCantidadAletas() {
		return cantidadAletas;
	}
	public void setCantidadAletas(int cantidadAletas) {
		this.cantidadAletas = cantidadAletas;
	}
}
