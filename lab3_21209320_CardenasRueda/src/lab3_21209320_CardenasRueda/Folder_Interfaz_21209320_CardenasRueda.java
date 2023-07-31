package lab3_21209320_CardenasRueda;

/**
 * interfaz para hacer contrato con los métodos a aplicar en Folder_21209320_CardenasRueda
 */
public interface Folder_Interfaz_21209320_CardenasRueda {
	
	/**
	 * <p> Método para obtener el nombre de una carpeta "y"
	 * </p>
	 * @param null
	 * @return (String) > nombre de la carpeta
	 */
	public String getNombre();
	
	/**
	 * <p> Método para obtener el usuario creador de una carpeta "y"
	 * </p>
	 * @param null
	 * @return (String) > usuario de la carpeta
	 */
	public String getUsuario();
	
	/**
	 * <p> Método para obtener la dirección de una carpeta "y"
	 * </p>
	 * @param null
	 * @return (String) > path de la carpeta
	 */
	public String getRuta();
	
	/**
	 * <p> Método para obtener el atributo 1 de una carpeta "y"
	 * </p>
	 * @param null
	 * @return (char) > atributo de seguridad de la carpeta
	 */
	public char getAtr1();
	
	/**
	 * <p> Método para obtener el atributo 2 de una carpeta "y"
	 * </p>
	 * @param null
	 * @return (char) > atributo de seguridad de la carpeta
	 */
	public char getAtr2();
	
	/**
	 * <p> Método para modificar el usuario de una carpeta "y"
	 * </p>
	 * @param u (String) > Nuevo usuario de la carpeta
	 * @return void
	 */
	public void setUsuario(String u);
	
	/**
	 * <p> Método para modificar la ruta de una carpeta "y"
	 * </p>
	 * @param r (String) > nueva ruta de la carpeta "y"
	 * @return void
	 */
	public void setRuta(String r);
}
