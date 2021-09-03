package whilee;

import java.util.Scanner;

public class Prueba1while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int N = -1;
		int S = 0;
		int i = 1;
		int C = 0;
		double P = 0;
		while (N != 0) {
			System.out.println("Digite un número positivo:");
			N = teclado.nextInt();
			i++;
			S = S + N;
			P = S / i;
			C = C + 1;
		}
		System.out.println("La suma es: " + S);
		System.out.println("El promedio es: " + P);
		System.out.println("La cantidad es: " + C);
	}
}
