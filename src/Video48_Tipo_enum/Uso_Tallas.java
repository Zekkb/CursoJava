package Video48_Tipo_enum;

import java.util.*;

public class Uso_Tallas {
	
	//enum Talla {MINI,MEDIANO,GRANDE,MUY_GRANDE}
	
	enum Talla {
		
		MINI("S"), MEDIANO("M"), GRANDE("L"), MUY_GRANDE("XL");
		
		
		private Talla(String abreviatura) {
			
			this.abreviatura=abreviatura;
			
		}
		
		/*private void darAbreviatura(String abreviatura) {
			
			this.abreviatura=abreviatura;
		}*/
		
		private String dameAbreviatura() {
			
			return abreviatura;
			
		}
		
		private String abreviatura;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		Talla b = Talla.GRANDE;
		
		System.out.print(b);
		*/
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Escribe una talla: MINI, MEDIANO, GRANDE, MUY_GRANDE");
		
		String entrada_datos=entrada.next().toUpperCase();
		
		Talla la_talla=Enum.valueOf(Talla.class, entrada_datos);
		
		System.out.println("Talla=" + la_talla);
		
		System.out.println("Abreviatura=" + la_talla.dameAbreviatura());
		
		
		
	}

}
