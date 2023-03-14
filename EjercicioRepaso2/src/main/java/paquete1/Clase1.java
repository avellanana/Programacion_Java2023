/*Crear un paquete paquete1 con contenga una clase Clase1 con un metodo estatico que devuelve 
 * un numero entero aleatorio entre 1 y 100

crear un paquete paquete2 con contenga una clase ChequeaNumeros que tenga un array de NUMERO_DE_ALEATORIOS 
numeros aleatorios, donde NUMERO_DE_ALEATORIOS es una constante de valor 100, estos numeros aleatorios 
se crearan en el constructor de esta clase utilizando el metodo estatico de la clase Clase1.

Crear el paquete exceptions que contendrá las excepciones:

Menor25Exception con el mensaje "el numero esta entre 1 y 25"
Menor50Exception con el mensaje "el numero esta entre 25 y 50"
Menor75Exception con el mensaje "el numero esta entre 50 y 75"
Menor100Exception con el mensaje "el numero esta entre 75 y 100"

En la clase Clase1 crear un metodo static chequeaExcepcionNumero que dado un numero 
lance la excepcion que le corresponde, si ocurre que el numero es 25, 75 o 100 se imprimirá el mensaje "numero cuartil"

En la clase ChequeaNumeros crear un metodo chequearNumeros que realize una iteración 
sobre el array de numeros comprobando la excepción que le corresponde utilizando el metodo chequeaExcepcionNumero 
de la clase Clase1

*/

package paquete1;

import exceptions.Menor100Exception;
import exceptions.Menor25Exception;
import exceptions.Menor50Exception;
import exceptions.Menor75Exception;

public class Clase1 {
	
	public static int generaNumero() {
	    int numeroRandom = (int)(Math.random()*100)+1;
	    return numeroRandom;
	  }

		
	public static void chequeaExcepcionNumero(int numero) throws Menor25Exception, Menor50Exception, Menor75Exception, Menor100Exception {
		if(numero < 25) {
			throw new Menor25Exception("El numero es menor de 25");
		} else if (numero < 50) {
			throw new Menor50Exception("El numero está entre 25 y 50");
		} else if (numero < 75) {
			throw new Menor75Exception("El numero esta entre 50 y 75");
		} else if (numero < 100) {
			throw new Menor100Exception("El numero está entre 75 y 100");
		} else if (numero == 25 || numero == 50 || numero == 100 || numero == 75) {
			System.out.println("Numero cuartil");
		}
		
	}
	
}
