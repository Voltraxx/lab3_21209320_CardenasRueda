package lab3_21209320_CardenasRueda;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("## Bienvenido al menú del sistema ##");
		System.out.println();
		System.out.println("Selecciona tu opción indicando únicamente el número:");
		System.out.println();
		System.out.println("1.- Crear un sistema");
		System.out.println("2.- Editar el sistema");
		System.out.println("3.- Imprimir el sistema");
		System.out.println();
		System.out.println("Escoja la opción: ");
		
		int opcion = scanner.nextInt();
		
		switch(opcion) { //Se tiene pensado hacer switch para las distintas opciones
		case 1:
			break;
		}
		
		scanner.close();
		
	}

}
