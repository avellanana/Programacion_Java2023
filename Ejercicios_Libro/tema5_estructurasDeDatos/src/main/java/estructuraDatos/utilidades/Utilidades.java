package estructuraDatos.utilidades;

import java.util.Random;

public class Utilidades {
	
	public static int numerosAleatoriosEntre0y9() {
		Random rand = new Random();
		return rand.nextInt(10);
	}

	public void muestraArray(int[] array1) {
		for(int i=0; i<array1.length; i++) {
			System.out.println(i + " : " + array1[1]);
		}		
	}
}
