package lab3_21209320_CardenasRueda;
/**
 * 
 * @author juanp
 *
 * Esta clase implementa a la interfaz Folder_Interfaz_21209320_CardenasRueda
 *
 */
public class Folder_21209320_CardenasRueda implements Folder_Interfaz_21209320_CardenasRueda{
	
	String nombre; //Nombre de la carpeta
	String ruta; //Directorio de la carpeta
	String usuario; //Usuario que creó la carpeta
	char atributo1; //Atributo de seguridad n°1
	char atributo2; //Atributo de seguridad n°2
	
	/**
	 * <p> Constructor de la clase Folder
	 * </p>
	 * @param1 El nombre de la carpeta
	 * @param2 El atributo1 de la carpeta
	 * @param3 El atributo2 de la carpeta
	 */
	public Folder_21209320_CardenasRueda(String nombre, char atributo1, char atributo2){
		this.nombre = nombre;
		this.atributo1 = atributo1;
		this.atributo2 = atributo2;
	}
	
	/**
	 * <p> Método para obtener el nombre de una carpeta "x"
	 * </p>
	 * @param null
	 * @return el nombre de la carpeta 
	 */
	@Override
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * <p> Método para obtener el usuario creador de una carpeta "x"
	 * </p>
	 * @param null
	 * @return el usuario que creó la carpeta
	 */
	@Override
	public String getUsuario() {
		return usuario;
	}
	
	/**
	 * <p> Método para obtener el directorio de una carpeta "x"
	 * </p>
	 * @param null
	 * @return la ubicación de la carpeta
	 */
	@Override
	public String getRuta() {
		return ruta;
	}
	
	/**
	 * <p> Método para obtener el atributo 1 de una carpeta "x"
	 * </p>
	 * @param null
	 * @return el atributo de la carpeta (1)
	 */
	@Override
	public char getAtr1() {
		return atributo1;
	}

	/**
	 * <p> Método para obtener el atributo 2 de una carpeta "x"
	 * </p>
	 * @param null
	 * @return el atributo de la carpeta (2)
	 */
	@Override
	public char getAtr2() {
		return atributo2;
	}
	
	/**
	 * <p> Método para modificar/fijar el usuario de una carpeta "x"
	 * </p>
	 * @param el usuario nuevo de la carpeta
	 */
	@Override
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	
	/**
	 * <p> Método para modificar/fijar la ruta de una carpeta "x"
	 * </p>
	 * @param la nueva ruta de la carpeta
	 */
	@Override
	public void setRuta(String ruta) {
		this.ruta = ruta;
	}

}
