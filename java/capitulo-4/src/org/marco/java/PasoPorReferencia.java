package org.marco.java;

public class PasoPorReferencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int variable1 = 23;
		int variable2 = variable1;
		 System.out.println("El valor de varible "+ variable1);
		 System.out.println("El valor de varible "+ variable2);
		 
		 CuentaBancaria cuentaDeJuan = new CuentaBancaria();
		 cuentaDeJuan.saldo = 23_000;
		 
		 CuentaBancaria cuentaDeAna = cuentaDeJuan;
		 cuentaDeAna.saldo = 10_000;
		 
		 
		 System.out.println("Saldo Juan: " + cuentaDeJuan.saldo);
		 System.out.println("Saldo Juan: " + cuentaDeAna.saldo);
		 
	}

}
