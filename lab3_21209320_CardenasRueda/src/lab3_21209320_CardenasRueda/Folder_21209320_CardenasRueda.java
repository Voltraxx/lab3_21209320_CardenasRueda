package lab3_21209320_CardenasRueda;

public class Folder_21209320_CardenasRueda implements Folder_Interfaz_21209320_CardenasRueda{
	
	String nombre;
	String ruta;
	String usuario;
	char atributo1;
	char atributo2;
	
	public Folder_21209320_CardenasRueda(String nombre, char atributo1, char atributo2){
		this.nombre = nombre;
		this.atributo1 = atributo1;
		this.atributo2 = atributo2;
	}

	@Override
	public String getNombre() {
		return nombre;
	}

	@Override
	public String getUsuario() {
		return usuario;
	}

	@Override
	public String getRuta() {
		return ruta;
	}

	@Override
	public char getAtr1() {
		return atributo1;
	}

	@Override
	public char getAtr2() {
		return atributo2;
	}
	
	@Override
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	
	@Override
	public void setRuta(String ruta) {
		this.ruta = ruta;
	}

}
