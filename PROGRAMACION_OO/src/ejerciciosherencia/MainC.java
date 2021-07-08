package ejerciciosherencia;

import java.util.Scanner;

public class MainC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int A = teclado.nextInt();
		if(A==1) {
		//SI
		System.out.println("Número correcto");
		}else {
		//NO
		System.out.println("Número incorrecto");
		System.out.println("El número es:" + A);
	}
}
}
