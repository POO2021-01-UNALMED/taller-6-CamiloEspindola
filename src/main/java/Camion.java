package vehiculos;

import java.util.ArrayList;

public class Camion extends Vehiculo {

	private int ejes;
	private static ArrayList<Camion>contador = new ArrayList<Camion>();
	
	public Camion() {
		super();
		
	}

	public Camion(String placa, int puertas, int velocidadMaxima, String nombre, int precio, int peso, String traccion,
			Fabricante fabricante, int ejes) {
		super(placa, 2, 80, nombre, precio, peso, "4X2", fabricante);
		this.ejes = ejes;
		contador.add(this);
		contadorV.add(this);
	}
	

	public static ArrayList<Camion> getContador() {
		return contador;
	}

	public static void setContador(ArrayList<Camion> contador) {
		Camion.contador = contador;
	}

	public int getEjes() {
		return ejes;
	}

	public void setEjes(int ejes) {
		this.ejes = ejes;
	}
	

}
