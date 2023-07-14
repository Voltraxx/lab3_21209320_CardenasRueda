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
			sistema.addDrive("C", "Primer Drive", 1000000);
			sistema.addDrive("D", "Segundo Drive", 200000);
			sistema.addDrive("E", "Tercer Drive", 1000000);
			sistema.addDrive("C", "Este drive no debería agregarse", 1000); //No debería agregarlo
			sistema.register("Primer Usuario");
			sistema.register("Usuario2");
			sistema.register("Primer Usuario"); //No debería agregarlo
			sistema.register("Usuario 5555");
			sistema.login("Primer Usuario");
			sistema.switchDrive("D");
			sistema.getSistema();
			break;
		case 0:
			System.out.print("Ha salido del programa");
			break;
		default:
			System.out.print("Esa opción no es válida");
		}
		scanner.close();
		
	}
}