package tareas;

public class casqueteesferico {

	public static void main(String[] args) {
		double h,r,R,areacasquete,volumencasquete;
		
		r=2;
		h=4;
		R=2;
		
		areacasquete=2*Math.PI*R*h;
		volumencasquete=Math.PI*Math.pow(h, 2)*(3*R-h)/3;
		
		System.out.println("datos del casquete esferico:");
        System.out.println("Area Casquete:"+areacasquete);
        System.out.println("Volumen casquete:"+volumencasquete);

	}

}
