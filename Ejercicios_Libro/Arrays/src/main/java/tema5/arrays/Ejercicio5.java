package tema5.arrays;

import java.util.Arrays;

/*Ejercicio 5: Dado un array de números de 5 posiciones con los siguiente valores {1,2,3,4,5}, 
 * guardar los valores de este array en otro array distinto pero con los valores invertidos, es decir, 
 * que el segundo array debera tener los valores {5,4,3,2,1}. */

public class Ejercicio5 {
	
	int [] array = {1,2,3,4,5,6,7};
	
	public void arrayInvertido() {
		int[] arrayInvertido = new int[array.length];
		for (int i =0; i<array.length;i++) {
			arrayInvertido[i] = array[array.length-i-1];
		}
		System.out.println(Arrays.toString(arrayInvertido));;
	}
	
	public static void main (String[] args) {
		Ejercicio5 e5 = new Ejercicio5();
		e5.arrayInvertido();
	}

}
