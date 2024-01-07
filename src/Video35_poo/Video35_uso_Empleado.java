package Video35_poo;

import java.util.*;

public class Video35_uso_Empleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		//Se instancian los empleados
		Empleado empleado1=new Empleado("Paco Gómez", 85000, 1990,12,17);
		
		Empleado empleado2=new Empleado("Maria Martín", 95000, 1995,06,02);
		
		Empleado empleado3=new Empleado("Paco Gómez", 105000, 2002,03,15);
		
		//Se sube el sueldo de los empleados
		empleado1.subeSueldo(6);
		
		empleado2.subeSueldo(6);
		
		empleado3.subeSueldo(6);
		
		//Se imprimen los datos de los empleados
		
		System.out.println("Nombre: "+ empleado1.dameNombre() +
				" Sueldo: " + empleado1.dameSueldo() + 
				" Fecha de Alta: " + empleado1.dameFechaContrato());
		
		System.out.println("Nombre: "+ empleado2.dameNombre() +
				" Sueldo: " + empleado2.dameSueldo() + 
				" Fecha de Alta: " + empleado2.dameFechaContrato());
		
		System.out.println("Nombre: "+ empleado3.dameNombre() +
				" Sueldo: " + empleado3.dameSueldo() + 
				" Fecha de Alta: " + empleado3.dameFechaContrato());
		*/
		//Se realizan mediante array y se recorrer con fors
		
		//se define 3 empleados
		Empleado[] misEmpleados= new Empleado[3];
		
		//Se instancia los empleados
		misEmpleados[0]=new Empleado("Paco Gómez", 85000, 1990,12,17);
		
		misEmpleados[1]=new Empleado("Maria Martín", 95000, 1995,06,02);
		
		misEmpleados[2]=new Empleado("Paco Gómez", 105000, 2002,03,15);
		
		//Se aumentan los sueldos de los empleados
		/*
		for(int i=0;i<3;i++) {
			misEmpleados[i].subeSueldo(5);
		}
		*/
		//Se utiliza un for each o mejorado
		for(Empleado e: misEmpleados) {
			e.subeSueldo(5);
		}
		
		
		//Se imprimen la información de los empleados
		/*
		for(int i=0;i<3;i++) {
			System.out.println("Nombre: " + misEmpleados[i].dameNombre() +
					" Sueldo: " + misEmpleados[i].dameSueldo() +
					"Fecha de Alta: " + misEmpleados[i].dameFechaContrato());
		}
		*/
		
		//Se utiliza un for each o mejorado
		for(Empleado i: misEmpleados) {
			System.out.println("Nombre: " + i.dameNombre() +
					" Sueldo: " + i.dameSueldo() +
					"Fecha de Alta: " + i.dameFechaContrato());
		}
		
		
	}

}

class Empleado{
	
	public Empleado(String nom, double sue, int agno, int mes, int dia) {
		
		nombre=nom;
		sueldo=sue;
		
		//Se utiliza la clase GregorianCalendar para obtener la fecha
		GregorianCalendar calendario=new GregorianCalendar(agno,mes-1,dia);
		
		//Se utiliza el metodo "getTime" para obtener la fecha de Gregorian 
		//En tipo de dato "Date"
		altaContrato = calendario.getTime();
		
	}
	
	//Es un metodo que solo devuelve el nombre
	public String dameNombre() { //Getter
		return nombre;
	}
	
	//Este metodo solo devuelve el sueldo
	public double dameSueldo() {
		return sueldo;
	}
	//Este metodo solo devuelve la fecha de alta
	public Date dameFechaContrato() {
		return altaContrato;
	}
	//Este metodo modifica el sueldo del empleado
	public void subeSueldo(double porcentaje) { //setter
		double aumento = sueldo*(porcentaje/100);
		sueldo+=aumento;
	}
	
	private String nombre;
	private double sueldo;
	private Date altaContrato;
	
	
}