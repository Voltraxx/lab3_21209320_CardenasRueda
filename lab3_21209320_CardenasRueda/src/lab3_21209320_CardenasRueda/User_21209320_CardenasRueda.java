package lab3_21209320_CardenasRueda;

/**
 * Esta clase implementa a la interfaz User_Interfaz_21209320_CardenasRueda
 */
public class User_21209320_CardenasRueda implements User_Interfaz_21209320_CardenasRueda{
	
	String nombre;
	
	/**
	 * <p> Constructor de la presente clase User
	 * </p>
	 * @param nombre (String) > El nombre del usuario a construir
	 */
	public User_21209320_CardenasRueda(String nombre){
		this.nombre = nombre;
	}
	
	@Override
	/**
	 * <p> Metodo para obtener el nombre de un usuario
	 * </p>
	 * @param null
	 * @return String > nombre del usuario escogido
	 */
	public String getNombre() {
		return nombre;
	}
	
}
