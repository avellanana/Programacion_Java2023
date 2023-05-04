package objetoscomplejos;

public class Mascota {
	
	String nombre;
	
	public Mascota(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return new Mascota(this.nombre);
	}
	
	

}
