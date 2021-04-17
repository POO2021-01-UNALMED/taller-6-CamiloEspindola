package vehiculos;

import java.util.ArrayList;

public class Vehiculo {
	private String placa;
	private int puertas;
	private int velocidadMaxima;
	private String nombre;
	private int precio;
	private int peso;
	private String traccion;
	private Fabricante fabricante;
	public static ArrayList<Vehiculo>contadorV = new ArrayList<Vehiculo>();
	public static ArrayList<Pais>paisesRepetidos= new ArrayList<Pais>();
	public static ArrayList<Pais>paisesSinRepetir= new ArrayList<Pais>();
	
	static Automovil objA;
	static Camion objB;
	static Camioneta objC;
	
	public Vehiculo() {
		super();
		
	}
	
	public static int getCantidadVehiculos() {
		return objA.getContador().size()+objB.getContador().size()+objC.getContador().size();
	}
	
	public static String vehiculosPorTipo() {
		return "Automoviles: "+objA.getContador().size()+"\n"
		+"Camionetas: "+objC.getContador().size()+"\n"
		+"Camiones: "+objB.getContador().size();
		
	}


	public Vehiculo(String placa, int puertas, int velocidadMaxima, String nombre, int precio, int peso,
			String traccion, Fabricante fabricante) {
		super();
		this.placa = placa;
		this.puertas = puertas;
		this.velocidadMaxima = velocidadMaxima;
		this.nombre = nombre;
		this.precio = precio;
		this.peso = peso;
		this.traccion = traccion;
		this.fabricante = fabricante;
	}
	
	
	
	public Pais paisMasVendedor() {
		
		for(int i=0; i<contadorV.size();  i++) {
			paisesRepetidos.add(i, contadorV.get(i).getFabricante().getPais()); 	
		}
		for(int i=0; i<paisesRepetidos.size();  i++) {
			while (true) {
				if(i>paisesRepetidos.size()) {
					break;
				}
				if(paisesSinRepetir.contains(paisesRepetidos.get(i))==true) {}
				else {
					paisesSinRepetir.add(paisesRepetidos.get(i));
				}
			}
			
		}
		int a [] = new int [paisesSinRepetir.size()];
		for(int i = 0; i < paisesSinRepetir.size(); i++) {
			 
			 for(int j = 0; j < paisesRepetidos.size(); j++) {
				 if(paisesRepetidos.get(j)==paisesSinRepetir.get(i)) {
					 a[i]+=1; 
				 }
				 
			 }
			
		}
		int mayor = 0;
		int posicion = 0;
		for(int i = 0; i < a.length; i++) {
			if(a[i]>mayor)
				mayor = a[i];
				posicion = i;
		}
		return paisesSinRepetir.get(posicion);
		
	}


	public String getPlaca() {
		return placa;
	}


	public void setPlaca(String placa) {
		this.placa = placa;
	}


	public int getPuertas() {
		return puertas;
	}


	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}


	public int getVelocidadMaxima() {
		return velocidadMaxima;
	}


	public void setVelocidadMaxima(int velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getPrecio() {
		return precio;
	}


	public void setPrecio(int precio) {
		this.precio = precio;
	}


	public int getPeso() {
		return peso;
	}


	public void setPeso(int peso) {
		this.peso = peso;
	}


	public String getTraccion() {
		return traccion;
	}


	public void setTraccion(String traccion) {
		this.traccion = traccion;
	}


	public Fabricante getFabricante() {
		return fabricante;
	}


	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}
	

	
}