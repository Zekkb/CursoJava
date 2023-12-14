
public class Video12_manipula_cadena_3 {
	
	public static void main(String[] args) {
		
		String alumno1, alumno2, alumno3, alumno4;
		
		alumno1="David";
		
		alumno2="David";
		
		alumno3="david";
		
		alumno4="Juan";
		
		System.out.println("Analizar con el metodo equals");
		
		/*El metodo equals se utiliza para comparar
		 * dos cadenas de caracteres 
		 * 
		 * Devuelve true o false
		 * 
		 * toma como parametro otro string.
		 */
		
		System.out.println(alumno1 + " y " + alumno2 + " " + alumno1.equals(alumno2));
		
		System.out.println(alumno1 + " y " + alumno3 + " " + alumno1.equals(alumno3));
		
		System.out.println(alumno1 + " y " + alumno4 + " " + alumno1.equals(alumno4));
		
		System.out.println("Analizar con el metodo equalsIgnoreCase");
		
		/*El metodo equalsIgnoreCase evalua si dos
		 * cadenas son iguales, pero ignorando si son 
		 * mayusculas o minusculas.
		 * 
		 * Devuelve true o false
		 * 
		 * Toma como parametro otro string.
		 * 
		 */
		
		System.out.println(alumno1 + " y " + alumno2 + " " + alumno1.equalsIgnoreCase(alumno2));
		
		System.out.println(alumno1 + " y " + alumno3 + " " + alumno1.equalsIgnoreCase(alumno3));
		
		System.out.println(alumno1 + " y " + alumno4 + " " + alumno1.equalsIgnoreCase(alumno4));
		
		
		
	}
}
