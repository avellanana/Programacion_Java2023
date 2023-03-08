package ejercicio1;

import java.util.Scanner;

import proyectoPrueba.ExcepcionBlanco;
import proyectoPrueba.ExcepcionNumero;
import proyectoPrueba.ExcepcionSalida;
import proyectoPrueba.ExcepcionVocal;

public class LeerPorTeclado {
	private String caracteres;
	private Scanner leerTeclado;
	
	public LeerPorTeclado() {
		leerTeclado = new Scanner(System.in);
		caracteres = "";
	}
	
	public String getChar() {
		System.out.println("Introduzca un caracter 'x' para salir: ");
		return leerTeclado.nextLine();	
	}
	
	public void processChar(String caracter) throws ExcepcionVocal, ExcepcionNumero, ExcepcionBlanco, ExcepcionSalida {
		char c = ' ';
		if (caracter.length() > 0) {
			c = caracter.charAt(0);
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				throw new ExcepcionVocal ("El caracter es una vocal");
			}else if (c == '0' || c == '1' || c == '2'||c == '3'|| c == '4'|| c == '5'|| c == '6'|| c == '7'|| c == '8'|| c == '9') {
				throw new ExcepcionNumero ("El caracter es un numero");
			}else if (c == ' ') {
				throw new ExcepcionBlanco ("El caracter esta vacio");
			}else if (c == 'x' || c =='X') {
				throw new ExcepcionSalida ("SALIDA");
			}else {
				System.out.println("El caracter no es reconocido");
		}
		}
	}
	
	public static void main (String[] args) {
		LeerPorTeclado teclado = new LeerPorTeclado();
		
		boolean caracterX = true;
		while (caracterX) {
			String c = teclado.getChar();
			try {
				teclado.processChar(c);
			} catch (ExcepcionVocal e) {
				System.out.println(e.getMessage());
			} catch (ExcepcionNumero e) {
				System.out.println(e.getMessage());
			} catch (ExcepcionBlanco e) {
				System.out.println(e.getMessage());
			} catch (ExcepcionSalida e) {
				System.out.println(e.getMessage());
				caracterX = false;
			}
		} 
	}
}