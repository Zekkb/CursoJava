package Video37_static;

public class Video37_static {
	
	public static void main(String[] args) {
		
		Empleados trabajador1 =new Empleados("Paco");
		
		Empleados trabajador2=new Empleados("Ana");
		
		Empleados trabajador3 =new Empleados("Pepe");
		
		//Se cambia la seccion
		trabajador1.cambiaSeccion("RRHH");
		
		//trabajador1.cambiaNombre("Maria");
		
		//Se devuelven los datos de los empleados
		System.out.println(trabajador1.devuelveDatos());
		
		System.out.println(trabajador2.devuelveDatos());
		
		System.out.println(trabajador3.devuelveDatos());
		
	}

}

class Empleados{
	
	public Empleados(String nom) {
		
		nombre=nom;
		
		seccion="Administración";
		
		Id=IdSiguiente;
		
		IdSiguiente++;
		
	}
	
	//Se crea un metodo que cambia de seccion al empleado
	public void cambiaSeccion(String seccion) {//Setter
		this.seccion=seccion;
	}
	
	//Se crea un devueleDatos
	public String devuelveDatos() {
		return "El nombre es: " + nombre + 
				" , la seccion es " + seccion +
				" y el id es " + Id;
	}
	
	//Se crea un metodo que cambia el nombre
	/*
	public void cambiaNombre(String nombre) {
		this.nombre=nombre;
		//Este metodo no tiene sentido, porque no sería correcto
		//no podría cambiarse el nombre del empleado.
		//para realizar que esto no se correcto, se utiliza 
		//la palabra clave "private" en la variable
		//convirtiendola en una constante, que no pueda
		//cambiar su valor
	}
	*/
	
	private final String nombre;
	private String seccion;
	//Se define id
	private int Id;
	/*Se define una variable static (variable de clase)
	 * Una variable static, es una variable de ambito, es decir
	 * es una variable de la clase empleado, todos los objetos
	 * comparte el valor de "id"
	 */
	private static int IdSiguiente=1;
	
	/* Una variable "static" es una variable de clase
	 * como por ejemplo "Math.PI" 
	 * 
	 */
	
}