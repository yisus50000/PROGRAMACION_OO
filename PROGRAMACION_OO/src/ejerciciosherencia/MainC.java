package ejerciciosherencia;

import java.util.Scanner;

public class MainC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int A = teclado.nextInt();
		if(A==1) {
		//SI
		System.out.println("N�mero correcto");
		}else {
		//NO
		System.out.println("N�mero incorrecto");
		System.out.println("El n�mero es:" + A);
	}
}
}
