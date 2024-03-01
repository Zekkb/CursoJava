package Video42_Herencia_III;

import java.util.*;

public class Video42_uso_Empleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Se instancian 4 empleados
		Empleado[] misEmpleados= new Empleado[4];
		
		//Se instancia los empleados
		misEmpleados[0]=new Empleado("Paco Gómez", 85000, 1990,12,17);
		
		misEmpleados[1]=new Empleado("Maria Martín", 95000, 1995,06,02);
		
		misEmpleados[2]=new Empleado("Paco Gómez", 105000, 2002,03,15);
		
		//Se instancia un objeto con el segundo constructor
		
		misEmpleados[3]=new Empleado("Antonio Fernández");
		
		
		//Se aumentan los sueldos de los empleados
		for(Empleado e: misEmpleados) {
			e.subeSueldo(5);
		}
		
		
		//Se imprimen la información de los empleados
		for(Empleado i: misEmpleados) {
			System.out.println("Nombre: " + i.dameNombre() +
					" Sueldo: " + i.dameSueldo() +
					" Fecha de Alta: " + i.dameFechaContrato());
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
		
		Id=IdSiguiente;
		
		IdSiguiente++;
		
	}
	
	//Se crea un segundo constructor con un parametro
	public Empleado(String nom) {
		//Se llama al primer constructor con el "this"
		/* Se utiliza esto para establecer datos
		 * iniciales a todos los objetos
		 */
		this(nom, 30000, 2000,01,01);
	}
	
	//Es un metodo que solo devuelve el nombre
	public String dameNombre() { //Getter
		return nombre + " Id " + Id;
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
	private int Id;
	private static int IdSiguiente=1;
	
	
}

class Jefatura extends Empleado{
	
	//Se crea el constructor de Jefatura
	public Jefatura(String nom,double sue, int agno, int mes, int dia) {
		
		/* Se utiliza super para llamar al constructor
		 * de la clase padre de Jefatura, es decir
		 * al constructor de Empleado
		*/
		super(nom, sue, agno, mes, dia);
		
		/* Para indicar a que constructor se llama
		 * Se define con la cantidad de parametros
		 * que se envian.
		 */
		
	}
	
	public void estableceIncentivo(double b) {
		
		incentivo=b;
	}
	
	//Se crea el metodo dameSueldo
	/* Este metodo sobrescribo el dameSueldo de 
	 * la clase Empleado
	 */
	public double dameSueldo() {
		
		/* Se utiliza "super" para indicar que 
		 * se esta llamando a los metodos de la clase
		 * padre "Empleado"
		 */
		double sueldoJefe=super.dameSueldo();
		return sueldoJefe + incentivo;
	}
	
	private double incentivo;
	
}