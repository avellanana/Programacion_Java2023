package tema4Biblioteca;

public class Libro extends Biblioteca implements Prestable {
	
	private boolean prestado;
	
	public Libro(String titulo, String codigo, int anioPublicacion) {
		super(titulo, codigo, anioPublicacion);
		this.prestado=false;
	}
	
	public void prestar() {
		this.prestado=true;
	}
	
	public void devolver() {
		this.prestado=false;
	}
	
	public boolean isPrestado() {
		return this.prestado;
	}
	
	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}

}
