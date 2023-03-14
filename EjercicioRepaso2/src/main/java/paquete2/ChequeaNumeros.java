package paquete2;

import exceptions.Menor100Exception;
import exceptions.Menor25Exception;
import exceptions.Menor50Exception;
import exceptions.Menor75Exception;
import paquete1.Clase1;


public class ChequeaNumeros {
	
	public static final int NUMERO_DE_ALEATORIOS = 100;
	public int [] numeros_aleatorios = new int[NUMERO_DE_ALEATORIOS];
	
	public ChequeaNumeros() {
		for (int i = 0; i<NUMERO_DE_ALEATORIOS;i++) {
			numeros_aleatorios[i] = Clase1.generaNumero();
			System.out.println(numeros_aleatorios[i]);
		}
	}
	
	public void chequearNumeros() {
		for (int i = 0; i < numeros_aleatorios.length; i++) {
			try {
				Clase1.chequeaExcepcionNumero(numeros_aleatorios[i]);
			} catch (Menor25Exception e) {
				System.out.println(e.getMessage());
			} catch (Menor50Exception e) {
				System.out.println(e.getMessage());
			} catch (Menor75Exception e) {
				System.out.println(e.getMessage());
			} catch (Menor100Exception e) {
				System.out.println(e.getMessage());
			}
		}
	
	
	}
	
	public static void main (String[]args) {
		ChequeaNumeros c1 = new ChequeaNumeros();
		
		c1.chequearNumeros();

	}


}
