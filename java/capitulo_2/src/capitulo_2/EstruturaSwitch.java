package capitulo_2;

import java.util.Scanner;

public class EstruturaSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in); 
		System.out.println("Introduce el dia de la semana en la que quiere su cita");
		String dia = scanner.nextLine();
		
		switch (dia) { 
			 
		case "lunes" :
			System.out.println("El dia que venga esta bien");
			break;
			
		case "martes" :
			System.out.println("El dia que venga esta bien");
			break;
		case "Miercoles" :
			System.out.println("El dia que venga esta bien");
			break;
		case "Jueves" :
			System.out.println(" Esta lleno");
			break;
		case "Viernes" :
			System.out.println("Salgo temprano");
			break;
		case "Sabado" :
			System.out.println("Esta cerrado");
			break;
		case "Domiingo" :
			System.out.println("Esta cerrado");
			break;
		default:
			System.out.println("No es correcto el dia vuelva hacerlo");
		
		}
		
		


	}

}
