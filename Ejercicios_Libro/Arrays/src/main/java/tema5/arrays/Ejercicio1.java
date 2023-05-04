package tema5.arrays;

import java.util.Scanner;

//Ejercicio 1: Crea un array de 10 posiciones de números con valores pedidos por teclado. Muestra por consola el indice 
//y el valor al que corresponde. Haz dos métodos, uno para rellenar valores y otro para mostrar.

public class Ejercicio1 {
	//variables
	static int [] array = new int[10];
	
	public int pideNumeros() {
			System.out.println("Introduce un numero: ");
			Scanner sc = new Scanner(System.in);
			return sc.nextInt();
	}
	
	public void setNumeros() {
		for(int i = 0; i<array.length;i++) {
			array[i] = pideNumeros();
		}
	}
	
	public void getNumeros() {
		for(int i = 0; i<array.length;i++) {
			System.out.println("El indice "+i+" tiene el valor de "+ array[i]);
		}
	}
		
	public static void main (String [] args) {
		Ejercicio1 e1 = new Ejercicio1();
		e1.setNumeros();
		e1.getNumeros();
		
	}

}
