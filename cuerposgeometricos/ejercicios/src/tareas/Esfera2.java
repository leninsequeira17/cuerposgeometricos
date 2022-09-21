package tareas;

public class Esfera2 {

	public static void main(String[] args) {
		double h,r,R;
		double areazonaesferica,volumenzonaesferica;
		
		R=2;
		r=2;
		h=4;
		
		areazonaesferica=2*Math.PI*r*h;
		volumenzonaesferica=Math.PI*h*(h*h)+3*(R*R)+3*Math.pow(r, 2)/6;
		
		 System.out.println("datos de la zona esferica:");
	        System.out.println("areazonaesferica:"+areazonaesferica);
	        System.out.println("volumenzonaesferica:"+volumenzonaesferica);

	}

}
