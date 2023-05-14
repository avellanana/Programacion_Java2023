package tema5_RepasoEnClase_Arrays;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/*crear una constante
crear un array del tamaño de la constante
pedir al usuario que inserte el numero de elementos segun la constante
meter los elementos del array
mostrar el array entero por pantalla*/

public class TestArray {
	//variables
	public static final int CONSTANTE = 5;
	int[] arrayNumeros = new int[CONSTANTE];
	
	//métodos
	public int[] insertaElementos() {
		Scanner sc = new Scanner(System.in);
		for (int i=0; i<arrayNumeros.length;i++) {
			try {
			System.out.println("Introduce un numero");
			arrayNumeros[i] = sc.nextInt();
			}
			catch (Exception e) {
				System.out.println("Error. Ingresa un numero valido");
				sc.nextLine();
				i--; // para volver a pedir el valor
			}
		}
		return arrayNumeros;
	}
	
	public void muestraElementos() {
		for (int i=0; i<arrayNumeros.length;i++) {
		}
		System.out.println(Arrays.toString(arrayNumeros));
	}
	
	public static void main(String []args) {
		TestArray t1 = new TestArray();
		t1.insertaElementos();
		t1.muestraElementos();		
	}
	
}
