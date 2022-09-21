package tareas;

public class Dodecaedro {

	public static void main(String[] args) {
		float arista;
		double A,v;
		
		arista=4;
		A=3*Math.pow(arista, 2)*Math.sqrt(25+10*Math.sqrt(5));
		v=1*(15+7*Math.sqrt(5)*Math.pow(arista, 3)/4);
		
		System.out.println("Datos del dodecaedro");
		System.out.println("Area:"+A);
		System.out.println("Volumen:"+v);
		
		

	}

}
