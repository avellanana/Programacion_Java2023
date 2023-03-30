package conceptosBasicos;

public class Calculadora {
	
	private int base;
	private int altura;
	
	public static int area(int base, int altura) {
		int area = base*altura;
		return area;
	}
	
	public static void main(String[]args) {
		System.out.println(area(5,2));
	}

}
