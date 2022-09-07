
package capitulo_2;
import java.util.Scanner;

 
public class LaSentenciaIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		int numeroPensado = 5;
		System.out.println("Adivina el numero que estoy pensando del 1 al 10");
		int numeroIntroducido = scanner.nextInt();
		
		String color;
		if (numeroIntroducido == numeroPensado) {
			color = "\003[0;32m";
			System.out.println(color+" !En hora buena¡");
		}
		else {
			color = "\033[0;31m";
			System.out.println(color+ " Lo sentimos, el numero que estaba pensando es el "+ numeroPensado);
			
		}

	}

}
