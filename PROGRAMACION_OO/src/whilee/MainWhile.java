package whilee;

import java.util.Scanner;

public class MainWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Digite un n�mero positivo: ");
		Scanner teclado = new Scanner(System.in);
		int N=teclado.nextInt();
		while (N!=0) {
		System.out.println("Digite un n�mero positivo: ");
		N=teclado.nextInt();
		}
	}

}

