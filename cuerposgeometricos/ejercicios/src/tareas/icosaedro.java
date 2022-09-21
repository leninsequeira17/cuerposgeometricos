package tareas;

public class icosaedro {

	public static void main(String[] args) {
		float a;
		double A,v;
		
		a=2;
		A=5*Math.pow(a, 2)*Math.sqrt(3);
		v=5*(3+Math.sqrt(5)*Math.pow(a, 3)/12);
		
		System.out.println("Datos del icosaedro:");
		System.out.println("Area:"+String.format("%.2f",A));
		System.out.println("Volumen"+String.format("%.2f",v));
		
		

	}

}
