package lab3_21209320_CardenasRueda;

/**
 * Clase específica de un archivo. Busca crear un archivo de Texto plano, siendo este un caso específico de .txt
 */
public class FileTexto_21209320_CardenasRueda extends File_21209320_CardenasRueda{
	
	String tipo = ".txt";
	
	/**
	 * <p> Constructor de un archivo de TEXTO PLANO
	 * </p>
	 * @param nombre (String) > nombre para el archivo a crear
	 * @param atr1 (char) > carácter de seguridad del archivo
	 * @param atr2 (char) > carácter de seguridad del archivo
	 * @param tipo (String) > tipo del archivo (en este caso, es ".txt")
	 */
	public FileTexto_21209320_CardenasRueda(String nombre, char atr1, char atr2, String tipo) {
		super(nombre, atr1, atr2);
		this.tipo = tipo;
	}
	
	/**
	 * <p> Este método permite retornar el tipo de un archivo
	 * </p>
	 * @param null
	 * @return tipo (String) > El tipo (".txt") del archivo
	 */
	public String getTipo() {
		return tipo;
	}
	
}
