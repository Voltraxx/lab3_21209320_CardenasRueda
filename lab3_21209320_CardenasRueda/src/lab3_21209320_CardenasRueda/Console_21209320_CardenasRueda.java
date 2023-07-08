package lab3_21209320_CardenasRueda;

import java.util.Scanner;

public class Console_21209320_CardenasRueda {
	
	// Atributos
	
	Scanner scanner = new Scanner(System.in);
	int opcion;
	
	// Métodos
	
	
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
	
	public int ingresarOpcion(){
		System.out.print("Ingrese su opción: ");
		opcion = scanner.nextInt();
		scanner.close();
		return opcion;
	}
}
