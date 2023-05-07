package tema4Biblioteca;

public class Revista extends Biblioteca implements Prestable {
	
	private boolean prestado;
	private String ident;
	
	public Revista(String ident, String titulo, String codigo, int anioPublicacion) {
		super(titulo, codigo, anioPublicacion);
		this.ident=ident;
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
	
	public String getIdent() {
		return ident;
	}
	
	public void setIdent(String ident) {
		this.ident = ident;
	}

}
