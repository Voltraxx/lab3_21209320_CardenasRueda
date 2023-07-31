package lab3_21209320_CardenasRueda;

import java.util.ArrayList;

/**
 * Entidad principal que representa al sistema de archivos del OS. Almacena todos los datos relativos a las otras entidades
 */
public class FileSystem_21209320_CardenasRueda implements FileSystem_interfaz_21209320_CardenasRueda{

	String nombre;
	String ruta = ""; 
	String raiz = ""; 
	ArrayList<Drive_21209320_CardenasRueda> drives; 
	ArrayList<User_21209320_CardenasRueda> usuarios; 
	ArrayList<Folder_21209320_CardenasRueda> carpetas; 
	String log = "";
	
	/**
	 * <p> Constructor de sistema (vacío)
	 * </p>
	 * @param null
	 */
	public FileSystem_21209320_CardenasRueda() {
	}
	
	/**
	 * <p> Constructor de la presente clase FileSystem. Este constructor es una sobrecarga del método constructor y crea un sistema dado un nombre
	 * </p>
	 * @param nombre (String) > nombre del sistema a crear
	 */
	public FileSystem_21209320_CardenasRueda(String nombre) {
		this.nombre = nombre;
		this.drives = new ArrayList<>();
		this.usuarios = new ArrayList<>();
		this.carpetas = new ArrayList<>();
	}
	
	@Override
	/**
	 * <p> Método para añadir un drive a un sistema respetando que sea único
	 * </p>
	 * @param letra (String) > Letra del drive
	 * @param name (String) > Hace referencia al nombre del drive
	 * @param almacenamiento (String) > capacidad de almacenamiento de una unidad drive
	 * @return void
	 */
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
	
	@Override
	/**
	 * <p> Método para registrar un usuario en el sistema respetando que no exista este anteriormente
	 * </p>
	 * @param nombre (String) > Nombre del usuario a registrar
	 * @return void
	 */
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
	
	@Override
	/**
	 * <p> Método para loguearse en un usuario YA EXISTENTE
	 * </p>
	 * @param nombre (String) > Nombre del usuario al cual loguearse
	 * @return void
	 */
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
	
	@Override
	/**
	 * <p> Método para desloguearse de un usuario
	 * </p>
	 * @param null
	 * @return void
	 */
	public void logout() {
		log = "";
	}
	
	@Override
	/**
	 * <p> Método para fijar una unidad drive EXISTENTE en la cual realizar acciones
	 * </p>
	 * @param letra (String) > Letra del drive a fijar
	 * @return void
	 */
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
	
	@Override
	/**
	 * <p> Método para crear una carpeta en la dirección actual
	 * </p>
	 * @param nombre (String) > Nombre de la carpeta a crear
	 * @param atr1 (char) > atributo de seguridad de la carpeta a crear
	 * @param atr2 (char) > atributo de seguridad de la carpeta a crear
	 * @return void
	 */
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
	
	@Override
	/**
	 * <p> Método para cambiar de directorio en el sistema (cambiar de ruta)
	 * </p>
	 * @param comando > comando para dirigirse a una nueva dirección (".." para devolverse, "/" para ir a raiz, "nombreArchivo" para dirigirse a la dirección de "nombreArchivo")
	 * @return void
	 */
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

