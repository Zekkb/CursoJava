package Video50_p2_Interfaces_II;

import java.util.*;

public class Video50_uso_Empleado {

	public static void main(String[] args) {
		
		Jefatura jefe_RRHH=new Jefatura("Juan",55000,2006,9,25);
		
		jefe_RRHH.estableceIncentivo(2570);
		
		//Se definen 6 empleados
		Empleado[] misEmpleados= new Empleado[6];
		
		//Se instancia los empleados
		misEmpleados[0]=new Empleado("Paco Gómez", 85000, 1990,12,17);
		
		misEmpleados[1]=new Empleado("Maria Martín", 95000, 1995,06,02);
		
		misEmpleados[2]=new Empleado("Paco Gómez", 105000, 2002,03,15);
		
		//Se instancia un objeto con el segundo constructor
		
		misEmpleados[3]=new Empleado("Antonio Fernández");
		
		misEmpleados[4]=jefe_RRHH; 
		
		//Polimorfimos en accion. Principio de sustitución
		
		/* Lo que ocurre en esta sentencia es
		 * Se almacena un objeto de tipo "Jefatura"
		 * en un array de tipo "Empleados"
		 * 
		 * Esto ocurre porque que Jefatura hereda de Empleado
		 * 
		 * Jefe_RRHH esta en Empleado y en Jefatura
		 * 
		 */
		
		/* Se crea una de Jefatura y dentro de un
		 * array misEmplados 
		 */
		
		misEmpleados[5]= new Jefatura("Maria",95000,1999,5,26);
		/* misEmpleados puede almacenar objeto de
		 * Empleados y de Jefatura
		 */
		
		/* Se quiere dar a un Empleado, de misEmpleados el metodo
		 * establecerIncetivo, para eso se utiliza el casting
		 */
		/* Se realiza el casting entre misEmpleadoas y Jefatura
		 */
		
		Jefatura jefa_Finanzas = (Jefatura) misEmpleados[5];
		
		jefa_Finanzas.estableceIncentivo(55000);
		
		//Casting mal realizado
		
		//Jefatura jefe_compras = (Jefatura) misEmpleados[1];
		
		/*Esto imprime una excepción 
		 * indicando que no se puede realizar un casting 
		 * de misEmpleados[1]
		 */
		
		
		
		
		
		//Se realiza el principio de sustitución con dos clases
		Empleado director_comercial=new Jefatura("Sandra",85000,2012,05,05);
		
		//Se realiza el principio de sustitución con una clase e interfaz
		
		Comparable ejemplo=new Empleado("Elisabeth",95000,2011, 06, 07);
		
		/* Tener en cuenta que no se puede instanciar una interfaz
		 * pero si se puede utilizar el principio de sustitución
		 * de tal forma que si la clase Empleado implementa
		 * la interfaz comparable
		 * 
		 * Permitiendo crear una instancia perteneciente a la interfaz, pero
		 * a la hora de instanciarla indicar que es de tipo "Empleado"
		 * 
		 */
		
		//Instrucción instanceof
		/* Esta instrucción permite verificar si la instancia
		 * definida es de una clase o de una interfaz 
		 */
		
		if(director_comercial instanceof Empleado) {
			
			System.out.println("Es de tipo Jefatura");
			
		}
		
		if(ejemplo instanceof Comparable) {
			
			System.out.println("Implementa la interfaz comparable");
		}

		System.out.println(jefa_Finanzas.tomar_decisiones("Dar más dias de vacaciones a los empleados"));
		
		//Se aumentan los sueldos de los empleados
		for(Empleado e: misEmpleados) {
			e.subeSueldo(5);
			/* En este caso se aumenta el sueldo 
			 * de los objetos Empleados y tambien de aquellos
			 * que pertenecen a Jefatura
			 */
		}
		
		//Se esta utilizando el metodo sort de la clase Arrays
		/* Para utilizar esto primero la clase que instancia misEmpleados
		 * debe tener una interfaz de la clase Comparable
		 * Es decir, la clase Empleado debe heredar de Comparable
		 * 
		 */
		Arrays.sort(misEmpleados);
		
		
		//Se imprimen la información de los empleados
		for(Empleado i: misEmpleados) {
			System.out.println("Nombre: " + i.dameNombre() +
					" Sueldo: " + i.dameSueldo() +
					" Fecha de Alta: " + i.dameFechaContrato());
		}
		/* Cuando se imprimen los datos, se ve que el sueldo de 
		 * Juan tiene un valor mayor que el calculado
		 * esto ocurre porque
		 * 
		 * Cuando el for, imprime "i.dameSueldo()" hace
		 * referencia al de la clase Jefatura y no de 
		 * la clase Empleado, por lo tanto
		 * 
		 * dameSueldo le mostrara el sueldo mas el aumento y 
		 * el incentivo
		 * 
		 */

		
	}

}

class Empleado implements Comparable{
	
	//Se hace que la clase Empleado implemente la interfaz Comparable
	/* La clase Comparable requiere que la clase Empleado cree 
	 * el metodo CompareTo
	 */
	
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
		return nombre + " Id: " + Id;
	}
	
	//Este metodo solo devuelve el sueldo
	
	/* Se modifica el metodo, para que no pueda ser
	 * sobreescrito por otra clase que herede de Empleado
	 * para realizar esto, se utiliza "final"
	 */
	final public double dameSueldo() {
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
	
	//Se sobrescribe el metodo CompareTo de la interfaz Comparable
	
	public int compareTo(Object miObjeto) {
		
		Empleado otroEmpleado= (Empleado) miObjeto;
				
		
		if(this.sueldo<otroEmpleado.sueldo) {
			
			return -1;
		}
		if(this.sueldo>otroEmpleado.sueldo) {
			
			return 1;
		}
		
		return 0;
	}
	
	
	private String nombre;
	private double sueldo;
	private Date altaContrato;
	private int Id;
	private static int IdSiguiente=1;
	
	
}

/* Se hace que la clase Jefatura no pueda hereda a otras clases
 * para realizar esto se utiliza "final"
 */

final class Jefatura extends Empleado implements Jefes{
	
	//Se hace que la clase Jefatura implemente la interfaz Jefes
	
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
	/* Este metodo ya no puede sobreescribir el dameSueldo de  
	 * la clase empleado, porque ahora el metodo tiene un "final"
	 */
	/* Para solucionar esto, se puede realizar dos alternativas
	 * Se quita la herencia de Empleado
	 * Se cambia el nombre del metodo (usando)
	 */
	public double dameSueldo2() {
		
		/* Se utiliza "super" para indicar que 
		 * se esta llamando a los metodos de la clase
		 * padre "Empleado"
		 */
		double sueldoJefe=super.dameSueldo();
		return sueldoJefe + incentivo;
	}
	
	//Se crea el metodo tomar_decisiones
	/* Que se hereda de la interfaz Jefes
	 */
	
	public String tomar_decisiones(String decision) {
		
		return "Un miembro de dirección ha tomado la decisión de: " + decision;
		
	}
	
	
	private double incentivo;
	
}

/* Esta clase va tener una error
 * porque la clase Jefatura no puede heredar a Director
 */

/* 
class Director extends Jefatura{
	
	//Se crea el constructor de Director
	public Director(String nom,double sue, int agno, int mes, int dia) {
		
		super(nom, sue, agno, mes, dia);
	}
	
}
*/
