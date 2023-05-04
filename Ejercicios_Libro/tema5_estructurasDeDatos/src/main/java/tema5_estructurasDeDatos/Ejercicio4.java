package tema5_estructurasDeDatos;

public class Ejercicio4 {
	
	//Ejercicio 4:  Crear un metodo igual que el anterior que  reciba dos arrays pero en esta ocasión de String 
	//y los compare para ver si tienen los mismos elementos en la misma posición

	static String[] prim = {"uno","dos","tres"};
	static String[] seg = {"uno","dos","tres"};
	
	static boolean MismoArray(String[] primera, String[] segunda) {
		if(primera.length!=segunda.length)
			return false;
		else {
			for (int i=0;i<primera.length; i++) {
				if(primera[i].equals(segunda[i])) {
					return false;
				}
			}return true;
		}
	}
	
	public static void main(String[] args) {
		System.out.println(MismoArray(prim,seg));
	}

}