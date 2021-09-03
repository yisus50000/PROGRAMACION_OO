package ejercicio.prueba;

import java.util.Scanner;

public class BancoPichincha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int N;
		do {
			System.out.println("*Banco del Pichincha*");
			System.out.println("Seleccione una opción: ");
			System.out.println("1. Retirar dinero ");
			System.out.println("2. Cambiar clave ");
			System.out.println("3. Bloquear Cuenta ");
			System.out.println("4. Salir ");
			N = teclado.nextInt();
			if (N == 1) {
				System.out.println("Ingrese el valor a retirar: ");
				int M = teclado.nextInt();
				System.out.println("El valor a retirar es: " + M);
			} else if (N == 2) {
				System.out.println("Ingrese su nueva clave solo digitos: ");
				int C = teclado.nextInt();
				System.out.println("Su clave a sido cambiada con exito");
			}
			if (N == 3) {
				System.out.println("Su cuenta a sido bloqueada");
			}
		} while (N != 4);
		System.out.println("Gracias por visitarnos");
	}
}