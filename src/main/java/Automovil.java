package vehiculos;
import java.util.ArrayList;



public class Automovil extends Vehiculo{
	
	private int puestos;
	private static ArrayList<Automovil>contador = new ArrayList<Automovil>();
	public Automovil() {
		super();
		
	}
	

	public Automovil(String placa, int puertas, int velocidadMaxima, String nombre, int precio, int peso, 
	String traccion, Fabricante fabricante, int puestos) {
		super(placa, 4, 100, nombre, precio, peso, "FWD", fabricante);
		this.puestos = puestos;
		contador.add(this);
		contadorV.add(this);
	}
	
	public static ArrayList<Automovil> getContador() {
		return contador;
	}

	public static void setContador(ArrayList<Automovil> contador) {
		Automovil.contador = contador;
	}

	public int getPuestos() {
		return puestos;
	}

	public void setPuestos(int puestos) {
		this.puestos = puestos;
	}
	
}
