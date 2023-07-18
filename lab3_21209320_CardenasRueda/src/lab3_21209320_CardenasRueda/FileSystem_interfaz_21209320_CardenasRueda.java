package lab3_21209320_CardenasRueda;
/**
 * 
 * @author juanp
 *
 * interfaz para hacer contrato con los métodos a aplicar en FileSystem_21209320_CardenasRueda
 */
public interface FileSystem_interfaz_21209320_CardenasRueda {
	
	public void getSistema();
	public void addDrive(String letra, String name, int almacenamiento);
	public void register(String nombre);
	public void login(String nombre);
	public void logout();
	public void switchDrive(String letra);
	public void mkdir(String nombre, char atr1, char atr2);
	public void cd(String comando);
	
	
	
}
