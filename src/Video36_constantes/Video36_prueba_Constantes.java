package Video36_constantes;

public class Video36_prueba_Constantes {
	
	public static void main(String[] args) {
		
		Empleados trabajador1 =new Empleados("Paco");
		
		Empleados trabajador2=new Empleados("Ana");
		
		//Se cambia la seccion
		trabajador1.cambiaSeccion("RRHH");
		
		//trabajador1.cambiaNombre("Maria");
		
		//Se devuelven los datos de los empleados
		System.out.println(trabajador1.devuelveDatos());
		
		System.out.println(trabajador2.devuelveDatos());
		
		
		
	}

}

class Empleados{
	
	public Empleados(String nom) {
		
		nombre=nom;
		
		seccion="Administración";
	}
	
	//Se crea un metodo que cambia de seccion al empleado
	public void cambiaSeccion(String seccion) {//Setter
		this.seccion=seccion;
	}
	
	//Se crea un devueleDatos
	public String devuelveDatos() {
		return "El nombre es: " + nombre + "y la seccion es " + seccion ;
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
}