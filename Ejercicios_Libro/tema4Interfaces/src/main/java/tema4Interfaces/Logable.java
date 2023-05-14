package tema4Interfaces;
/*Crear la interfaz Logable que contendrá los metodos:

- leerMensaje: que devuelte el texto de un mensaje
- cambiarMensaje: que cambia el texto del mensaje
- cambiarPrioridadAlta: que cambia la prioridad del mensaje a alta
- cambiarPrioridadBaja: que cambia la prioridad del mensaje a baja
- cambiarPrioridadMedia: que cambia la prioridad del mensaje a media

Crear la clase mensaje que contenga un atributo mensaje tipo texto y un atributo prioridad tipo 
text que podrá tomar los valores "normal", "baja", "alta". 
Crear un constructor con el parametro mensaje que seteará la prioridad a normal. 
Esta clase debe implementar la interfaz logable.

Crear los tests unitarios para crear instancias de la clase y probar los metodos de la interfaz
 */
public interface Logable {
	String leerMensaje();
	void cambiarMensaje(String NuevoMensaje);
	void cambiarPrioridadAlta();
	void cambiarPrioridadBaja();
	void cambiarPrioridadMedia();
}
