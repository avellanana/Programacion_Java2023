package clase;

public class Consumo {
	
	private double kms;
	private double litros;
	private double vmed;
	private double pgas;
	
	public Consumo(double kms, double litros, double vmed, double pgas){
		this.kms=kms;
		this.litros=litros;
		this.vmed=vmed;
		this.pgas=pgas;
	}
	
	public double getTiempo() {
		return kms/vmed;
	}
	
	double consumoMedio() {
		return (litros*100)/kms;
	}
	
	double consumoEuros() {
		return consumoMedio()*pgas;
	}
	
	
	public void setKms(double kms) {
		this.kms = kms;
	}
	
	public void setLitros(double litros) {
		this.litros = litros;
	}
	
	public void setVmed(double vmed) {
		this.vmed = vmed;
	}
	
	public void setPgas(double pgas) {
		this.pgas = pgas;
	}
	
	public static void main (String[]args) {
		Consumo c1 = new Consumo(20.5, 23.4, 65.2, 12.8);
		System.out.println(c1.getTiempo());
		System.out.println(c1.consumoMedio());
		System.out.println(c1.consumoEuros());
	}
	
}
