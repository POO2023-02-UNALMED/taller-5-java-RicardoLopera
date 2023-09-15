package zooAnimales;
import java.util.ArrayList;

public class Reptil extends Animal {
	private static ArrayList<Reptil> listado;
	public static int iguanas;
	public static int serpientes;
	private String colorEscamas;
	private int largoCola;
	private static int nReptiles;
	
	public Reptil(String nombre, int edad, String habitad, String genero, String colorEscamas, int largoCola) {
		super(nombre, edad, habitad, genero);
		this.colorEscamas = colorEscamas;
		this.largoCola = largoCola;
		nReptiles++;
	}
	
	public Reptil() {
		nReptiles++;
	}
	
	public static int cantidadReptiles() {
		return nReptiles;
	}
	public String movimiento() {
		return "reptar";
	}
	
	public static Reptil crearIguana(String nombre, int edad, String habitad, String genero) {
		Reptil iguana = new Reptil();
		nReptiles++;
		return iguana;
	}
	public static Reptil crearSerpiente(String nombre, int edad, String habitad, String genero) {
		Reptil serpiente = new Reptil();
		nReptiles++;
		return serpiente;
	}
	public ArrayList<Reptil> getListado(){
		return listado;
	}
	public void setListado(ArrayList<Reptil> listado) {
		Reptil.listado = listado;
	}
	public String getColorEscamas() {
		return colorEscamas;
	}
	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}
	public int getLargoCola() {
		return largoCola;
	}
	public void setLargoCola(int largoCola) {
		this.largoCola = largoCola;
	}
}
