package lab3_21209320_CardenasRueda;

public abstract class Elemento_21209320_CardenasRueda {
	
	//Hace referencia a elementos de folder y files
	
	String nombre;
	
	public abstract String move(String ruta);
	public abstract void copy();
	public abstract void delete();
	public abstract String rename();
}
