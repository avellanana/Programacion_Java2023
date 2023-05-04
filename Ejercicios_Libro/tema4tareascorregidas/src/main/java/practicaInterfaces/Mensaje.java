package practicaInterfaces;

public class Mensaje implements Logable {
	
	private String mensaje;
	private String prioridad;
	
	public Mensaje (String mensaje) {
		this.mensaje = mensaje;
		this.prioridad = "La prioridad es media";
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public String getPrioridad() {
		return prioridad;
	}

	public void setPrioridad(String prioridad) {
		this.prioridad = prioridad;
	}

	public String leerMensaje() {
		return mensaje;
	}

	public void cambiarPrioridadAlta() {
		this.prioridad = "La prioridad es alta";
		
	}

	public void cambiarPrioridadMedia() {
		this.prioridad = "La prioridad es media";
		
	}

	public void cambiarPrioridadBaja() {
		this.prioridad = "La prioridad es baja";
	}

	public void cambiarMensaje(String NuevoMensaje) {
		this.mensaje = NuevoMensaje;	
	}
	
}
