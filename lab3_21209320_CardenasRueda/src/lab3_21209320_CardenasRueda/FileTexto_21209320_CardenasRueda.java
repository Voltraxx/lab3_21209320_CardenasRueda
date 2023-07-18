package lab3_21209320_CardenasRueda;
/**
 * 
 * @author juanp
 *
 * Esta clase hereda de la superclase abstracta File_21209320_CardenasRueda
 *
 */
public class FileTexto_21209320_CardenasRueda extends File_21209320_CardenasRueda{
	
	String tipo = ".txt"; //tipo del archivo
	
	/**
	 * <p> Constructor de la presente clase FileTexto
	 * </p>
	 * @param El nombre del usuario, sus dos atributos de seguridad y el tipo de archivo
	 */
	public FileTexto_21209320_CardenasRueda(String nombre, char atr1, char atr2, String tipo) {
		super(nombre, atr1, atr2);
		this.tipo = tipo;
	}
	
	/**
	 * <p> Este m�todo permite retornar el tipo de un archivo
	 * </p>
	 * 
	 * @return El tipo del archivo
	 */
	public String getTipo() {
		return tipo;
	}
	
}