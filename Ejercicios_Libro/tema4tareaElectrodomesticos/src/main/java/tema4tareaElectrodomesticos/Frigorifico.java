package tema4tareaElectrodomesticos;

public class Frigorifico extends Electrodomestico{
	//atributos
	private int temperatura;
	
	//constructor parámetros
	public Frigorifico(int temperatura, String marca, String modelo, int consumoEnWatios) {
		super(marca, modelo, consumoEnWatios);
		this.temperatura = temperatura;
	}
	
	//constructor copia
	public Frigorifico(Frigorifico f) {
		super(f.marca, f.modelo, f.consumoEnWatios);
		this.temperatura = f.temperatura;
	}
	
	//get y set
	public int getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(int temperatura) {
		this.temperatura = temperatura;
	}

	@Override
	public String toString() {
		return "Frigorifico " + super.toString() + " temperatura " + this.temperatura;
	}

	@Override
	public boolean equals(Object obj) {
		Frigorifico f1 = (Frigorifico) obj;
		if(this == f1)
			return true;
		else {
			if(this.temperatura == f1.temperatura)
				return super.equals(obj);
			return false;
		}
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		Electrodomestico padre = (Electrodomestico) super.clone();
	return new Frigorifico (this.temperatura, padre.marca, padre.modelo, padre.consumoEnWatios); 	
	}

}
