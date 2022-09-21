package tareas;

public class tetraedro {

	public static void main(String[] args) {
	double a,A,V,H;
	
	a=4.55;
	A=Math.pow(a, 2)*Math.sqrt(3);
	V=Math.sqrt(2)/12*Math.pow(a, 3);
	H=a*Math.sqrt(6)/3;
	
	System.out.println("datos del tetraedro:");
    System.out.println("area menor:"+a);
    System.out.println("Area mayor:"+A);
    System.out.println("Volumen:"+V);
    System.out.println("altura:"+H);
	
	
	
	}

}
