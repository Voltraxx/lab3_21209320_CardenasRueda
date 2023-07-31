package lab3_21209320_CardenasRueda;

/**
 * interfaz para hacer contrato con los métodos a aplicar en FileSystem_21209320_CardenasRueda
 */
public interface FileSystem_interfaz_21209320_CardenasRueda {
	
	/**
	 * <p> Método para obtener un sistema (imprimir por consola)
	 * </p>
	 * @param null
	 * @return void
	 */
	public void getSistema();
	
	/**
	 * <p> Método para añadir un drive a un sistema respetando que sea único
	 * </p>
	 * @param letra (String) > Letra del drive
	 * @param name (String) > Hace referencia al nombre del drive
	 * @param almacenamiento (String) > capacidad de almacenamiento de una unidad drive
	 * @return void
	 */
	public void addDrive(String letra, String name, int almacenamiento);
	
	/**
	 * <p> Método para registrar un usuario en el sistema respetando que no exista este anteriormente
	 * </p>
	 * @param nombre (String) > Nombre del usuario a registrar
	 * @return void
	 */
	public void register(String nombre);
	
	/**
	 * <p> Método para loguearse en un usuario YA EXISTENTE
	 * </p>
	 * @param nombre (String) > Nombre del usuario al cual loguearse
	 * @return void
	 */
	public void login(String nombre);
	
	/**
	 * <p> Método para desloguearse de un usuario
	 * </p>
	 * @param null
	 * @return void
	 */
	public void logout();
	
	/**
	 * <p> Método para fijar una unidad drive EXISTENTE en la cual realizar acciones
	 * </p>
	 * @param letra (String) > Letra del drive a fijar
	 * @return void
	 */
	public void switchDrive(String letra);
	
	/**
	 * <p> Método para crear una carpeta en la dirección actual
	 * </p>
	 * @param nombre (String) > Nombre de la carpeta a crear
	 * @param atr1 (char) > atributo de seguridad de la carpeta a crear
	 * @param atr2 (char) > atributo de seguridad de la carpeta a crear
	 * @return void
	 */
	public void mkdir(String nombre, char atr1, char atr2);
	
	/**
	 * <p> Método para cambiar de directorio en el sistema (cambiar de ruta)
	 * </p>
	 * @param comando > comando para dirigirse a una nueva dirección (".." para devolverse, "/" para ir a raiz, "nombreArchivo" para dirigirse a la dirección de "nombreArchivo")
	 * @return void
	 */
	public void cd(String comando);
}
