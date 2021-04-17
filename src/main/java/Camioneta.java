package vehiculos;

import java.util.ArrayList;

public class Camioneta extends Vehiculo {

	private boolean volco;
	private static ArrayList<Camioneta>contador = new ArrayList<Camioneta>();
	
	public Camioneta() {
		super();
		
	}

	public Camioneta(String placa, int puertas, int velocidadMaxima, String nombre, int precio, int peso,
			String traccion, Fabricante fabricante, boolean volco) {
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
