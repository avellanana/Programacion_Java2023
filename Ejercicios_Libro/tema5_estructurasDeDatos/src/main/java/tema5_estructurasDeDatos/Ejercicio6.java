package tema5_estructurasDeDatos;

import estructuraDatos.utilidades.Utilidades;

public class Ejercicio6 {
	
	void inicializarMatriz(int[][] matriz) {
		for (int i = 0; i<matriz.length; i++) {
			for (int j=0; i<matriz[i].length; j++) {
				matriz[i][j] = Utilidades.numerosAleatoriosEntre0y9();
			}
		}
		return matriz;
	}
	
	public static void main(String[] args) {
		int[][] matriz = new int[4][4];
		matriz = inicializarMatriz(matriz);
	}

}
