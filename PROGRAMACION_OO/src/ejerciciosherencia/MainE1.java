package ejerciciosherencia;

import java.util.Scanner;

public class MainE1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ingrese su Sueldo:");
		Scanner teclado = new Scanner(System.in);
		int A = teclado.nextInt();
		int B = 40;
		if(A<=300) {
		//SI
		System.out.println("Su Bono es:" + B);
		}else {
		//NO
	    System.out.println("Usted no recibira bono");
	}
	}
	}

