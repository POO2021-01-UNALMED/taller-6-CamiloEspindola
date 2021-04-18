package vehiculos;
import java.util.ArrayList;
public class Fabricante {
	private String nombre;
	private Pais pais;
	private static ArrayList<Fabricante> lista = new ArrayList<>();
	private int numVentas;
	
	public void nuevaVenta(){
        numVentas++;
        pais.agregarVenta();
    }
	public int getVentas(){
        return numVentas;
    }
	public static Fabricante fabricaMayorVentas(){
        Fabricante mayor = lista.get(0);
        for(Fabricante f: lista){
            if(f.getVentas() > mayor.getVentas()){
                mayor = f;
            }
        }
        return mayor;
    }
	
	public Fabricante(String nombre, Pais pais) {
		super();
		this.nombre = nombre;
		this.pais = pais;
		lista.add(this);
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	
	
}
