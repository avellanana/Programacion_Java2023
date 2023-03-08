package clase;

public class Finanzas {
	
	//atributos
	double tipoCambio;
	
	//constructores
	Finanzas(){
		tipoCambio = 1.36;
	}
	
	Finanzas(double nuevoCambio){
		tipoCambio=nuevoCambio;
	}
	
	public void modificaTipoCambio(double nuevoCambio) {
		tipoCambio=nuevoCambio;
	}
	
	//metodos
	double dolaresToEuros(double dolares){
		return dolares/tipoCambio;
	}
	
	double eurosToDolares(double euros){
		return euros*tipoCambio;
	}
	
	public static void main (String []args) {
		Finanzas f1=new Finanzas();
		System.out.println(f1.dolaresToEuros(100));
		System.out.println(f1.eurosToDolares(100));
		
		Finanzas f2=new Finanzas(1.5);
		f2.modificaTipoCambio(1.00);
		System.out.println(f2.dolaresToEuros(100));
		System.out.println(f2.eurosToDolares(100));
	}

}
