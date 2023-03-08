package ejercicioPrueba;
import java.util.Random;

public class Persona {
	private String nombre;
	private int edad;
	private int dni;
	private String sexo;
	private double peso;
	private double altura;
	
	private final int idealpeso = -1;
	private final int bajopeso = 0;
	private final int sobrepeso = 1;
	
	//constructor por defecto
	public Persona() {
		nombre = "";
		edad = 0;
		sexo = "H";
		peso = 0.0;
		altura = 0.0;
	}
	
	//constructor nombre, edad y sexo
	public Persona(String nombre, int edad, String sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.dni = generaDNI();
		peso = 0.0;
		altura = 0.0;
	}
	
	//constructor con todos los atributos como parametros
	public Persona (String nombre, int edad, String dni, String sexo, double peso, double altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.dni = generaDNI();
		this.peso = peso;
		this.altura = altura;
		
	}
	
	//calcula peso ideal
	public int calcularIMC() {
		double pesoIdeal = this.peso/(Math.pow(this.altura,2));
		
		if(pesoIdeal<20) {
			return idealpeso;
		}else {
			if(pesoIdeal<26) {
				return bajopeso;
			}else {
				return sobrepeso;
			}
		}
	}
	
	//calcula edad
	public boolean esMayorDeEdad() {
		if(this.edad>=18) {
			return true;
		}else {
			return false;
		}
	}
	
	//comprueba sexo
	private boolean comprobarSexo(String sexo) {
		if (sexo == "H") {
			return true;
		}else {
			return false;
		}
	}
	
	//toda la informacion del objeto
	public String toString() {
		return "Nombre: "+nombre+". Edad: "+edad+". DNI: "+dni+". Sexo: "+sexo+". peso: "+peso+". altura: "+altura;
	}
	
	//genera DNI
	
	private int generaDNI() {
		int numerodni = (int) (Math.random() * 10000000) + 1;
		return numerodni;
	}
	
	//metodo set de cada parametro
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}


public static void main(String[] args) {
	Persona persona1 = new Persona();
	System.out.println(persona1.toString());
	
	Persona persona2 = new Persona("Ana",32,"M");
	System.out.println(persona2.toString());
	
	Persona persona3 = new Persona("Jose", 28, "43255235", "H", 60.0, 1.71);
	System.out.println(persona3.toString());
}

}
