public class Circulo {
	/* En este ejercicio se ha utilizado la opción de refactorización llamada "CHANGE METHOD SIGNATURE" que cambia la signatura
	 * del método, en este caso pasó de llamarse calcularArea a llamarse areaCirculo"
	 */
	
    private double radio;

    // constructor, getters y setters para el atributo radio

    public double areaCirculo(double radio) {
        return Math.PI * radio * radio;
    }

    // otros métodos relacionados con los círculos
}
