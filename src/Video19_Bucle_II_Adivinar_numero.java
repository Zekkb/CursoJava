import java.util.Scanner;
public class Video19_Bucle_II_Adivinar_numero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Se almacena el numero aleatorio
		int aleatorio = (int)(Math.random()*100);
		
		/* Se utiliza el metodo random() para obtener un valor
		 * entre 0 y 1 con decimal, pero luego se lo multiplica
		 * obteniendo un numero comprendido entre 0 y 100
		 * 
		 * Al ser un numero decimal, se lo trunca para quitarle 
		 * los decimales 
		 * 
		 */
		
		Scanner entrada = new Scanner(System.in);
		
		int numero =0;
		
		int intentos=0;
		
		while(numero!=aleatorio) {
			//Cuenta los intentos realizados
			intentos++;
			
			System.out.println("Introduce un número");
			
			//Entrada de proximo numero
			numero = entrada.nextInt();
			
			//Se evalua si el número ese mas grande o mas chico que el aleatorio
			if(aleatorio<numero) {
				
				System.out.println("Mas bajo");
				
			}else if(aleatorio>numero) {
				
				System.out.println("Mas alto");
				
			}
		}
		
		System.out.println("Correcto. Lo lograste en " + intentos + " intentos");
	}

}
