
//importar escáner

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		
		//inicializar escáner
		Scanner sc=new Scanner(System.in);
		
		//inicializar variable edad para uso posterior
		int edad=0;

		//pedir al usuario los datos
		System.out.println("Introduce tu nombre: ");
		String nombre=sc.nextLine();
		System.out.println("\nIntroduce tus apellidos: ");
		String apellidos=sc.nextLine();
		
		//pedir la edad, comprobando que esté entre 14 y 70.
		//en caso contrario, vuelve a pedir la edad.
		do {
	
		System.out.println("\nIntroduce tu edad: ");
		edad=sc.nextInt();
		if(edad<14||edad>70) System.out.println("\nEdad no válida. Introduce otro valor.");
		
		}while(edad<14||edad>70);
		
		System.out.println("Distancia antes del entrenamiento (km): ");
		double distanciaAntes=sc.nextDouble();
		
		//inicializar variables que vamos a usar
		
		int distanciaAcum=0;
		int distancia=0;
		int participantes=0;
		String ciudad="";
		int distanciaMax=0;
		int distanciaMin=0;
		String ciudadMax="";
		String ciudadMin="";
		int participantesAcum=0;
		int numeroRutas=0;
		
		//pedir 5 caminatas, guardar sus datos y utilizarlos para las siguientes operaciones
		
		for(int i=0;i<5;i++) {
			
			System.out.println("\n---RUTA "+(i+1)+"---");
			System.out.println("Distancia: "); distancia=sc.nextInt();
			System.out.println("Número de participantes: "); participantes=sc.nextInt();
			sc.nextLine();
			System.out.println("Ciudad: "); ciudad=sc.nextLine();
			
			if (distancia>distanciaMax) {
				distanciaMax=distancia; ciudadMax=ciudad;}
			
			//la primera vez que se pide una ruta, distanciaMin será igualada a distancia
			//datos para evitar errores
			if (i==0) distanciaMin=distancia;
			
			//comparamos y machacamos las distancias mínimas, máximas y sus respectivas
			//ciudades
			if (distancia<distanciaMin) {
				distanciaMin=distancia; ciudadMin=ciudad;}
				
				distanciaAcum+=distancia;
				participantesAcum+=participantes;
				numeroRutas++;
			
			
		}
		
		//distancia media y participantes media
		
	int distanciaMedia=distanciaAcum/numeroRutas;
	int participantesMedia=(participantesAcum)/numeroRutas;
	
	//mostrar información por pantalla
	
	System.out.println("\n\n\n\n\n\n\n\n\n\nNombre: "+nombre+" "+apellidos);
	System.out.println("Edad: "+edad);
	System.out.println("Número de rutas realizadas: "+numeroRutas);
	System.out.println("Número de participantes de media: "+participantesMedia);
	System.out.println("Distancia media (5 últimas rutas): "+distanciaMedia);
	System.out.println("Distancia más larga de las últimas 5 rutas: "+distanciaMax);
	System.out.println("Distancia más corta de las 5 últimas rutas: "+distanciaMin);
	System.out.println("Ciudad de la ruta más larga: "+ciudadMax);
	System.out.println("Ciudad de la ruta más corta de las últimas 5 rutas: "+ciudadMin);
	
	//si la distancia media es mayor que antes del entrenamiento, mostrar un mensaje de enhorabuena
	
	if(distanciaMedia>distanciaAntes) {
		System.out.println("\nEnhorabuena, inicialmente recorrías "+distanciaAntes+" km y ahora "+distanciaMedia+" km."
				+ "Sigue así.");
	}
	
	

	
		
		
		

	}

}
