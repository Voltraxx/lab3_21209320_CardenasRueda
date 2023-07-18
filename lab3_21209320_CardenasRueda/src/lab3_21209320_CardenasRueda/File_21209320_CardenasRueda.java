package lab3_21209320_CardenasRueda;

public abstract class File_21209320_CardenasRueda implements File_Interfaz_21209320_CardenasRueda{
	
	String nombre;
	String ruta;
	String usuario;
	String contenido;
	char atr1;
	char atr2;
	
	public File_21209320_CardenasRueda(String nombre, char atr1, char atr2) {
		this.nombre = nombre;
		this.atr1 = atr1;
		this.atr2 = atr2;
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
	public char getAtr1() {
		return atr1;
	}

	@Override
	public char getAtr2() {
		return atr2;
	}

	@Override
	public String getContenido() {
		return contenido;
	}
	
	public String getRuta() {
		return ruta;
	}
	
	@Override
	public void setContenido(String contenido) {
		this.contenido = contenido;
	}
	
	@Override
	public void setRuta(String ruta) {
		this.ruta = ruta;
	}
	
	@Override
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	
	abstract public String getTipo();
}
