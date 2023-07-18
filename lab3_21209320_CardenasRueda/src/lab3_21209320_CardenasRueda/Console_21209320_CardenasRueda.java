package lab3_21209320_CardenasRueda;

import java.util.Scanner;

/**
 * 
 * @author juanp
 *
 * Esta clase funciona como la consola para interactuar con el usuario
 *
 */
public class Console_21209320_CardenasRueda {
	
	Scanner scanner = new Scanner(System.in); //scanner para introducir inputs del usuario
	int opcionInt; //almacena datos int del scanner
	String opcionStr; //almacena datos String del usuario
	FileSystem_21209320_CardenasRueda sistema; //objeto de tipo filesystem
	
	/**
	 * <p> Imprime las operaciones principales del sistema
	 * </p>
	 * 
	 * @param null
	 */
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
	
	/**
	 * <p> Imprime las operaciones secundarias del sistema si este elige la opcion 2 del menu principal
	 * </p>
	 * 
	 * @param null
	 */
	public void imprimirOpcionesEdit() {
		System.out.println("1.- Añadir drive");
		System.out.println("2.- Añadir usuario");
		System.out.println("3.- Log in");
		System.out.println("4.- Log out");
		System.out.println("5.- Fijar unidad");
		System.out.println("6.- Crear carpeta");
		System.out.println("7.- Moverse a carpeta");
	}
	
	/**
	 * <p> Ejecuta un comando para que el usuario pueda digitar su input y así trabajar en el sistema
	 * </p>
	 * 
	 * @param null
	 */
	public void ingresarOpcion() {
		do{
			imprimirOpciones();
			System.out.print("Ingrese su opción: ");
			opcionInt = scanner.nextInt();
			switch(opcionInt) {
			case 1:
				System.out.print("Ingrese el nombre: ");
				opcionStr = scanner.next();
				sistema = new FileSystem_21209320_CardenasRueda(opcionStr);
				scanner.nextLine(); //Esto limpia el scanner
				System.out.println("Se creó el sistema de nombre " + opcionStr);
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
					System.out.println("Se creó el drive " + letra + ", " + name + ", " + almacenamiento + "\n");
					break;
				case 2:
					System.out.print("Ingrese nombre: ");
					String nameUser = scanner.next();
					scanner.nextLine();
					sistema.register(nameUser);
					System.out.println("Se creó el usuario " + nameUser + "\n");
					break;
				case 3:
					System.out.print("Ingrese usuario: ");
					String Username = scanner.next();
					scanner.nextLine();
					sistema.login(Username);
					System.out.println("Se logueó " + Username + "\n");
					break;
				case 4:
					sistema.logout();
					System.out.println("Se deslogueó el usuario\n");
					break;
				case 5:
					System.out.print("Ingrese letra del drive: ");
					String letraD = scanner.next();
					scanner.nextLine();
					sistema.switchDrive(letraD);
					System.out.println("Se fijó el drive " + letraD + "\n");
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
					System.out.println("Se creó la carpeta " + nombreC + " con atributos " + atr1 + ", " + atr2 + "\n");
					break;
				case 7:
					System.out.print("Ingrese comando: ");
					String comando = scanner.next();
					scanner.nextLine();
					sistema.cd(comando);
					System.out.println("Se ha cambiado el directorio\n");
				default:
					System.out.println("No existe esa opción\n");
					break;
				}
				break;
			case 3:
				sistema.getSistema();
				break;
			case 0:
				System.out.println("Se ha cerrado el programa\n");
				break;
			default:
				System.out.println("No existe esa opción\n");
				break;
			}
		}while(opcionInt!=0);
	}
}