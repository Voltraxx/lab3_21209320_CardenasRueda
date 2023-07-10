package lab3_21209320_CardenasRueda;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String nombre = scanner.nextLine();
		
		Console_21209320_CardenasRueda consola = new Console_21209320_CardenasRueda();
		
		consola.imprimirOpciones();
		int aux = consola.ingresarOpcion();
		
		switch(aux) {
		case 1:
			FileSystem_21209320_CardenasRueda sistema = new FileSystem_21209320_CardenasRueda(nombre);
			Drive_21209320_CardenasRueda drive = new Drive_21209320_CardenasRueda("C", "Hola", 1000);
			sistema.addDrive(drive);
			Drive_21209320_CardenasRueda drive2 = new Drive_21209320_CardenasRueda("D", "Hola", 1000);
			sistema.addDrive(drive2);
			Drive_21209320_CardenasRueda drive3 = new Drive_21209320_CardenasRueda("C", "Hola", 1000);
			sistema.addDrive(drive3);
			Drive_21209320_CardenasRueda drive4 = new Drive_21209320_CardenasRueda("C", "Hola", 1000);
			sistema.addDrive(drive4);
			sistema.getSistema();
			break;
		case 0:
			System.out.print("Ha salido del programa");
			break;
		default:
			System.out.print("Esa opci�n no es v�lida");
		}
		scanner.close();
		
	}
}