package lab3_21209320_CardenasRueda;

public class User_21209320_CardenasRueda implements User_Interfaz_21209320_CardenasRueda{
	
	String nombre;
	
	public User_21209320_CardenasRueda(String nombre){
		this.nombre = nombre;
	}
	
	@Override
	public String getNombre() {
		return nombre;
	}
	
}
