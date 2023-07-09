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
	public void existeDrive() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void formatearDrive() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getDrive() {
		System.out.println("Drive: " + letra + "," + nombre + "," + almacenamiento);
		
	}

}
