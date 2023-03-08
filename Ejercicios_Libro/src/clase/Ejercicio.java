package clase;

public class Ejercicio {
	
	public static void main(String[] args) {
		Temperatura myTemp=new Temperatura();
		
		System.out.println(myTemp.celsiusToFareneit(18.0));
		
		
		TemperaturaMejorada myTempActual=new TemperaturaMejorada();
		myTempActual.darTemperatura(34);
		System.out.println(myTempActual.devolverTemperatura());
		
		
		Tema2_Rebajas miRebaja = new Tema2_Rebajas();
		System.out.println(miRebaja.descubrePorcentaje(10, 5)+"%");
	
}

}

