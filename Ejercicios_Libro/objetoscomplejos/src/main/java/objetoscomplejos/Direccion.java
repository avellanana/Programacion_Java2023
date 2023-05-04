package objetoscomplejos;

public class Direccion {
	private String calle;
	private int numero;
	private String municipio;
	private Localidad l;
	
	public Direccion(String calle, int numero, Localidad l) {
		this.calle = calle;
		this.numero = numero;
		this.l = l;
	}	
	
	
	@Override
	public String toString() {
		return "Direccion [calle=" + calle + ", numero=" + numero + ", municipio=" + municipio + ", l"+l+ "]";
	}





	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		Localidad l1 = (Localidad) this.l.clone();
		
		Direccion d1 = new Direccion(this.calle, this.numero, l1);
		return d1;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		Direccion d1 = (Direccion) obj;
		
		if(obj == this) {
			return true;
		}else {
			if(this.calle.equals(d1.calle) && this.numero == d1.numero && this.municipio.equals(d1.municipio))
				return true;
			return false;
		}
	}
	
	

	
}
