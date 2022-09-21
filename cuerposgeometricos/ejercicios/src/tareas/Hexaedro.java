package tareas;

public class Hexaedro {

	public static void main(String[] args) {
		double a,A,D,V;
		
		a=2.25;
		A=6*Math.pow(a, 2);
		V=Math.pow(a, 3);
		D=a*Math.sqrt(3);
		
		System.out.println("datos del hexaedro:");
	    System.out.println("area menor:"+a);
	    System.out.println("Area mayor:"+A);
	    System.out.println("Volumen:"+V);
	    System.out.println("D:"+D);
		

	}

}
