package clase;

public class Tema2_Rebajas {
	
	double precio_original;
	double precio_rebajado;
	
	public double descubrePorcentaje(double precio_original, double precio_rebajado) {
		return(precio_original-precio_rebajado)*100/precio_original;
	
	}

}
