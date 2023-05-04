package tema5_estructurasDeDatos;

public class Ejercicio3 {
	
	//Ejercicio 3: Crear un metodo que reciba dos arrays de enteros y los compare para ver si tienen los mismos elementos en la misma posición
	
	static int[] prim = {1,2,3};
	static int[] seg = {1,2,3};
	
	static boolean MismoArray(int[] primera, int[] segunda) {
		if(primera.length!=segunda.length)
			return false;
		else {
			for (int i=0;i<primera.length; i++) {
				if(primera[i]!=segunda[i]) {
					return false;
				}
			}return true;
		}
	}
	
	public static void main(String[] args) {
		System.out.println(MismoArray(prim,seg));
	}

}
