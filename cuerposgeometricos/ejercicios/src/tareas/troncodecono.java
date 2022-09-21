package tareas;

public class troncodecono {

	public static void main(String[] args) {
		double g,R,r,h,Abase,abase,Alateral,Atotal,Volumen;
		
		R=2;
		r=2;
		h=4;
		g = ((h*h)+(r*r));
		double gen = Math.sqrt(g); 
		Alateral=Math.PI*gen*(R+r);
		Abase=Math.PI*Math.pow(R, 2);
		abase=Math.PI*Math.pow(r, 2);
		Atotal=Alateral+Abase+abase;
		Volumen=(Math.PI*h*(Math.pow(R, 2)+Math.pow(r, 2)+R*r)/3);
		
		System.out.println("datos del tronco del cono:");
        System.out.println("generatriz:"+gen);
        System.out.println("Area lateral:"+Alateral);
        System.out.println("Area total:"+Atotal);
        System.out.println("volumen:"+Volumen);

	}

}
