package tema5.matrices;

public class ServicioRectangulo {
	
	//devuelve un array de rectangulos
	//con la longitud pasada por parametro 
	
	public static Rectangulo[] getRectangulos(int longitud) {
		Rectangulo[] arrayRectangulos = new Rectangulo[longitud];
		
		for (int i=0; i<arrayRectangulos.length; i++) {
			arrayRectangulos[i] = new Rectangulo(0,1);
		}
		return arrayRectangulos;
	}
	
	public static void main(String [] args) {
		ServicioRectangulo se = new ServicioRectangulo();
		Rectangulo[] rectangulos = se.getRectangulos(5);
		
		for (Rectangulo rectangulo : rectangulos) {
			System.out.println(rectangulo);
		}
		
	}

	
}
