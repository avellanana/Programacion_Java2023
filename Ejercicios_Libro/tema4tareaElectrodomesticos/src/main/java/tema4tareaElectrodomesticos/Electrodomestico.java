package tema4tareaElectrodomesticos;

public class Electrodomestico {
	//atributos
	protected String marca;
	protected String modelo;
	protected int consumoEnWatios;
	
	//constructor parametros
	public Electrodomestico (String marca, String modelo, int consumoEnWatios) {
	this.marca = marca;
	this.modelo = modelo;
	this.consumoEnWatios = consumoEnWatios;
	}
	
	//constructor copia
	public Electrodomestico (Electrodomestico e) {
		this.marca = e.marca;
		this.modelo = e.modelo;
		this.consumoEnWatios = e.consumoEnWatios;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getConsumoEnWatios() {
		return consumoEnWatios;
	}

	public void setConsumoEnWatios(int consumoEnWatios) {
		this.consumoEnWatios = consumoEnWatios;
	}

	@Override
	public String toString() {
		return "Electrodomestico [marca=" + marca + ", modelo=" + modelo + ", consumoEnWatios=" + consumoEnWatios + "]";
	}

	@Override
	public boolean equals(Object obj) {
		Electrodomestico e1 = (Electrodomestico) obj;
		if(this == e1)
			return true;
		else {
			if(this.marca.equals(e1.marca) && this.modelo.equals(e1.modelo) && this.consumoEnWatios == e1.consumoEnWatios)
				return true;
			return false;
		}
	}
	
	public Object clone() throws CloneNotSupportedException {
		return new Electrodomestico(this.marca, this.modelo, this.consumoEnWatios);
	}

}
