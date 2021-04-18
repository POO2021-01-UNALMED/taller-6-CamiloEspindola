package vehiculos;
import java.util.ArrayList;


public class Camioneta extends Vehiculo {

	protected boolean volco;
	protected static ArrayList<Camioneta>contador = new ArrayList<Camioneta>();
	
	public Camioneta() {
		super();
		
	}

	public Camioneta(String placa, int puertas, String nombre, int precio, int peso,
			 Fabricante fabricante, boolean volco) {
		super(placa, puertas, 90, nombre, precio, peso, "4X4", fabricante);
		this.volco = volco;
		contador.add(this);
		contadorV.add(this);
		
	}
	

	public static ArrayList<Camioneta> getContador() {
		return contador;
	}

	public static void setContador(ArrayList<Camioneta> contador) {
		Camioneta.contador = contador;
	}

	public boolean isVolco() {
		return volco;
	}

	public void setVolco(boolean volco) {
		this.volco = volco;
	}
 
	
}
