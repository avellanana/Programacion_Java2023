package conceptosBasicos;

public class Taza {
	private String color;
	private String forma;
	private String tamano;
	
	public Taza() {
		this.color = "rojo";
		this.color = "cuadrada";
		this.tamano = "grande";
	}
	
	public Taza(String color, String forma, String tamano) {
		this.color = color;
		this.forma = forma;
		this.tamano = tamano;
	}
	
	public static void main (String []args) {
		Taza taza1 = new Taza();
		System.out.println(taza1.color);
		
		Taza taza2 = new Taza("verde", "redonda", "pequeña");
		System.out.println(taza2.color);
	}

}
