package tema4Robot;

/*Crear la clase Robot, que contendrá los atributos name, model, y clase, todos de tipo int, tendremos ademas el atributo de clase 
 * numeroDeRobots, que servirá para contar los robots que se van creando.
Crear set y get para los atributos
implementar los metodos heredados de object, toString, clone y equals.
crear una clase de tests unitarios para crear distintas instancias de robots y comparar con los distintos metodos de 
comprobación estudiados.
Comprobar además que el atributo de clase se incremente de forma acorde a la creación de los robots*/

public class Robot implements Cloneable {
	private int name;
	private int model;
	private int clase;
	private static int numeroDeRobots = 0;
	
	//constructor
	public Robot(int name, int model, int clase) {
		this.name = name;
		this.model = model;
		this.clase = clase;
		numeroDeRobots++;
	}
	
	static {
		System.out.println("numero de robots: "+numeroDeRobots);
		numeroDeRobots=5;
		System.out.println("numero de robots: "+numeroDeRobots);
	}
	
	//set y get
	public int getName() {
		return name;
	}
	public void setName(int name) {
		this.name = name;
	}
	public int getModel() {
		return model;
	}
	public void setModel(int model) {
		this.model = model;
	}
	public int getClase() {
		return clase;
	}
	public void setClase(int clase) {
		this.clase = clase;
	}
	
	//toString
	@Override
	public String toString() {
		return "Robot [name=" + name + ", model=" + model + ", clase=" + clase + "]";
	}

	//equals
	@Override
	public boolean equals(Object obj) {
		if(obj==null)
			return false;
		else if(this==obj){
			return true;
		}
		else if( !(obj instanceof Robot)){
			return false;
		}
		else {
			Robot temp=(Robot) obj;
			return this.getClase()==temp.getClase() && this.getModel()==temp.getModel() && this.getName()==temp.getName();
		}
	}
	
	//clone
	protected Object clone() throws CloneNotSupportedException {
		
		return new Robot(this.name, this.model, this.clase);
	}

	
	
	
	
	

}
