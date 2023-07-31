package lab3_21209320_CardenasRueda;

/**
 * Entidad representante de un drive (disco). Usaremos esta clase para representar Drives con los elementos de Letra, Nombre y Almacenamiento propio de ellos
 */
public class Drive_21209320_CardenasRueda implements Drive_Interfaz_21209320_CardenasRueda{
	
	String letra;
	String nombre;
	int almacenamiento;	
	
	/**
	 * <p> Método constructor de un drive.
	 * </p>
	 * @param letra > Letra representativa de un disco duro (C, D, F, etc)
	 * @param nombre > Nombre con el cual llamar al drive
	 * @param almacenamiento > capacidad del disco duro (en bytes)
	 */
	public Drive_21209320_CardenasRueda(String letra, String nombre, int almacenamiento) {
		this.letra = letra;
		this.nombre = nombre;
		this.almacenamiento = almacenamiento;
	}
	
	@Override
	/**
	 * <p> Obtiene la letra de un drive.
	 * </p>
	 * @param null
	 * @return Letra (String) > Devuelve la letra representativa del drive
	 */
	public String getLetra() {
		return letra;
	}
	
	@Override
	/**
	 * <p> Obtiene el nombre de un drive.
	 * </p>
	 * @param null
	 * @return Nombre (String) > Devuelve el nombre del disco duro
	 */
	public String getNombre() {
		return nombre;
	}
	
	@Override
	/**
	 * <p> Obtiene el almacenamiento de un drive.
	 * </p>
	 * @param null
	 * @return Almacenamiento (int) > Devuelve la capacidad de disco
	 */
	public int getAlmacenamiento() {
		return almacenamiento;
	}
}
