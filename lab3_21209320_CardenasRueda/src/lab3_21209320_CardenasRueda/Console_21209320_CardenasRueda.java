package lab3_21209320_CardenasRueda;

import java.util.Scanner;

public class Console_21209320_CardenasRueda {
	
	// Atributos
	
	Scanner scanner = new Scanner(System.in);
	int opcion;
	
	// M�todos
	
	
	public void imprimirOpciones() {
		
		System.out.println("## Bienvenido al men� del sistema ##");
		System.out.println();
		System.out.println("Selecciona tu opci�n indicando �nicamente el n�mero:");
		System.out.println();
		System.out.println("1.- Crear un sistema");
		System.out.println("2.- Editar el sistema");
		System.out.println("3.- Imprimir el sistema");
		System.out.println("0.- Cerrar la consola de selecci�n de opciones");
		System.out.println();
	}
	
	public int ingresarOpcion(){
		System.out.print("Ingrese su opci�n: ");
		opcion = scanner.nextInt();
		scanner.close();
		return opcion;
	}
}
