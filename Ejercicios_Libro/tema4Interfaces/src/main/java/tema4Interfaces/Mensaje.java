package tema4Interfaces;
/*Crear la clase mensaje que contenga un atributo mensaje tipo texto y un atributo prioridad tipo 
text que podrá tomar los valores "normal", "baja", "alta". 
Crear un constructor con el parametro mensaje que seteará la prioridad a normal. 
Esta clase debe implementar la interfaz logable.

Crear los tests unitarios para crear instancias de la clase y probar los metodos de la interfaz
 */

public class Mensaje implements Logable {
	//atributos
	private String mensaje;
	private String prioridad;
	
	//constructor
	public Mensaje(String mensaje) {
		this.mensaje = mensaje;
		this.prioridad = "normal";
	}
	
	//set y get
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
	public String getMensaje() {
		return mensaje;
	}
	
	public void setPrioridad(String prioridad) {
		this.prioridad = prioridad;
	}
	
	public String getPrioridad() {
		return prioridad;
	}
	
	//metodos
	public void cambiarPrioridadAlta() {
		this.prioridad = "alta";
	}
	
	public void cambiarPrioridadBaja() {
		this.prioridad = "baja";
	}
	
	public void cambiarPrioridadMedia() {
		this.prioridad = "normal";
	}
	
	public String leerMensaje() {
		return mensaje;
	}
	
	public void cambiarMensaje(String NuevoMensaje) {
		this.mensaje = NuevoMensaje;
	}
	
	public static void main(String [] args) {
		Mensaje m = new Mensaje("Este es el mensaje de prueba");
		System.out.println(m.getMensaje());
		m.cambiarMensaje("Este es el cambio de mensaje");
		System.out.println(m.getMensaje());
		System.out.println(m.getPrioridad());
		
	}

}
