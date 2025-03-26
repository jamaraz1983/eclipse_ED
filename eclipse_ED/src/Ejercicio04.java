

//importar escáner
import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		
		//inicializar escáner
		Scanner sc=new Scanner(System.in);
		
		//inicializar variables
		int eleccion=0;
		int num1=0;
		int num2=0;
		int num3=0;
		int num4=0;
		int num5=0;
		int suma=0;
		int multiplicacion=0;
		int media=0;
		int mayor=0;
		int minimo=0;
		
		//Bucle interminable para que la calculadora siempre pueda ser operada
		//tras seguir haciendo operaciones. también inicializamos su respectiva variable
		
		boolean bucle=true;
		do {
			
		
		//bucle do while. el sistema mostrará las opciones de la
		//calculadora mientras no se introduzca un número de los
		//posibles listados en el menú. cuando se elija uno, se procederá
		//a la operación pertinente.
	
		
		do {
			System.out.println("1. Sumar");
			System.out.println("2. Multiplicar");
			System.out.println("3. Calcular Media");
			System.out.println("4. Mostrar máximo");
			System.out.println("5. Mostrar mínimo.");
			eleccion=sc.nextInt();
			if(eleccion<1||eleccion>5)System.out.println("\n\n\n\n\n\n\n\n\n\nValor erróneo. Por favor introduce un valor"
					+ "entre 1 y 5.");
		}while(eleccion<1||eleccion>5);
		
		//pedir 5 números para operar
		System.out.println("Introduzca el número 1: ");
		num1=sc.nextInt();
		System.out.println("Introduzca el número 2: ");
		num2=sc.nextInt();
		System.out.println("Introduzca el número 3: ");
		num3=sc.nextInt();
		System.out.println("Introduzca el número 4: ");
		num4=sc.nextInt();
		System.out.println("Introduzca el número 5: ");
		num5=sc.nextInt();
		
		//switch case para operar según la operación elegida.
		//operadores aritméticos básicos para cada caso, y el programa
		//te ofrece realizar una nueva operación
		
		switch(eleccion) {
		case 1:
			//suma de todos los números introducidos
			suma=num1+num2+num3+num4+num5;
			System.out.println("\nLa suma de los números introducidos es "+suma+".\n"
					+ "Elija una nueva opción:");
			break;
		case 2:
			//multiplicación de todos los números introducidos
			multiplicacion=num1*num2*num3*num4*num5;
			System.out.println("\nEl producto de los números introducidos es "+multiplicacion+".\n"
					+ "Elija una nueva opción:");
			break;
		case 3:
			//media de todos los números introducidos
			media=(num1+num2+num3+num4+num5)/5;
			System.out.println("\nLa media de los números introducidos es "+media+".\n"
					+ "Elija una nueva opción:");
			break;
		case 4:
			//mayor de los números introducidos.
			//empezamos determinando que num1 es el mayor por descarte,
			//y luego vamos comprobando si alguno de los posteriores
			//es mayor y, si lo es, se machaca la variable mayor.
			mayor=num1;
			if(mayor<num2) mayor=num2;
			if(mayor<num3) mayor=num3;
			if(mayor<num4) mayor=num4;
			if(mayor<num5) mayor=num5;
			System.out.println("\nEl número mayor de los introducidos es el "+mayor+".\n"
					+ "Elija una nueva opción:");
			break;
		case 5:
			//mismo proceso que el case 4 pero a la inversa, buscando el mínimo.
			//establecemos el num1 como el mínimo por descarte.
			minimo=num1;
			if(minimo>num2) minimo=num2;
			if(minimo>num3) minimo=num3;
			if(minimo>num4) minimo=num4;
			if(minimo>num5) minimo=num5;
			System.out.println("\nEl número menor de todos los introducidos es el "+minimo+".\n"
					+ "Elija una nueva opción:");
			break;
		}
		

	}while(bucle==true);
	
	}

}
