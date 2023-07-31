package lab3_21209320_CardenasRueda;

/**
 * Clase específica de un archivo. Busca crear un archivo de Documento, siendo este un caso específico de .docx
 */
public class FileDocumento_21209320_CardenasRueda extends File_21209320_CardenasRueda{
	
	String tipo = ".docx";
	
	/**
	 * <p> Constructor de un archivo de DOCUMENTO
	 * </p>
	 * @param nombre (String) > nombre para el archivo a crear
	 * @param atr1 (char) > carácter de seguridad del archivo
	 * @param atr2 (char) > carácter de seguridad del archivo
	 * @param tipo (String) > tipo del archivo (en este caso, es ".docx")
	 */
	public FileDocumento_21209320_CardenasRueda(String nombre, char atr1, char atr2, String tipo) {
		super(nombre, atr1, atr2);
		this.tipo = tipo;
	}
	
	/**
	 * <p> Este método permite retornar el tipo de un archivo
	 * </p>
	 * @param null
	 * @return tipo (String) > El tipo (".docx") del archivo
	 */
	public String getTipo() {
		return tipo;
	}
}
