package lab3_21209320_CardenasRueda;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("## Bienvenido al men� del sistema ##");
		System.out.println();
		System.out.println("Selecciona tu opci�n indicando �nicamente el n�mero:");
		System.out.println();
		System.out.println("1.- Crear un sistema");
		System.out.println("2.- Editar el sistema");
		System.out.println("3.- Imprimir el sistema");
		System.out.println();
		System.out.println("Escoja la opci�n: ");
		
		int opcion = scanner.nextInt();
		
		switch(opcion) { //Se tiene pensado hacer switch para las distintas opciones
		case 1:
			break;
		}
		
		scanner.close();
		
	}

}
