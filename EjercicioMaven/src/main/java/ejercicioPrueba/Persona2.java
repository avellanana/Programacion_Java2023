package ejercicioPrueba;

public class Persona2 {
	private String nombre;
	private int edad;
	private int dni;
	public int altura;
	public int peso;
	private String sexo;
	private static int dniCalculado;

	private final char[] letras = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q','V', 'H', 'L', 'C', 'K', 'E' };
	public static final String SEXO_HOMBRE = "H";
	public static final String SEXO_MUJER = "M";

	public Persona2() {
	}

	public Persona2(String nombre, int edad) {
	this.nombre = nombre;
	this.edad = edad;
	}

	public Persona2(String nombre, int edad, int dni) {
	this.nombre = nombre;
	this.edad = edad;
	this.dni = dni;
	}

	public Persona2(String nombre, int edad, int dni, String sexo) {
	this.nombre = nombre;
	this.edad = edad;
	this.dni = dni;
	this.sexo = sexo;
	}

	public int calculaIMC() throws IMCException {

	//devolver un arithmetic exception si
	//peso > 5
	//altura < 40
		int imc = 0;
		if(peso<5 || altura<40) {
			throw new IMCException("Peso o altura incorrectos");
		}else {
			imc = peso/(altura*altura);
			return imc;
		}
	}

	public boolean esMayorDeEdad() throws EdadException {
		if (edad >18) {
			return edad >= 18;
		} else {
			throw new EdadException("La edad debe ser mayor a 0");
		}
	}

	public String toString() {
	return "Persona: " + nombre + " - edad: " + edad + " - dni: " + dni + " - sexo: " + sexo;
	}

	public String generaDNI() {
	dni = generaNumeroAleatorio(1000000, 100000000);
	return "" + dni + obtenerLetra();
	}

	public static int generaNumeroAleatorio(int minimo, int maximo) {
	int num = (int) Math.floor(Math.random() * (minimo - (maximo + 1)) + (maximo + 1));
	return num;
	}

	public char obtenerLetra() {
	int resto;
	resto = dni % 23;
	System.out.println("DNI COMPLETO: " + dni + letras[resto]);
	return letras[resto];
	}

	public String generaDNIExt(String dniExt) throws DNIException {
	int midni=0;
	int resto = 0;
	try {
	midni = Integer.parseInt(dniExt);
	resto = midni % 23;
	System.out.println("DNI COMPLETO: " + midni + letras[resto]);

	if(dniExt.length()!=8) {
	throw new DNIException("la longitud no es correcta");
	}

	} catch (NumberFormatException e) {
	throw new DNIException("Lo que se metido no son numeros");
	}

	return "" + midni + letras[resto];
	}

	}