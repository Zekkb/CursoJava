package Video47_1_ModAcces_Object;

import Video47_2_ModAcces_Object.Clase3;

public class Clase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Clase1 miobj = new Clase1();
		
		System.out.print(miobj.mivar + ", "+ miobj.mivar2 + ", " + miobj.mimetodo() + "\n");
		
		Clase3 miobj2 = new Clase3();
		
		System.out.print(miobj2.mivar + ", " + miobj2.mivar2 + ", " + miobj.mimetodo());
		
	}

}
