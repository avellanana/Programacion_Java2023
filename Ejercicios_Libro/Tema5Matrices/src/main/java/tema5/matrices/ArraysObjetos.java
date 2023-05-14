package tema5.matrices;

public class ArraysObjetos {
	
	public static Rectangulo[] obtenerRectangulos() {
		Rectangulo r1 = new Rectangulo(1,1);
		
		//crear array de tamaño 5 de rectangulos
		System.out.println(r1);
		
		Rectangulo [] rectangulos=new Rectangulo[5];
	
	//crear 5 rectangulos
		Rectangulo r2 = new Rectangulo(1,2);
		Rectangulo r3 = new Rectangulo(1,3);
		Rectangulo r4 = new Rectangulo(1,4);
		Rectangulo r5 = new Rectangulo(1,5);
		Rectangulo r6 = new Rectangulo(1,6);
	
	//rellenar el array
		
		rectangulos[0]=r2;
		rectangulos[1]=r3;
		rectangulos[2]=r4;
		rectangulos[3]=r5;
		rectangulos[4]=r6;

		//crear e inicializar (es lo mismo que el anterior)
				Rectangulo[] rectangulos2 = {r2,r3,r4,r5,new Rectangulo(1,6)};
				return rectangulos2;
	}
		
	//iterar sobre el array para ver los rectangulos que contiene
				public static void main(String[] args) {
					Rectangulo[] rectangulos = obtenerRectangulos();
				
				for (Rectangulo rectangulo : rectangulos) {
			System.out.println(rectangulo);
		}
		
	
	}
}
