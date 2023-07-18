package lab3_21209320_CardenasRueda;

import java.util.ArrayList;

/**
 * 
 * @author juanp
 *
 * Esta clase implementa a la interfaz User_Interfaz_21209320_CardenasRueda
 *
 */
public class FileSystem_21209320_CardenasRueda implements FileSystem_interfaz_21209320_CardenasRueda{

	String nombre; // nombre del sistema
	String ruta = ""; // drive fijado del sistema
	String raiz = ""; // ruta actual en la que se está trabajando
	ArrayList<Drive_21209320_CardenasRueda> drives; // drives del sistema
	ArrayList<User_21209320_CardenasRueda> usuarios; // usuarios del sistema
	ArrayList<Folder_21209320_CardenasRueda> carpetas; // carpetas del sistema
	String log = "";
	
	/**
	 * <p> Constructor de la presente clase FileSystem
	 * </p>
	 * @param null
	 */
	public FileSystem_21209320_CardenasRueda() {
	}
	
	/**
	 * <p> Constructor de la presente clase FileSystem. Este constructor es una sobrecarga del método constructor
	 * </p>
	 * @param nombre del sistema
	 */
	public FileSystem_21209320_CardenasRueda(String nombre) {
		this.nombre = nombre;
		this.drives = new ArrayList<>();
		this.usuarios = new ArrayList<>();
		this.carpetas = new ArrayList<>();
	}
	
	/**
	 * <p> método que añade un drive al arraylist del sistema
	 * </p>
	 * @param letra, nombre y almacenamiento del drive
	 */
	@Override
	public void addDrive(String letra, String name, int almacenamiento) {
		
		boolean valor = false;
		Drive_21209320_CardenasRueda drive = new Drive_21209320_CardenasRueda(letra, name, almacenamiento);
		
		for (int i=0; i<drives.size(); i++) {
			if (drives.get(i).getLetra().equals(drive.getLetra())) {
				valor = true;
			}
		}
		if (valor == false) {
			drives.add(drive);
		}
	}
	
	/**
	 * <p> método que añade un usuario al arraylist del sistema
	 * </p>
	 * @param nombre del usuario a registrar
	 */
	@Override
	public void register(String nombre) {
		
		boolean valor = false;
		User_21209320_CardenasRueda usuario = new User_21209320_CardenasRueda(nombre);
		
		for (int i=0; i<usuarios.size(); i++) {
			if (usuarios.get(i).getNombre().equals(usuario.getNombre())) {
				valor = true;
			}
		}
		if (valor == false) {
			usuarios.add(usuario);
		}
	}
	
	/**
	 * <p> método que loguea a un usuario en el sistema
	 * </p>
	 * @param usuario existente
	 */
	@Override
	public void login(String nombre) {
		boolean valor = false;
		
		for (int i=0; i<usuarios.size(); i++) {
			if (usuarios.get(i).getNombre().equals(nombre)) {
				valor = true;
			}
		}
		if (valor == true) {
			log = nombre;
		}
		else {
			System.out.println("El usuario no existe");
		}
	}
	
	/**
	 * <p> desloguea al usuario logueado
	 * </p>
	 * @param null
	 */
	@Override
	public void logout() {
		log = "";
	}
	
	/**
	 * <p> fija una unidad con la cual trabajar en el sistema
	 * </p>
	 * @param letra del drive al cual fijar
	 */
	@Override
	public void switchDrive(String letra) {
		if (log != "" && log != null) {
			boolean valor = false;
			for (int i=0; i<drives.size(); i++) {
				if (drives.get(i).getLetra().equals(letra)) {
					valor = true;
				}
			}
			if (valor == true) {
				ruta = letra + ":/";
				raiz = letra;
			}
			else {
				System.out.println("El drive no existe");
			}
			
		}
		else {
			System.out.println("No hay usuario logueado");
		}
	}
	
	/**
	 * <p> crea una carpeta y la añade al arraylist del sistema
	 * </p>
	 * @param Nombre de la carpeta y sus 2 atributos de seguridad. Añade usuario y ruta internamente
	 */
	@Override
	public void mkdir(String nombre, char atr1, char atr2) {
		
		boolean valor = false;
		Folder_21209320_CardenasRueda carpeta = new Folder_21209320_CardenasRueda(nombre, atr1, atr2);
		
		carpeta.setRuta(ruta);
		carpeta.setUsuario(log);
		
		for (int i=0; i<carpetas.size(); i++) {
			if (carpetas.get(i).getNombre().equals(carpeta.getNombre()) && carpetas.get(i).getRuta().equals(carpeta.getRuta())) {
				valor = true;
			}
		}
		if (valor == false) {
			carpetas.add(carpeta);
		}
		
	}
	
	/**
	 * <p> permite cambiarse del directorioa ctual mediante comandos. SOLO PUEDE AVANZAR A DIRECTORIOS ACTUALMENTE VISIBLES
	 * </p>
	 * @param comando "..", "/", o un folder actualmente visible
	 */
	@Override
	public void cd(String comando) {
		
		String nuevaRuta = "";
		
		if (comando.equals("/")) {
			ruta = raiz + ":/";
		}else if (comando.equals("..")) {
			String[] aux = ruta.split("/");
			for (int j=0; j<(aux.length-1); j++) {
				nuevaRuta = nuevaRuta + aux[j] + "/"; 
			}
			ruta = nuevaRuta;
		}else {
			for (int i=0; i<carpetas.size(); i++) {
				if (carpetas.get(i).getNombre().equals(comando) && carpetas.get(i).getRuta().equals(ruta)) {
					ruta = ruta + comando + "/";
				}
			}
		}
	}
	
	/**
	 * <p> Imprime por consola el sistema actual, con todas sus modificaciones hechas hasta el momento
	 * </p>
	 * @param null
	 */
	@Override
	public void getSistema() {
		System.out.println("Sistema: " + "\n" + nombre + "\n");
		System.out.println("Drives: ");
		if (drives!=null) { //Esto evita problemas si el array está vacío
			for (int i=0; i<drives.size(); i++) {
				System.out.println(drives.get(i).getLetra() + ", " + drives.get(i).getNombre() + ", " + drives.get(i).getAlmacenamiento());
			}
		}
		System.out.println();
		System.out.println("Usuarios: ");
		if (usuarios!=null) { //Esto evita problemas si el array está vacío
			for (int i=0; i<usuarios.size(); i++) {
				System.out.println(usuarios.get(i).getNombre());
			}
		}
		System.out.println();
		System.out.println("Log: " + "\n" + log + "\n");
		System.out.println("Carpetas: ");
		if (carpetas!=null) {
			for (int i=0; i<carpetas.size(); i++) {
				System.out.println(carpetas.get(i).getNombre() + ", " + carpetas.get(i).getRuta() + ", " + carpetas.get(i).getUsuario() + ", " + carpetas.get(i).getAtr1() + ", " + carpetas.get(i).getAtr2());
			}
		}
		System.out.println();
		System.out.println("Ruta: " + "\n" + ruta + "\n");
	}
}

