package lab3_21209320_CardenasRueda;

/**
 * Clase espec�fica de un archivo. Busca crear un archivo de C�digo fuente, siendo este un caso espec�fico de .py
 */
public class FileCodigoFuente_21209320_CardenasRueda extends File_21209320_CardenasRueda{
	
	String tipo = ".py";
	
	/**
	 * <p> Constructor de un archivo de CODIGO FUENTE
	 * </p>
	 * @param nombre (String) > nombre para el archivo a crear
	 * @param atr1 (char) > car�cter de seguridad del archivo
	 * @param atr2 (char) > car�cter de seguridad del archivo
	 * @param tipo (String) > tipo del archivo (en este caso, es ".py")
	 */
	public FileCodigoFuente_21209320_CardenasRueda(String nombre, char atr1, char atr2, String tipo) {
		super(nombre, atr1, atr2);
		this.tipo = tipo;
	}
	
	/**
	 * <p> Este m�todo permite retornar el tipo de un archivo
	 * </p>
	 * @param null
	 * @return tipo (String) > El tipo (".py") del archivo
	 */
	public String getTipo() {
		return tipo;
	}
}
