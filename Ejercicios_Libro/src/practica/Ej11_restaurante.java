/*Ejercicio 11
 El restaurante mexicano de Israel cuya especialidad son las papas con chocos
 nos pide diseñar un método con el que se pueda saber cuántos clientes pueden
 atender con la materia prima que tienen en el almacén. El método recibe la cantidad
 de papas y chocos en kilos y devuelve el número de clientes que puede atender el
 restaurante teniendo en cuenta que por cada tres personas, Israel utiliza un kilo
 de papas y medio de chocos
 
 
 Ejercicio 12
 Modifica el programa anterior creando una clase que permita almacenar los kilos de
 papas y chocos del restaurante. Implementa los siguientes métodos:
 
 public void addChocos(int x). Añade x kilos de chocos a los ya existentes.
 public void addPapas(int x). Añade x kilos de papas a los ya existentes.
 public int getComensales(). Devuelve el número de clientes que puede atender el restaurante
 (este es el método anterior).
 public void showChocos(). Muestra por pantalla los kilos de chocos que hay en el 
 almacén.
 public void showPapas(). Añade Muestra por pantalla los kilos de papas que hay en el almacén. 
 */

package practica;

public class Ej11_restaurante {
	
	float papas;
	float chocos;
		
	static int CalculaComensales(float papas, float chocos) {	
			
		//cuantos platos de papas con choco puedo hacer con las papas que tengo
		float papasParaPlato = papas*3;
		float chocosParaPlato = chocos*6;
		
		float cantidadMenor = papasParaPlato;
		if(chocosParaPlato<chocosParaPlato) 
			cantidadMenor = chocosParaPlato;
		if(cantidadMenor >1)
			return (int)cantidadMenor;
		return 0;
		}
		
public static void main (String []args) {
			System.out.println(CalculaComensales((float)7.5, (float)3.5));
		}	
		

}
