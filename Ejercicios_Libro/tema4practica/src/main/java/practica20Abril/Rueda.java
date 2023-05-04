package practica20Abril;

public class Rueda {
	
	private int radio;
	private int tipo;
	
	public Rueda() {
		this.radio = 1;
		this.tipo = 1;
	}
	
	public Rueda(int radio) {
		this();
		this.radio = radio;
	}
	
	public Rueda(int radio, int tipo) {
		this(radio);
		this.tipo = tipo;
	}

}
