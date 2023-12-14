
public class Video10_Calculos_ConMath2 {

	public static void main(String[] arg) {
		
	//Redondear un numero 
		/*
		 * Se utiliza el metodo Math.round
		 * y la variables float e int
		 */
		float num1=5.85F;
		
		//El metodo round es pertenciente a la clase math
		int resultado=Math.round(num1);
		
		System.out.println("Redondeo del numero " + resultado);
		
	//Redondear un numero + Refundición
		
		double num2=5.85;
		
		/* Se agrega un (tipo_dato) para 
		 * transformar el valor a ese tipo de dato
		 * esto se denomina "Refundición"
		 */
		resultado=(int)Math.round(num2);
		
		System.out.println("Redondeo del numero" + resultado);
		
	//Elevar un numero a una potencia
		
		double base=5, exponente=3;
		
		/* Este metodo eleva un numero(base)
		 * a una potencia (exponente)
		 */
		
		//Se utiliza el metodo pow() de la clase Math
		double potencia =Math.pow(base, exponente);
		
		System.out.println("El resultado de " + base + " elevado a " + exponente + " es " + potencia);		
		
	//Elevar un numero a un potencia + Refundición
		
		base = 5;
		exponente=3;
		
		/*Se utiliza la refundición para
		 * forzar a que el resultado sea de tipo  "int"
		 */
		int potencia1 =(int)Math.pow(base, exponente);
		
		System.out.println("El resultado de " + base + " elevado a " + exponente + " es " + potencia1);		
		
	}
}
