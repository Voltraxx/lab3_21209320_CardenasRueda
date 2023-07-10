package lab3_21209320_CardenasRueda;

import java.util.ArrayList;

public class FileSystem_21209320_CardenasRueda implements FileSystem_interfaz_21209320_CardenasRueda{

	String nombre;
	ArrayList<Drive_21209320_CardenasRueda> drives;
	
	public FileSystem_21209320_CardenasRueda() {
	}
	
	public FileSystem_21209320_CardenasRueda(String nombre) {
		this.nombre = nombre;
		this.drives = new ArrayList<>();
	}
	
	public void addDrive(Drive_21209320_CardenasRueda drive) {
		
		boolean valor = false;
		
		for (int i=0; i<drives.size(); i++) {
			if (drives.get(i).getLetra() == drive.letra) {
				valor = true;
			}
		}
		if (valor == false) {
			drives.add(drive);
		}
	}
	
	@Override
	public void getSistema() {
		System.out.println("Sistema: " + nombre);
		System.out.print("Drives: ");
		for (int i=0; i<drives.size(); i++) {
			System.out.println(drives.get(i).getLetra() + "," + drives.get(i).getNombre() + "," + drives.get(i).getAlmacenamiento());
		}
	}
	
}
