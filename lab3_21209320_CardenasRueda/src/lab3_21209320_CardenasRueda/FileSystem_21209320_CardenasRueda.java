package lab3_21209320_CardenasRueda;

public class FileSystem_21209320_CardenasRueda implements FileSystem_interfaz_21209320_CardenasRueda{

	String nombre;
	
	
	public FileSystem_21209320_CardenasRueda() {
	}
	
	public FileSystem_21209320_CardenasRueda(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public void getSistema() {
		System.out.println("Sistema: " + nombre);
	}
	
}
