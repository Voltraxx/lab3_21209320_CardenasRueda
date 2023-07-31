package lab3_21209320_CardenasRueda;

/**
 * Esta entidad busca servir como padre para los distintos tipos de archivos que existen. Para este caso particular, será padre de archivos de texto plano, codigo fuente y documento
 */
public abstract class File_21209320_CardenasRueda implements File_Interfaz_21209320_CardenasRueda{
	
	String nombre;
	String ruta;
	String usuario;
	String contenido;
	char atr1;
	char atr2;
	
	/**
	 * <p> Método constructor de un archivo
	 * </p>
	 * @param nombre (String) > Nombre del archivo a crear
	 * @param atr1 (char) > Atributo de seguridad del archivo (h, r, l, p, etc)
	 * @param atr2 (char) > Atributo de seguridad del archivo
	 */
	public File_21209320_CardenasRueda(String nombre, char atr1, char atr2) {
		this.nombre = nombre;
		this.atr1 = atr1;
		this.atr2 = atr2;
	}

	@Override
	/**
	 * <p> Obtiene el nombre de un archivo "x"
	 * </p>
	 * @param null
	 * @return nombre (String) > Devuelve el nombre del archivo 
	 */
	public String getNombre() {
		return nombre;
	}
	
	@Override
	/**
	 * <p> Obtiene el usuario de un archivo "x"
	 * </p>
	 * @param null
	 * @return usuario (String) > Devuelve al usuario creador del archivo
	 */
	public String getUsuario() {
		return usuario;
	}

	@Override
	/**
	 * <p> Obtiene el contenido de un archivo "x"
	 * </p>
	 * @param null
	 * @return contenido (String) > Devuelve el contenido actual del archivo
	 */
	public String getContenido() {
		return contenido;
	}
	
	@Override
	/**
	 * <p> Obtiene la ruta de un archivo "x"
	 * </p>
	 * @param null
	 * @return ruta (String) > Devuelve la ruta a la que pertenece el archivo
	 */
	public String getRuta() {
		return ruta;
	}
	
	@Override
	/**
	 * <p> Obtiene el atributo de seguridad 1 de un archivo "x"
	 * </p>
	 * @param null
	 * @return atr1 (char) > Devuelve el atributo de seguridad 1
	 */
	public char getAtr1() {
		return atr1;
	}

	@Override
	/**
	 * <p> Obtiene el atributo de seguridad 2 de un archivo "x"
	 * </p>
	 * @param null
	 * @return atr2 (char) > Devuelve el atributo de seguridad 2
	 */
	public char getAtr2() {
		return atr2;
	}
	
	@Override
	/**
	 * <p> Modifica el contenido de un archivo "x"
	 * </p>
	 * @param b (String) > Ingresa el nuevo contenido para que el archivo almacene
	 * @return void
	 */
	public void setContenido(String contenido) {
		this.contenido = contenido;
	}
	
	@Override
	/**
	 * <p> Modifica la ruta de un archivo "x"
	 * </p>
	 * @param v (String) > Ingresa la nueva ruta del archivo
	 * @return void
	 */
	public void setRuta(String ruta) {
		this.ruta = ruta;
	}
	
	@Override
	/**
	 * <p> Modifica el usuario de un archivo "x"
	 * </p>
	 * @param u (String) > Ingresa el nuevo nombre del usuario
	 * @return void
	 */
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	
	/**
	 * <p> Método (ABSTRACT) para obtener el tipo del archivo
	 * </p>
	 * @param null
	 * @return (String) > Busca devolver el tipo del archivo
	 */
	abstract public String getTipo();
}
