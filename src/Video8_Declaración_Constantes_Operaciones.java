
public class Video8_Declaración_Constantes_Operaciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declarar constantes
		/*Se utiliza la palabra clave "final" antes del tipo de datos
		 * para indicar que es una "constante"
		 */
		final double apulgadas=2.54;
		
		//Las constantes no pueden se modificadas luego de definirlas
		//a=4; (Excepción en "tiempo de compilación" no tiene solución)
		
		//Declarar varias variables en una misma linea
		double cm,resultado;
		
		cm=6;
		
		resultado = cm/apulgadas;
		
		/*El simbolo de concadenar es "+"
		 * Se utiliza para unir textos con variables.
		 */
		System.out.println("En " + cm + " cm hay "+ resultado +" pulgadas");
		
		//Este programa realiza una conversión de cm a pulgadas
		
		
		
	}

}
