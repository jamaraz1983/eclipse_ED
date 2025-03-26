

//importar escáner
import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		
		//inicializar escáner
		Scanner sc=new Scanner(System.in);
	
		//inicializar variables para su posterior uso
		int num=1;
		int contador=0;
		int contadorPositivos=0;
		int contadorNegativos=0;
		int sumaTotal=0;
		int sumaPositivos=0;
		int sumaNegativos=0;
		int positivoMax=0;
		int positivoMin=0;
		
		//bucle while. seguir pidiendo números (repitiendo el bucle) hasta que el usuario
		//introduzca un 0
		
		while(num!=0) {
			System.out.println("Introduce un valor: ");
			num=sc.nextInt();
			//sumar 1 número al contador de números introducidos, al de los positivos si el número es
			//positivo y al de los negativos si el número es negativo. también acumular el valor
			//total de los positivos y de los negativos
			contador++;
			if(num>0) {contadorPositivos++; sumaPositivos+=num;
			}
			
			if(num<0) {contadorNegativos++; sumaNegativos+=num;}
			

			//comprobar si el positivo es mayor que el mayor registrado, y también si el positivo es
			//menor que el menor registrado.
			//para el positivoMin, haremos que si es el primer número introducido, automáticamente
			//este sea declarado el mínimo, ya que hemos inicializado la variable a 0 y no hay valor menor
			//que 0 para un número positivo.
			if(num>positivoMax)positivoMax=num;
			
			if(contador==1)positivoMin=num;
			else
			if(num<positivoMin)positivoMin=num;
			
			
			//acumular la suma total de los números
			sumaTotal+=num;
		}
		
		//sacar la media de positivos
		int mediaPositivos=sumaPositivos/contadorPositivos;
		int mediaNegativos=sumaNegativos/contadorNegativos;
		
		
		//mostrar por pantalla los datos
		
		System.out.println("Números mayores de 0: "+contadorPositivos);
		System.out.println("Números menores de 0: "+contadorNegativos);
		System.out.println("Media de positivos: "+mediaPositivos);
		System.out.println("Media de negativos: "+mediaNegativos);
		System.out.println("El número positivo de mayor valor: "+positivoMax);
		System.out.println("El número positivo de menor valor: "+positivoMin);
		System.out.println("Suma de todos los valores: "+sumaTotal);

	}

}
