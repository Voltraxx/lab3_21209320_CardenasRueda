package lab3_21209320_CardenasRueda;

/**
 * 
 * @author juanp
 *
 * Esta clase implementa a la interfaz User_Interfaz_21209320_CardenasRueda
 *
 */

public class User_21209320_CardenasRueda implements User_Interfaz_21209320_CardenasRueda{
	
	String nombre;
	
	/**
	 * <p> Constructor de la presente clase User
	 * </p>
	 * @param El nombre del usuario
	 */
	public User_21209320_CardenasRueda(String nombre){
		this.nombre = nombre;
	}
	
	/**
	 * <p> Este método permite retornar el nombre que posee el usuario una vez ha sido instanciado
	 * </p>
	 * 
	 * @return El nombre del usuario
	 */
	@Override
	public String getNombre() {
		return nombre;
	}
	
}
