package introduccion;

public class Booleanos {
	
	public static void main (String [] args) {
		int m=2, n=5;
		boolean res;
		boolean res2;
		res = m > n && m >= n;//res=false
		res2 =!(m<n || m!=n);//res=false
		System.out.println(res);
		System.out.println(res2);
	}

}
