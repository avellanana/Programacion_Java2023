package DDDR.Arrays;

import java.util.Scanner;

public class Ejercicio1 {
	//  Crea un array de 10 posiciones de números con valores pedidos por teclado. 
	//Muestra por consola el indice y el valor al que 
	//corresponde. Haz dos métodos, uno para rellenar valores y otro para mostrar.
	
	private int num[] = new int[10]; //tipo - nombreArray = new tipoDato[tamaño]
	
	public static void rellenaValores(int lista[]) {
	for (int i=0; i<=lista.length-1; i++) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe un numero: ");
		String numeros = sc.nextLine();
		lista[i] = Integer.parseInt(numeros);
		
		}
	}
	
	public static void muestraValores (int lista[]) {
		for (int i=0; i<=lista.length-1; i++) {
			System.out.println("El indice: "+i+" tiene el valor "+lista[i]);
		}
		
	}
	public static void main (String [] args) {
		int[] num = new int[10];
		rellenaValores(num);
		muestraValores(num);
	}

}
