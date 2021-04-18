package vehiculos;
import java.util.ArrayList;

public class Pais {
	private String nombre;
	public static ArrayList<Pais>paisesRepetidos= new ArrayList<Pais>();
	public static ArrayList<Pais>paisesSinRepetir= new ArrayList<Pais>();
	private int numVentas;
	
	public void agregarVenta(){
        numVentas++;
    }

    public int getVentas(){
        return  numVentas;
    }
    
	public Pais(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Pais paisMasVendedor() {
		
		for(int i=0; i<Vehiculo.contadorV.size();  i++) {
			paisesRepetidos.add(i, Vehiculo.contadorV.get(i).getFabricante().getPais()); 	
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
}
