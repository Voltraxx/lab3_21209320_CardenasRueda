package lab3_21209320_CardenasRueda;

import java.util.ArrayList;

public class FileSystem_21209320_CardenasRueda implements FileSystem_interfaz_21209320_CardenasRueda{

	String nombre;
	ArrayList<Drive_21209320_CardenasRueda> drives;
	ArrayList<User_21209320_CardenasRueda> usuarios;
	String log = "";
	
	public FileSystem_21209320_CardenasRueda() {
	}
	
	public FileSystem_21209320_CardenasRueda(String nombre) {
		this.nombre = nombre;
		this.drives = new ArrayList<>();
		this.usuarios = new ArrayList<>();
	}
	
	public void addDrive(String letra, String name, int almacenamiento) {
		
		boolean valor = false;
		Drive_21209320_CardenasRueda drive = new Drive_21209320_CardenasRueda(letra, name, almacenamiento);
		
		for (int i=0; i<drives.size(); i++) {
			if (drives.get(i).getLetra() == drive.letra) {
				valor = true;
			}
		}
		if (valor == false) {
			drives.add(drive);
		}
	}
	
	public void register(String nombre) {
		
		boolean valor = false;
		User_21209320_CardenasRueda usuario = new User_21209320_CardenasRueda(nombre);
		
		for (int i=0; i<usuarios.size(); i++) {
			if (usuarios.get(i).getNombre() == usuario.nombre) {
				valor = true;
			}
		}
		if (valor == false) {
			usuarios.add(usuario);
		}
	}
	
	public void login(String nombre) {
		boolean valor = false;
		
		for (int i=0; i<usuarios.size(); i++) {
			if (usuarios.get(i).getNombre() == nombre) {
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
	public void getSistema() {
		System.out.println("Sistema: " + nombre);
		System.out.println();
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
		System.out.println("Log: ");
		System.out.println(log);
	}
	
}
