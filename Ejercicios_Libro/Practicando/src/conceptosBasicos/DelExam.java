package conceptosBasicos;

import java.util.Random;

import es.corenetworks.dam.examenTema3.utilidades.Constantes;
import es.corenetworks.dam.examenTema3.utilidades.Utilidades;

public class DelExam {
	
/*public static int getNumeroDigitos() {
		
		Random random = new Random();
		int numeroRandom = random.nextInt(9000)+1000;
		return numeroRandom;
		
	}
	*/
	//int numeroAleatorio = DelExam.getNumeroDigitos();
	//System.out.println("El número aleatorio generado es: " + numeroAleatorio);
public static void main(String[] args) {
	int [] numbers = {1,2,3,6,9,10,11,16,25,28,33,75,108};
	int count = bucleWhile(numbers);
    System.out.println("Número de elementos pares encontrados: " + count);
}
	
public static int bucleWhile(int[] numbers) {
    int count = 0;
    int i = 0;
    while (i < numbers.length) {
        if (numbers[i] % 2 == 0) {
            System.out.println(numbers[i]);
            count++;
        }
        i++;
    }
    return count;
}
}
