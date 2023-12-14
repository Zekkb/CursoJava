
public class Video12_manipula_cadena_2 {
	
	public static void main(String[] args) {
		
		String frase="Hoy es un estupendo día para aprender a programar en Java";
		
		/*Se utiliza el metodo substring para 
		  extraer una cadena de string del la variable
		  string
		  
		  Pide dos parametros, El primer parámetro es 
		  el índice de donde se extraer el carácter y 
		  el segundo índice indica en que carácter 
		  se quiere dejar de extraer, excluyendolo.
		  
		  El resultado se almacena en otra variable string.
		  	
		*/
		String frase_resume=frase.substring(29,frase.length());
		
		System.out.println(frase_resume);
		
		String frase_resume2=frase.substring(0,28) + " irnos a la playa y olvidarnos de todo..." + 
		" y " + frase.substring(29,57);
		
		System.out.println(frase_resume2);
		
	}
}
