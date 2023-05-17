package libro.tema7.arrays;

public class EqualsYOperador {
	
	public static void main(String[] args) {
		String cad1 = "EMMA";
		String cad2 = new String("EMMA");
		if (cad1.equals(cad2)) {
			System.out.println("Son iguales");
		}else {
			System.out.println("Son diferentes");
		}
		if (cad1 == cad2){
			System.out.println("Son iguales");
		}else {
			System.out.println("Son diferentes");
		}
	
	
	String st3 = "      Emma      ".trim();
	System.out.println(st3);

	}
}
// new String("alex"), crea un nuevo objeto, por lo que == dará false
//"alex", no crea un nuevo objeto, compara literales, por lo que == dará true
//clases envolventes de los tipos primitivos:
// int - Integer ; float - Float ; double - Double ; long - Long ; boolean - Boolean