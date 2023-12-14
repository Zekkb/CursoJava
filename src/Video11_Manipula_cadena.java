
public class Video11_Manipula_cadena {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String, es una clase
		
		String mi_nombre;
		
		//Se define el objeto de la clase String.
		
		mi_nombre="Ezequiel Pacheco S";
		
		System.out.println("Mi nombre es " + mi_nombre );
		
		/*Se utiliza el metodo .length() del objeto String
		  Obtiene la cantidad de letras 
		  que tiene la cadena de caracteres
		*/
		System.out.println("Mi nombre tiene " + mi_nombre.length() + " letras " );
		
		/*Se utiliza el metodo .charAt(posición del caracteres)
		  Obtiene el caracter de dicha posición.
		  comienza de 0 en adelante.
		*/
		
		System.out.println("La primera letra es " + mi_nombre.charAt(0) );
		
		/*Se obtiene la ultima letra 
		  Se utiliza el metodo .length() y .charAt()
		 */
		
		int ultima_letra;
		
		ultima_letra=mi_nombre.length();
		
		System.out.println("La ultima letra es la " + mi_nombre.charAt(ultima_letra-1) );
		
	}

}
