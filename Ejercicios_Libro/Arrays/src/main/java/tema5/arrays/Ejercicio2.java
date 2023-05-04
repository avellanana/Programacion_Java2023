package tema5.arrays;

import java.util.Random;
import java.util.Scanner;

/*Ejercicio 2: Crea un array de números donde le indicamos por teclado el tamaño del array, 
rellenaremos el array con números aleatorios entre 0 y 9, al final muestra por pantalla el valor de cada posición 
y la suma de todos los valores. Haz un método para rellenar el array (que tenga como parámetros los números entre 
los que tenga que generar), para mostrar el contenido y la suma del array y un método privado para generar número aleatorio 
(lo puedes usar para otros ejercicios).*/

public class Ejercicio2 {
	//variable del array
	int [] arrayAleatorio;
	
	//introducir el tamaño del array
	public void tamanoArray() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe el tamaño del array: ");
		int tamanoArray = sc.nextInt(); 
		arrayAleatorio = new int[tamanoArray];
	}
	
	//rellenar con valores el array
	public int[] rellenaValores(int valorInicial, int valorFinal) {
		for(int i = 0; i<arrayAleatorio.length; i++) {
			arrayAleatorio[i] = generadorNumerosAleatorios(valorInicial, valorFinal);
		}
		return arrayAleatorio;
	}
	
	//mostrar los valores del array y la suma del array
	public void mostrarValores() {
		int sumaArrayAleatorio = 0;
		for (int i = 0; i<arrayAleatorio.length; i++) {
			System.out.println("La posicion "+i+" tiene el valor de: "+ arrayAleatorio[i]);
			sumaArrayAleatorio += arrayAleatorio[i];
		}
		System.out.println(sumaArrayAleatorio);
		
	}
	
	//generar numeros aleatorios
	private int generadorNumerosAleatorios (int valorInicial, int valorFinal) {
		Random rand = new Random();
		int numeroAleatorio = rand.nextInt(valorFinal - valorInicial + 1 + valorInicial);
		return numeroAleatorio;
	}

	
	public static void main(String[] args) {
		Ejercicio2 e2 = new Ejercicio2();
		e2.tamanoArray();
		e2.rellenaValores(0,9);
		e2.mostrarValores();
		
	}
}
