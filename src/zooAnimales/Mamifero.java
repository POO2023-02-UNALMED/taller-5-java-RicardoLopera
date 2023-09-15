package zooAnimales;
import java.util.ArrayList;

public class Mamifero extends Animal {
	private static ArrayList<Mamifero> listado;
	public static int caballos;
	public static int leones;
	public boolean pelaje;
	public int patas;
	public static int nMamiferos;
	
	public Mamifero (String nombre, int edad, String habitad, String genero, boolean pelaje, int patas) {
		super(nombre, edad, habitad, genero);
		this.pelaje = pelaje;
		this.patas = patas;
		nMamiferos++;
	}
	
	public Mamifero() {
		nMamiferos++;
	}
	
	public static int cantidadMamiferos() {
		return nMamiferos;
	}
	
	public static Mamifero crearCaballo(String nombre, int edad, String habitad, String genero) {
		Mamifero caballo = new Mamifero();
		caballos++;
		return caballo;
	}
	
	public static Mamifero crearLeon(String nombre, int edad, String habitad, String genero) {
		Mamifero leon = new Mamifero();
		leones++;
		return leon;
	}
	public ArrayList<Mamifero> getListado(){
		return listado;
	}
	public void setListado(ArrayList<Mamifero> listado) {
		Mamifero.listado = listado;
	}
	public int getPatas() {
		return patas;
	}
	public void setColorPiel(int patas) {
		this.patas = patas;
	}
	public boolean getPelaje() {
		return pelaje;
	}
	public void setPelaje(boolean pelaje) {
		this.pelaje = pelaje;
	}
}
