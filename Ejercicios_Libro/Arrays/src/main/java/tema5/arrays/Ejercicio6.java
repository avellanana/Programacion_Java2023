package tema5.arrays;
/*Ejercicio 6: Crear una matriz (array de dos dimensiones de 4x4 elementos aleatorios. 
 * Crear un metodo para leer la matriz por filas,  otro metodo para la lectura por columnas, 
 * otros dos que hagan lo mismo pero desde el final hacia delante y otro metodo que saque la diagonal de la matriz.*/

import java.util.Arrays;
import java.util.Random;

public class Ejercicio6 {
	
	static int[][] matriz = new int [4][4];
	
	 public static int[][] generarMatriz() {
	        Random rand = new Random();

	        for (int i = 0; i < matriz.length; i++) {
	            for (int j = 0; j < matriz.length; j++) {
	                matriz[i][j] = rand.nextInt(9)+1;
	            }
	        }
	        return matriz;
	    }
	 
	 public static void leerPorFilas(int[][] matriz) {
	        System.out.println("Lectura por filas:");

	        for (int i = 0; i < matriz.length; i++) {
	            System.out.println(Arrays.toString(matriz[i]));
	        }
	    }
	 
	 
	 public static void leerPorColumnas(int[][] matriz) {
	        System.out.println("Lectura por columnas:");

	        for (int j = 0; j < matriz[0].length; j++) {
	            int[] columna = new int[matriz.length];

	            for (int i = 0; i < matriz.length; i++) {
	                columna[i] = matriz[i][j];
	            }

	            System.out.println(Arrays.toString(columna));
	        }
	    }
	 
	 public static void leerFilasDesdeFinal(int[][] matriz) {
	        System.out.println("Lectura por filas al revés:");

	        for (int i = matriz.length - 1; i >= 0; i--) {
	            System.out.println(Arrays.toString(matriz[i]));
	        }
	    }
	 
	 public static void leerColumnasDesdeFinal(int[][] matriz) {
	        System.out.println("Lectura por columnas al reves:");

	        for (int j = matriz[0].length - 1; j >= 0; j--) {
	            int[] columna = new int[matriz.length];

	            for (int i = matriz.length - 1; i >= 0; i--) {
	                columna[matriz.length - 1 - i] = matriz[i][j];
	            }

	            System.out.println(Arrays.toString(columna));
	        }
	    }
	 
	 
	 public static void leerDiagonal(int[][] matriz) {
	        System.out.println("Diagonal:");

	        for (int i = 0; i < matriz.length; i++) {
	            System.out.print(matriz[i][i] + " ");
	        }

	        System.out.println();
	    }
	
	 

	public static void main(String[] args) {
		Ejercicio6 e6 = new Ejercicio6();
	int[][] matriz = generarMatriz();
     leerPorFilas(e6.matriz);
     leerPorColumnas(e6.matriz);
     leerFilasDesdeFinal(e6.matriz);
     leerColumnasDesdeFinal(e6.matriz);
     leerDiagonal(e6.matriz);
     
	}

}
