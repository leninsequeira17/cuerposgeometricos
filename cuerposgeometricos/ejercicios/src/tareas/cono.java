package tareas;

public class cono {
	public static void main(String[]args) 
	{
		double g,r,Atotal,Alateral,h,volumen;
		
		r=2;
		h=8;
		g = ((h*h)+(r*r));
		double gen = Math.sqrt(g); 
		Alateral=Math.PI*r*gen;
		Atotal=Math.PI*(gen+r);
        volumen=(Math.PI*(r*r)*h)/3;
        
        System.out.println("datos del cono:");
        System.out.println("generatriz:"+gen);
        System.out.println("radio:"+r);
        System.out.println("altura:"+h);
        System.out.println("Area lateral:"+Alateral);
        System.out.println("Area total:"+Atotal);
        System.out.println("volumen:"+volumen);
	}

}
