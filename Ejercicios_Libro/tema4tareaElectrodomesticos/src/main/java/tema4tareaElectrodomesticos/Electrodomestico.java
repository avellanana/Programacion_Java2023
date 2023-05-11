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
	
	
	

}
