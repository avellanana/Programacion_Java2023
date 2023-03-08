package clase;

public class Coche {
	private int velocidad;
	Coche(){
		velocidad=0;
	}
	
	int getVelocidad() {
		return velocidad;
	}
	
	void acelera(int mas) {
		velocidad += mas;	
	}
	
	void frena(int menos) {
		velocidad -= menos;		
	}

}
