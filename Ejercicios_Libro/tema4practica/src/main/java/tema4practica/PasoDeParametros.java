package tema4practica;

public class PasoDeParametros {
	
	public static void main(String[] args) {
		int a=5;
		System.out.println("a: "+a);
		cambiaValor(a);
		System.out.println("a: "+a);
		
		Test t = new Test();
		System.out.println("t.a: "+t.a);
		
		cambiaReferencia(t);
		System.out.println("t.a: "+t.a);
	}
	
	
	static void cambiaValor(int a) {
		a = 9;
	}
	
	static void cambiaReferencia(Test t) {
		t.a = 9;
	}

}

class Test{
	int a=5;
}
