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

}
