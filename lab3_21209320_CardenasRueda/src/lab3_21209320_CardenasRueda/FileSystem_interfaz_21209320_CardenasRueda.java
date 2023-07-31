package lab3_21209320_CardenasRueda;

/**
 * interfaz para hacer contrato con los m�todos a aplicar en FileSystem_21209320_CardenasRueda
 */
public interface FileSystem_interfaz_21209320_CardenasRueda {
	
	/**
	 * <p> M�todo para obtener un sistema (imprimir por consola)
	 * </p>
	 * @param null
	 * @return void
	 */
	public void getSistema();
	
	/**
	 * <p> M�todo para a�adir un drive a un sistema respetando que sea �nico
	 * </p>
	 * @param letra (String) > Letra del drive
	 * @param name (String) > Hace referencia al nombre del drive
	 * @param almacenamiento (String) > capacidad de almacenamiento de una unidad drive
	 * @return void
	 */
	public void addDrive(String letra, String name, int almacenamiento);
	
	/**
	 * <p> M�todo para registrar un usuario en el sistema respetando que no exista este anteriormente
	 * </p>
	 * @param nombre (String) > Nombre del usuario a registrar
	 * @return void
	 */
	public void register(String nombre);
	
	/**
	 * <p> M�todo para loguearse en un usuario YA EXISTENTE
	 * </p>
	 * @param nombre (String) > Nombre del usuario al cual loguearse
	 * @return void
	 */
	public void login(String nombre);
	
	/**
	 * <p> M�todo para desloguearse de un usuario
	 * </p>
	 * @param null
	 * @return void
	 */
	public void logout();
	
	/**
	 * <p> M�todo para fijar una unidad drive EXISTENTE en la cual realizar acciones
	 * </p>
	 * @param letra (String) > Letra del drive a fijar
	 * @return void
	 */
	public void switchDrive(String letra);
	
	/**
	 * <p> M�todo para crear una carpeta en la direcci�n actual
	 * </p>
	 * @param nombre (String) > Nombre de la carpeta a crear
	 * @param atr1 (char) > atributo de seguridad de la carpeta a crear
	 * @param atr2 (char) > atributo de seguridad de la carpeta a crear
	 * @return void
	 */
	public void mkdir(String nombre, char atr1, char atr2);
	
	/**
	 * <p> M�todo para cambiar de directorio en el sistema (cambiar de ruta)
	 * </p>
	 * @param comando > comando para dirigirse a una nueva direcci�n (".." para devolverse, "/" para ir a raiz, "nombreArchivo" para dirigirse a la direcci�n de "nombreArchivo")
	 * @return void
	 */
	public void cd(String comando);
}
