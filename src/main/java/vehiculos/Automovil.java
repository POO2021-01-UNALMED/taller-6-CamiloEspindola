package vehiculos;
import java.util.ArrayList;

public class Automovil extends Vehiculo{
	
	protected int puestos;
	protected static ArrayList<Automovil>contador = new ArrayList<Automovil>();
	Vehiculo obj;
	public Automovil() {
		super();
		
	}
	

	public Automovil(String placa,   String nombre, int precio, int peso, Fabricante fabricante, int puestos) {
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
