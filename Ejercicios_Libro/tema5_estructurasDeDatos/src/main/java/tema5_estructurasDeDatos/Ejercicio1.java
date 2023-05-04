package tema5_estructurasDeDatos;

import java.util.Scanner;

public class Ejercicio1 {
	
	//Ejercicio 1: Crea un array de 10 posiciones de números con valores pedidos por teclado. Muestra por consola el indice y 
	//el valor al que corresponde. Haz dos métodos, uno para rellenar valores y otro para mostrar.
	
	static int[] array = new int[10];
	
	private static int pideNumero() {
		System.out.println("Por favor introduzca un numero ");
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}
	
	public void setArray() {
		for (int i = 0; i<array.length; i++) {
			array[i] = pideNumero();
		}
	}
	
	public void muestraArray() {
		for (int i=0; i<array.length; i++) {
			System.out.println("Indice: "+ i + " Valor: " + array[i]);
		}
	}
	
	public static void main (String[] args) {
		Ejercicio1 e1 = new Ejercicio1();
		e1.setArray();	
		
		e1.muestraArray();
	}

}
