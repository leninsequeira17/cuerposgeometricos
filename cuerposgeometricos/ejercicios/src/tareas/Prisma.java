package tareas;

public class Prisma {

	public static void main(String[] args) {
		float areaLateral;
		float Pbase,h,n,longitudLados;
		double anguloCentral,ap,Abase,areaTotal,volumen;
	
		
		
		
		h=20;
		n=5;
		longitudLados=8.5f;
		Pbase= n*longitudLados;
		areaLateral= Pbase * h;
		anguloCentral= (360/n)*(Math.PI/180);
		double denominador = Math.tan(anguloCentral/2);
		ap= longitudLados/(2*denominador);
		Abase=(Pbase * ap )/2;
		areaTotal= areaLateral+ 2*Abase;
		volumen =Abase * h ;
		
		System.out.println("Datos del prisma:");
		System.out.println("Cantidad de lados:"+n);
		System.out.println("Longitud de los lados:"+longitudLados);
		System.out.println("Altura:"+h);
		System.out.println("Perimetro de la base:"+Pbase);
		System.out.println("Area de la base:"+Abase);
		System.out.println("Apotema:"+ap);
		System.out.println("Area lateral:"+areaLateral);
		System.out.println("Area total:"+areaTotal);
		System.out.println("Volumen:"+volumen);
		System.out.println("denominador:"+denominador);
		
		
		

	}




}
