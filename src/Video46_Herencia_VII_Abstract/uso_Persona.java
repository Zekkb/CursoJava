package Video46_Herencia_VII_Abstract;

import java.util.Date;
import java.util.GregorianCalendar;

public class uso_Persona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Persona[] lasPersonas = new Persona[2];
		
		
		lasPersonas[0]=new Empleado("Luis Conde", 50000, 2009,02,25);
		
		lasPersonas[1]=new Alumno("Ana Lopez","Bilogicas");
		
		for (Persona p: lasPersonas) {
			
			System.out.println(p.dameNombre() + ", " + p.dameDescripcion());
		}
		
	}

}

abstract class Persona{
	
	public Persona(String nom) {
		
		nombre=nom;
	}
	
	public String dameNombre(){
		
		return nombre;
	}
	
	public abstract String dameDescripcion();
	
	private String nombre;
}


class Empleado extends Persona{
	
	public Empleado(String nom, double sue, int agno, int mes, int dia) {
		
		super(nom);
		
		sueldo =sue;
		
		GregorianCalendar calendario=new GregorianCalendar(agno,mes-1,dia);
		
		altaContrato=calendario.getTime();
		
		++IdSiguiente;
		
		Id=IdSiguiente;
	}
	
	public double dameSueldo() { //getter
		return sueldo;
	}
	
	public Date dameFechaContrato(){ //getter
		
		return altaContrato;
	}
	
	public void subeSueldo(double porcentaje) {
		
		double aumento=sueldo*porcentaje/100;
		
		sueldo*=aumento;
	}
	
	public String dameDescripcion() {
		
		return "Este empleado tiene un id=" + Id + " con sueldo=" + sueldo;
		
	}
	
	private double sueldo;
	
	private Date altaContrato;
	
	private static int IdSiguiente;
	
	private int Id;
	
}

class Alumno extends Persona{
	
	public Alumno(String nom, String car) {
		
		super(nom);
		
		carrera=car;
	}
	
	public String dameDescripcion() {
		
		return "Este alumno esta estudiando " + carrera;
	}
	private String carrera;
	
}
