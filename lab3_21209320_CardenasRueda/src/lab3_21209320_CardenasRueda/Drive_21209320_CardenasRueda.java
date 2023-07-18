package lab3_21209320_CardenasRueda;

public class Drive_21209320_CardenasRueda implements Drive_Interfaz_21209320_CardenasRueda{
	
	String letra;
	String nombre;
	int almacenamiento;	
	
	public Drive_21209320_CardenasRueda(String letra, String nombre, int almacenamiento) {
		this.letra = letra;
		this.nombre = nombre;
		this.almacenamiento = almacenamiento;
	}

	@Override
	public String getLetra() {
		return letra;
	}
	@Override
	public String getNombre() {
		return nombre;
	}
	@Override
	public int getAlmacenamiento() {
		return almacenamiento;
	}
}
