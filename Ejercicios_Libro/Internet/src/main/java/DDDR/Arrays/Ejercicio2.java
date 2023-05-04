package DDDR.Arrays;

import java.util.Scanner;

public class Ejercicio2 {
	
	//2) Crea un array de números donde le indicamos por teclado el tamaño del array, 
	//rellenaremos el array con números aleatorios entre 0 y 9, al final muestra por pantalla 
	//el valor de cada posición y la suma de todos los valores. Haz un método para rellenar el array 
	//(que tenga como parámetros los números entre los que tenga que generar), para mostrar el contenido 
	//y la suma del array y un método privado para generar número aleatorio (lo puedes usar para otros ejercicios).

	public static void main (String [] args) {
		
		//indicamos el tamaño
		Scanner sc = new Scanner (System.in);
		System.out.println("Escribe el tamaño del array: ");
		int tamanioArray[] = new int[sc.nextInt()];
		
		rellenaArray(tamanioArray,0,9);
		muestraArray(tamanioArray);
		
	}
	
	private static void rellenaArray(int lista[], int a, int b) {
		for(int i=0; i<lista.length; i++) {
			lista[i]=(int)(Math.random()*(b+1));
		}
		
	}
	
	public static void muestraArray(int lista[]) {
		int sumaArray = 0;
		for(int i=0; i<lista.length; i++) {
			System.out.println("En el indice "+ i + " tenemos el valor " + lista[i]);
			sumaArray += lista[i];
		}
			System.out.println("La suma de array es: " + sumaArray);
		}
	
	
}
