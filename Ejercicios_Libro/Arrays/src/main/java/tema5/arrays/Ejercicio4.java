package tema5.arrays;

import java.util.Arrays;

//Ejercicio 4: Crear un metodo igual que el anterior que  reciba dos arrays pero en esta ocasión de String 
// y los compare para ver si tienen los mismos elementos en la misma posición

public class Ejercicio4 {
	
	String [] arrayStringUno = {"Uno", "Dos", "Tres"};
	String [] arrayStringDos = {"Uno", "Dos", "Tres"};
	
	public void comparaArrayString() {
		if(arrayStringUno.length != arrayStringDos.length) {
			System.out.println("Los arrays " + Arrays.toString(arrayStringUno)+ " y "+ Arrays.toString(arrayStringDos)+ " son diferentes");
		}else {
			for(int i = 0; i<arrayStringUno.length; i++) {
				if(!arrayStringUno[i].equals(arrayStringDos[i])) {
					System.out.println("Los arrays " + Arrays.toString(arrayStringUno)+ " y "+ Arrays.toString(arrayStringDos)+ " son diferentes");
					return;
				}
			}
			System.out.println("Los arrays " + Arrays.toString(arrayStringUno)+ " y "+ Arrays.toString(arrayStringDos)+ " son iguales");
		}
	}

	public static void main(String [] args) {
		Ejercicio4 e4 = new Ejercicio4();
		e4.comparaArrayString();
	}
}
