
//importar escáner

import java.util.Scanner;



public class Ejercicio02 {
	

	
	//crear el método

		public static boolean auditoriaPrestamoEmpresa(double SalarioJefe,double SalarioEncargado,boolean proyectosTerminados,boolean CertificacionISO,double presupuestoEmpresa) {
			
			//comprobaciones
			//si proyectos no terminados, no apto
			
			if(proyectosTerminados==false) {
				System.out.println("No ha pasado la auditoría ya que no ha terminado los "
						+ "proyectos acordados.");
				return false;}
			else
				//ahora comprobamos la certificación ISO. False = no apto
			
			if(CertificacionISO==false) {
				System.out.println("No ha pasado la auditoría ya que no está certificado por la ISO.");
				return false;}
			else
				//ahora comprobamos el gasto acumulado en sueldos globales.
				//si supera 20.000 euros, no apto
			if ((SalarioJefe+SalarioEncargado)>20000) {
				System.out.println("No ha pasado la auditoría ya que el gasto en personal es de "+(SalarioJefe+SalarioEncargado)+" y"
						+ "excede el límite mensual de 20.000 euros.");
				return false;}
			else
				//ahora comprobamos el presupuesto de la empresa.
				//si es superior a 100.000 euros, no apto
				if(presupuestoEmpresa>100000) {
					System.out.println("No ha pasado la auditoría ya que el presupuesto"
							+ "asignado de "+presupuestoEmpresa+" excede el límite establecido en 100.000 euros.");
					return false;}
				else
					//en caso contrario, apto
				{System.out.println("Enhorabuena!! Ha pasado la auditoría, nos vemos el año que viene.");
				return true;
				}
			
		}
		

	public static void main(String[] args) {
		
		//inicializar escáner
		Scanner sc=new Scanner(System.in);
		
		//pedir parámetros
		System.out.println("Salario jefe: ");
		double SalarioJefe=sc.nextDouble();
		System.out.println("Salario encargado: ");
		double SalarioEncargado=sc.nextDouble();
		System.out.println("Proyectos terminados (true/false): ");
		boolean proyectosTerminados=sc.nextBoolean();
		System.out.println("Certificación ISO (true/false): ");
		boolean CertificacionISO=sc.nextBoolean();
		System.out.println("Presupuesto empresa: ");
		double presupuestoEmpresa=sc.nextDouble();
		
		//invocar al método
		boolean auditoria=auditoriaPrestamoEmpresa(SalarioJefe,SalarioEncargado,proyectosTerminados,CertificacionISO,presupuestoEmpresa);

		//comprobar el valor de auditoria
		System.out.println("Apto: "+auditoria);
	}

}
