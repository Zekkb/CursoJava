package Video41_Herencia_II;

/*La clase Video41_Furgoneta hereda de Video40_coche
 * para indicar esto se utiliza la palabra clave "extends"
 */
public class Video41_Furgoneta extends Video41_Coche{
	
	//Se declaran campos de los objetos
	private int capacidad_carga;
	private int plazas_extra;
	
	public Video41_Furgoneta(int plazas_extra, int capacidad_carga) {
		
		//Se llama al constructor de la clase padre (Video41_Coche)
		super();
		
		this.capacidad_carga=capacidad_carga;
		this.plazas_extra=plazas_extra;
	}
	
	//Este metodo devuele los datos de la furgoneta
	public String dimeDatosFurgoneta() {
		return "La capacidad de carga es: " + capacidad_carga +
			   " Y las plazas son: " + plazas_extra;
	}
	
	
}
