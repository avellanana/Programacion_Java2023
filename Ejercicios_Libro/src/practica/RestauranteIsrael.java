package practica;

import clase.RestauranteException;

public class RestauranteIsrael {
	float papas;
	float chocos;
	
	static int calculoInterno(float papas, float chocos) throws RestauranteException {
		float papasParaPlato = papas*3;
		float chocosParaPlato = chocos*6;
		
		float cantidadMenor = papasParaPlato;
		if(chocosParaPlato<papasParaPlato) 
			cantidadMenor = chocosParaPlato;
		if(cantidadMenor >1)
			return (int) cantidadMenor;
		throw new RestauranteException("no hay cpmida");
	}
	
	static int CalculaComensales(float papas, float chocos) {
		int test=0;
		try {
			test = calculoInterno(papas, chocos);
		} catch (RestauranteException e) {
			System.out.println(e.msj + " - "+e.getCause());
			e.printStackTrace();
		}
		
		return test;
		
	}
	
	public static void main(String[] args) {
		System.out.println(CalculaComensales(1, (float) 0.1));
	}


}
