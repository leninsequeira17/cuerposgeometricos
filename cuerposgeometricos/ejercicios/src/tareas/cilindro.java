package tareas;

public class cilindro {

	public static void main(String[] args) {
		double h,r,Abase,Atotal,Alateral,volumen;
		
		h=8.22;
		r=5.44;
		Alateral=2*Math.PI*r*h;
		Abase=Math.PI*(r*r);
		Atotal=Alateral+2*(Abase);
		volumen=Abase*h;
		
		System.out.println("datos del cilindro:");
        System.out.println("Area de la base:"+Abase);
        System.out.println("radio:"+r);
        System.out.println("altura:"+h);
        System.out.println("Area lateral:"+Alateral);
        System.out.println("Area total:"+Atotal);
        System.out.println("volumen:"+volumen);
		

	}

}
