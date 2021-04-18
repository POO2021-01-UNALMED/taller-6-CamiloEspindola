package vehiculos;
import java.util.ArrayList;
public class Fabricante {
	private String nombre;
	private Pais pais;
	private static ArrayList<Fabricante> contador = new ArrayList<>();
	private int numVentas;
	
	public void nuevaVenta(){
        numVentas++;
        pais.agregarVenta();
    }
	public int getVentas(){
        return numVentas;
    }
	public static Fabricante fabricaMayorVentas(){
        Fabricante mayor = contador.get(0);
        for(Fabricante f: contador){
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
		contador.add(this);
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
