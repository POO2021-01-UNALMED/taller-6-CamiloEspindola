package vehiculos;
import java.util.ArrayList;
public class Pais {
	private String nombre;
	private static ArrayList<Pais> contador = new ArrayList<>();
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
		contador.add(this);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public static Pais paisMasVendedor() {
        Pais mayor = contador.get(0);
        for(Pais p: contador){
            if(p.getVentas() > mayor.getVentas()){
                mayor = p;
            }
        }
        return mayor;
    }
}
