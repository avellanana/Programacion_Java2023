package practica;

public class EjCap1 {
	
public String Ejercicio8() {
		
		String resultado = null;

			int NumeroRandom = (int)(Math.random()*52); //52 letras de la A-Z,a-z.	
			char Letra;
			
			if (NumeroRandom < 26) { //si es menor que 26 va a ser MAYUS 
				Letra = (char)(NumeroRandom + 65); //65 es la A en ASCII 
			} else {//si es mayor que 26 va a ser minus
				Letra = (char)(NumeroRandom -26 +97); //(+71), 97 es la a en ASCII 
			}
			
			if(Letra=='A' || Letra =='E'|| Letra == 'I' || Letra == 'O' || Letra == 'U'|| 
					Letra=='a' || Letra =='e'|| Letra == 'i' || Letra == 'o' || Letra == 'u'){
			resultado = ("La letra '" + Letra + "' es vocal");
				
			}else {
			resultado = ("La letra '" + Letra + "' es consonante");
			}
			return resultado;
		}



/*Realiza un programa con una variable entera t la cual contiene un tiempo en segundos y queremos conocer este tiempo pero expresado en horas, minutos y segundos */

public String Ejercicio11_Tiempo(int t) {
		int horas = t/3600;
		int minutos = (t%3600)/60;
		int segundos = t%60;
		return t + " segundos " + "son " + horas +" horas, " + minutos + " minutos, " + segundos + " segundos.";
	}




/*Realiza un programa que dado un importe en euros nos indique el mínimo número de billetes y la cantidad sobrante que se pueden utilizar para obtener dicha cantidad. Por ejemplo:
 * 232 euros: 
 * 1 billete de 200
 * 1 billete de 20
 * 1 billete de 10
 * Sobran 2 euros.*/
 
public String Ejercicio12_Euros(int euros) {
	int billete_200 = euros/200;
	int billete_100 = (euros%200)/100;
	int billete_50 = ((euros%200)%100)/50;
	int billete_20 = (((euros%200)%100)%50)/20;
	int billete_10 = ((((euros%200)%100)%50)%20)/10;
	int billete_5 = (((((euros%200)%100)%50)%20)%10)/5;
	int monedas = euros%5;
	return euros + " euros son:\n" + billete_200 + " billetes de 200\n" + billete_100 + " billetes de 100\n" + billete_50 + " billetes de 50\n" + billete_20 + " billetes de 20\n" + billete_10 + " billetes de 10\n" + billete_5 + " billetes de 5\n" + monedas + " monedas";
}

}