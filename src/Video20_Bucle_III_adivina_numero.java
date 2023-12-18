import java.util.Scanner;
public class Video20_Bucle_III_adivina_numero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		int aleatorio = (int)(Math.random()*100);
		
		int numero;
		
		int intentos=0;
		
		/* Estructura do while
		 * Es un bucle igual que el while pero la diferencia
		 * que primero ejecuta el codigo en su interior
		 * y luego evalua la condición
		 * 
		 * 
		 * La diferencia sucede que el ejecuta el codigo
		 * en su interior una vez aunque la condición sea falsa.
		 * 
		 */
		
		
		do {
			intentos++;
			System.out.println("Introduce un número");
			
			numero= entrada.nextInt();
			
			if(aleatorio>numero) {
				
				System.out.println("Mas alto");
				
			}else if (aleatorio<numero) {
				
				System.out.println("Mas bajo");
				
			}
			
			
		}while(numero!=aleatorio);

		System.out.println("Correcto. Lo conseguiste en " + intentos + " intentos");
	}

}
