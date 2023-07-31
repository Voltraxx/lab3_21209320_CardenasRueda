package lab3_21209320_CardenasRueda;

/**
 * Clase específica de un archivo. Busca crear un archivo de Código fuente, siendo este un caso específico de .py
 */
public class FileCodigoFuente_21209320_CardenasRueda extends File_21209320_CardenasRueda{
	
	String tipo = ".py";
	
	/**
	 * <p> Constructor de un archivo de CODIGO FUENTE
	 * </p>
	 * @param nombre (String) > nombre para el archivo a crear
	 * @param atr1 (char) > carácter de seguridad del archivo
	 * @param atr2 (char) > carácter de seguridad del archivo
	 * @param tipo (String) > tipo del archivo (en este caso, es ".py")
	 */
	public FileCodigoFuente_21209320_CardenasRueda(String nombre, char atr1, char atr2, String tipo) {
		super(nombre, atr1, atr2);
		this.tipo = tipo;
	}
	
	/**
	 * <p> Este método permite retornar el tipo de un archivo
	 * </p>
	 * @param null
	 * @return tipo (String) > El tipo (".py") del archivo
	 */
	public String getTipo() {
		return tipo;
	}
}
