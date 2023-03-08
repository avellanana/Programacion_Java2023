package clase;

public class Moto {
	
	public String marca;
	
	public int velocidad;
	
	public Moto() {
		marca = "";
		velocidad = 0;
	}
	
	public Moto(String lamarca, int lavelocidad) {
		marca = lamarca;
		velocidad = lavelocidad;
	}
	
	public String obtenerMarca() {
		return marca;
	}
	
	public int obtenerVelocidad() {
		return velocidad;
	}
	
	public void modificarMarca(String lamarca) {
		this.marca = lamarca;
	}
	
	public void modificarVelocidad(int lavelocidad) {
		velocidad = lavelocidad;
	}
	
	public static void main(String[] args) {
		Moto Moto1 = new Moto();
		Moto Moto2 = new Moto("BMW",200);
	}

}
