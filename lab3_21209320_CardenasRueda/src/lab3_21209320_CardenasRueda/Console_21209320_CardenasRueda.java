package lab3_21209320_CardenasRueda;

import java.util.Scanner;

public class Console_21209320_CardenasRueda {
	
	Scanner scanner = new Scanner(System.in);
	int opcionInt;
	String opcionStr;
	FileSystem_21209320_CardenasRueda sistema;
	
	public void imprimirOpciones() {
		System.out.println("## Bienvenido al menú del sistema ##");
		System.out.println();
		System.out.println("Selecciona tu opción indicando únicamente el número:");
		System.out.println();
		System.out.println("1.- Crear un sistema");
		System.out.println("2.- Editar el sistema");
		System.out.println("3.- Imprimir el sistema");
		System.out.println("0.- Cerrar la consola de selección de opciones");
		System.out.println();
	}
	
	public void imprimirOpcionesEdit() {
		System.out.println("1.- Añadir drive");
		System.out.println("2.- Añadir usuario");
		System.out.println("3.- Log in");
		System.out.println("4.- Log out");
		System.out.println("5.- Fijar unidad");
		System.out.println("6.- Crear carpeta");
		System.out.println("7.- Moverse a carpeta");
	}
	
	public void ingresarOpcion() {
		do{
			imprimirOpciones();
			System.out.print("Ingrese su opción: ");
			opcionInt = scanner.nextInt();
			switch(opcionInt) {
			case 1:
				System.out.print("Ingrese el dato: ");
				opcionStr = scanner.next();
				sistema = new FileSystem_21209320_CardenasRueda(opcionStr);
				scanner.nextLine(); //Esto limpia el scanner
				break;
			case 2:
				imprimirOpcionesEdit();
				System.out.print("Ingrese su opción: ");
				opcionInt = scanner.nextInt();
				switch(opcionInt) {
				case 1:
					System.out.print("Ingrese letra: ");
					String letra = scanner.next();
					scanner.nextLine();
					System.out.print("Ingrese nombre: ");
					String name = scanner.next();
					scanner.nextLine();
					System.out.print("Ingrese almacenamiento: ");
					int almacenamiento = scanner.nextInt();
					sistema.addDrive(letra, name, almacenamiento);
					break;
				case 2:
					System.out.print("Ingrese nombre: ");
					String nameUser = scanner.next();
					scanner.nextLine();
					sistema.register(nameUser);
					break;
				case 3:
					System.out.print("Ingrese usuario: ");
					String Username = scanner.next();
					scanner.nextLine();
					sistema.login(Username);
					break;
				case 4:
					sistema.logout();
					break;
				case 5:
					System.out.print("Ingrese letra del drive: ");
					String letraD = scanner.next();
					scanner.nextLine();
					sistema.switchDrive(letraD);
					break;
				case 6:
					System.out.print("Ingrese nombre: ");
					String nombreC = scanner.next();
					scanner.nextLine();
					System.out.print("Ingrese atributo 1: ");
					char atr1 = scanner.next().charAt(0);
					System.out.print("Ingrese atributo 2: ");
					char atr2 = scanner.next().charAt(0);
					sistema.mkdir(nombreC, atr1, atr2);
					break;
				default:
				}
				break;
			case 3:
				sistema.getSistema();
				break;
			case 0:
				System.out.println("Se ha cerrado el programa");
			}
		}while(opcionInt!=0);
	}
}