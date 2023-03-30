package ejerciciosInternet;

import java.util.Scanner;

public class Basicos {
	
	/*public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero: ");
		int e6num = sc.nextInt();
		
		
		int division = e6num%2;
		
		if (division == 0){
			System.out.println("Es par");
		}else {
			System.out.println("No es par");
		}
	}*/
	
	/*public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe un numero");
		int e7num = sc.nextInt();
		
		char e7char = (char) e7num;
		System.out.println(e7char);
		
	}*/
	
	/*public static void main (String[] args) {
		final double IVA = 0.21;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe el precio del producto: ");
		double e9precioproducto = sc.nextInt();
		
		double precioFinal = e9precioproducto+(e9precioproducto*IVA);
		System.out.println(precioFinal);
	}*/
	
	/*public static void main(String[] args) {
		
		int e10num = 0;
		
		while(e10num<100) {
			e10num ++;
			System.out.println(e10num);
		}
	}*/
	
	/*public static void main(String []args) {
		
		for(int e11i = 1; e11i<=100; e11i++) {
			System.out.println(e11i);
		}
	}*/
	
	/*public static void main(String []args) {
		
		for(int e12 =1; e12<=100; e12++) {
			if(e12%2 == 0 || e12%3 == 0) {
				System.out.println(e12);
			}
		}
	}*/
	
	
	/*public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe un numero de ventas: ");
		int e13numVentas = sc.nextInt();
		int sumaVentas = 0;
		
		for (int i = 0; i<e13numVentas; i ++) {
			System.out.println("Escribe un precio de venta: ");
			int venta = sc.nextInt();
			sumaVentas = venta + sumaVentas;
		}
		
		System.out.println("La suma de las ventas es: " + sumaVentas);
		
	}*/
	
	/*public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int e15;
		
		do {
			System.out.println("Introduce un numero: ");
			e15 = sc.nextInt();
		}while
			(e15 <0);
		System.out.println(e15);
	}*/
	
	/*public static void main(String[] args) {
		String contraseñae16 = "e1238";
		Scanner sc = new Scanner(System.in);
		boolean acierto = false;
		
		for(int i =1; i<=3 && !acierto; i++) {
			System.out.println("Introduce una contraseña: ");
			String lectorContraseña = sc.nextLine();
				
			if (lectorContraseña.equals(contraseñae16)){
				System.out.println("Enhorabuena");
				acierto = true;
			}
		}
	}*/
	
	/*public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe un día: ");
		String dia = sc.nextLine();
		
		switch (dia) {
		case "lunes":
		case "martes":
		case "miercoles":
		case "jueves":
		case "viernes":
			System.out.println("Es un día laboral");
			break;
		case "sabado":
		case "domingo":
			System.out.println("Es un día festivo");
		default:
			System.out.println("Introduce un dia de la semana: ");
		}
	}*/
	
	public static void main (String[] args) {
		double e18num = Math.random()*100;
		System.out.println(e18num);
	}
	
	
	
	
}
