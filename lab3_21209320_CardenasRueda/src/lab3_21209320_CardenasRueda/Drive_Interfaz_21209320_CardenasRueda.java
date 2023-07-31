package lab3_21209320_CardenasRueda;

/**
 * interfaz para hacer contrato con los métodos a aplicar en Drive_21209320_CardenasRueda
 */
public interface Drive_Interfaz_21209320_CardenasRueda {
	
	/**
	 * <p> Obtiene la letra de un drive dado
	 * </p>
	 * @param null
	 * @return letra (String) > Devuelve la letra representativa del drive
	 */
	public String getLetra();
	
	/**
	 * <p> Obtiene el nombre de un drive dado
	 * </p>
	 * @param null
	 * @return nombre (String) > Devuelve el nombre del disco duro
	 */
	public String getNombre();
	
	/**
	 * <p> Obtiene el almacenamiento de un drive dado
	 * </p>
	 * @param null
	 * @return almacenamiento (int) > Devuelve la capacidad de disco
	 */
	public int getAlmacenamiento();
}
