package lab3_21209320_CardenasRueda;

/**
 * Esta clase implementa a la interfaz Folder_Interfaz_21209320_CardenasRueda
 */
public class Folder_21209320_CardenasRueda implements Folder_Interfaz_21209320_CardenasRueda{
	
	String nombre;
	String ruta; 
	String usuario; 
	char atributo1; 
	char atributo2; 
	
	/**
	 * <p> Constructor de la clase Folder
	 * </p>
	 * @param nombre (String) > El nombre de la carpeta
	 * @param atributo1 (char) > El atributo 1 de la carpeta
	 * @param atributo2 (char) > El atributo 2 de la carpeta
	 */
	public Folder_21209320_CardenasRueda(String nombre, char atributo1, char atributo2){
		this.nombre = nombre;
		this.atributo1 = atributo1;
		this.atributo2 = atributo2;
	}
	
	@Override
	/**
	 * <p> Método para obtener el nombre de una carpeta "y"
	 * </p>
	 * @param null
	 * @return (String) > nombre de la carpeta
	 */
	public String getNombre() {
		return nombre;
	}
	
	@Override
	/**
	 * <p> Método para obtener el usuario creador de una carpeta "y"
	 * </p>
	 * @param null
	 * @return (String) > usuario de la carpeta
	 */
	public String getUsuario() {
		return usuario;
	}
	
	@Override
	/**
	 * <p> Método para obtener la dirección de una carpeta "y"
	 * </p>
	 * @param null
	 * @return (String) > path de la carpeta
	 */
	public String getRuta() {
		return ruta;
	}
	
	@Override
	/**
	 * <p> Método para obtener el atributo 1 de una carpeta "y"
	 * </p>
	 * @param null
	 * @return (char) > atributo de seguridad de la carpeta
	 */
	public char getAtr1() {
		return atributo1;
	}

	@Override
	/**
	 * <p> Método para obtener el atributo 2 de una carpeta "y"
	 * </p>
	 * @param null
	 * @return (char) > atributo de seguridad de la carpeta
	 */
	public char getAtr2() {
		return atributo2;
	}
	
	@Override
	/**
	 * <p> Método para modificar el usuario de una carpeta "y"
	 * </p>
	 * @param u (String) > Nuevo usuario de la carpeta
	 * @return void
	 */
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	
	@Override
	/**
	 * <p> Método para modificar la ruta de una carpeta "y"
	 * </p>
	 * @param r (String) > nueva ruta de la carpeta "y"
	 * @return void
	 */
	public void setRuta(String ruta) {
		this.ruta = ruta;
	}

}
