package capitulo_2;
import java.math.BigDecimal;
import java.util.Scanner;


/* El programa que pida pantalla introducir una cantida en pesos y devuleva la conversion en USA
 * ose que pesos equivale a US dolares.
 * 
 * */
public class Conversor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Bien venida al conversor de moneda");
		System.out.println("Intrudduce una cantida en pesos te devolvera la cantidad equivalente ensca dolares USA");
		
		Scanner scanner = new Scanner(System.in);
		
		double pesos = scanner.nextDouble();
		
		double dolares = 0.05*pesos;
		
		System.out.println(pesos + "pesos equivale a " + dolares + "US dolares");
		
		String pesosString = Double.toString(pesos);
		BigDecimal pesosBigDecimal = new BigDecimal(pesosString);
		double tasaDeCambio = 0.05;
		String tasaDeCambioBigString =  Double.toString(tasaDeCambio);
				
		
		BigDecimal tasaDeCambioBigDecimal = new BigDecimal (tasaDeCambioBigString);
		BigDecimal doaresBigDecimal = pesosBigDecimal.multiply(tasaDeCambioBigDecimal);
		
		
		
		
		

		
		
		
		
		
	
		 
		
		

	}

}
