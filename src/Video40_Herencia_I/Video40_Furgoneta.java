package Video40_Herencia_I;

/*La clase Video41_Furgoneta hereda de Video40_coche
 * para indicar esto se utiliza la palabra clave "extends"
 */
public class Video40_Furgoneta extends Video40_Coche{
	
	//Se declaran campos de los objetos
	private int capacidad_carga;
	private int plazas_extra;
	
	public Video40_Furgoneta(int plazas_extra, int capacidad_carga) {
		
		//Se llama al constructor de la clase padre (Video41_Coche)
		super();
		
		this.capacidad_carga=capacidad_carga;
		this.plazas_extra=plazas_extra;
	}
	
}
