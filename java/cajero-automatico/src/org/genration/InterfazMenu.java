package org.genration;

import java.util.Scanner;

public class InterfazMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Elija una de las siguientes opciones");
		System.out.println("	Escriba 1 para consultar saldo");
		System.out.println("	Escriba 2 para Ingresar dinero ");
		System.out.println("	Escriba 3 para sacar dinero");
		System.out.println("	Escriba 4 para consultar sus ultimos movimientos");
		
		
		Scanner scanner = new Scanner(System.in);
		
		int opcionSeleccionada = scanner.nextInt();
		System.out.println("La opcion que seleccionaste es "+ opcionSeleccionada);
		
	}

}
