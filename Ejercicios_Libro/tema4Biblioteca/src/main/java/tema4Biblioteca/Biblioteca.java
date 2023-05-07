
/*Vamos a crear una biblioteca en la que tendremos dos tipos de publicaciones: libros y revistas, 
 * con alguna información comun que será el  código, el título, y el año de publicación. 

Los libros ademas se podran prestar, cuando el libro se da de alta en principio no esta prestado.
las revistas tambien se podran prestar y necesitan ademas un identificador para darse de alta.
Implementar la estructura de clases (Herencia). Crear para todos los atributos los metodos set/get, 
y los metodos toString

Para los prestamos crearemos una interfaz Prestable, esta interfaz declara 
3 metodos: prestar que presta el libro, devolver que devuelve el libro y prestado que nos informa 
de si el libro está o no prestado (true/false).

Hacer que tanto libro como revista implementen la interfaz prestable para poder ser prestados.

Crear los tests unitarios necesarios para crear tanto 5 libros como 5 revistas, 
probando a prestarlos, ver sus estados, devolverlos y volver a chequear sus estados.
*/

package tema4Biblioteca;

public class Biblioteca {
	//variables
	protected String codigo;
	protected String titulo;
	protected int anioPublicacion;
	
	//constructor
	public Biblioteca(String titulo, String codigo, int anioPublicacion) {
		this.titulo = titulo;
		this.codigo = codigo;
		this.anioPublicacion = anioPublicacion;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getTitulo() {
		return titulo;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public int getAnioPublicacion() {
		return anioPublicacion;
	}

	public void setAnioPublicacion(int anioPublicacion) {
		this.anioPublicacion = anioPublicacion;
	}
	
	
	
}
