package tema5.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

//Ejercicio 3: Crear un metodo que reciba dos arrays de enteros y los compare 
//para ver si tienen los mismos elementos en la misma posición

public class Ejercicio3 {
	
	int [] arrayUno = {1,3,5,7,9};
	int [] arrayDos = {4,6,8,0,9};
	
	private void comparaArrays() {
		if (arrayUno.length != arrayDos.length) {
			System.out.println("Los arrays" + Arrays.toString(arrayUno) + " y " + Arrays.toString(arrayDos) + " son diferentes");
		} else {
			for (int i=0; i<arrayUno.length; i++) {
				if(arrayUno[i]!=arrayDos[i]) {
					System.out.println("Los arrays" + Arrays.toString(arrayUno) + " y " + Arrays.toString(arrayDos) + " son diferentes");
					return;
				}
			}
			System.out.println("Los arrays" + Arrays.toString(arrayUno) + " y " + Arrays.toString(arrayDos) + " son iguales");
		}
	}

	
	public static void main(String[] args) {
		Ejercicio3 e3 = new Ejercicio3();
		e3.comparaArrays();
	}
}
