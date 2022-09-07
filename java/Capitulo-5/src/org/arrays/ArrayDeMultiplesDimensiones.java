package org.arrays;

public class ArrayDeMultiplesDimensiones {

	public static void main(String[] args) {
		
		
		int miArrayDeUnaDemensiones[] = new int[20];
		int miArrayDeDosDemensiones[][] = new int[10][20];
		int miArrayDeTresDemensiones[][] []= new int[5][15][20];
		
		int tablaDeMultiplicar[][] = new int [10][10];
		
		for (int i =0; i < 10; i++) {
			for ( int j =0; j < 10; j++) {
				tablaDeMultiplicar[i][j] = i*j;
			}
		}
		
		System.out.println("El resultado de multiplicarn 4 por 5 " + tablaDeMultiplicar[4][5] );
		
		

	}

}
