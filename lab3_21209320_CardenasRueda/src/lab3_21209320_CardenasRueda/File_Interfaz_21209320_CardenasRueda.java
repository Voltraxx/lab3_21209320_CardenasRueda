package lab3_21209320_CardenasRueda;

/**
 * interfaz para hacer contrato con los métodos a aplicar en File_21209320_CardenasRueda
 */
public interface File_Interfaz_21209320_CardenasRueda {
	
	/**
	 * <p> Obtiene el nombre de un archivo "x"
	 * </p>
	 * @param null
	 * @return nombre (String) > Devuelve el nombre del archivo 
	 */
	public String getNombre();
	
	/**
	 * <p> Obtiene el usuario de un archivo "x"
	 * </p>
	 * @param null
	 * @return usuario (String) > Devuelve al usuario creador del archivo
	 */
	public String getUsuario();
	
	/**
	 * <p> Obtiene el contenido de un archivo "x"
	 * </p>
	 * @param null
	 * @return contenido (String) > Devuelve el contenido actual del archivo
	 */
	public String getContenido();
	
	/**
	 * <p> Obtiene el atributo de seguridad 1 de un archivo "x"
	 * </p>
	 * @param null
	 * @return atr1 (char) > Devuelve la ruta a la que pertenece el archivo
	 */
	public char getAtr1();
	
	/**
	 * <p> Obtiene el atributo de seguridad 2 de un archivo "x"
	 * </p>
	 * @param null
	 * @return atr2 (char) > Devuelve el atributo de seguridad 1
	 */
	public char getAtr2();
	
	/**
	 * <p> Obtiene la ruta de un archivo "x"
	 * </p>
	 * @param null
	 * @return ruta (String) > Devuelve el atributo de seguridad 2
	 */
	public String getRuta();
	
	/**
	 * <p> Modifica el contenido de un archivo "x"
	 * </p>
	 * @param b (String) > Ingresa el nuevo contenido para que el archivo almacene
	 * @return void
	 */
	public void setContenido(String b);
	
	/**
	 * <p> Modifica la ruta de un archivo "x"
	 * </p>
	 * @param v (String) > Ingresa la nueva ruta del archivo
	 * @return void
	 */
	public void setRuta(String v);
	
	/**
	 * <p> Modifica el usuario de un archivo "x"
	 * </p>
	 * @param u (String) > Ingresa el nuevo nombre del usuario
	 * @return void
	 */
	public void setUsuario(String u);
}
