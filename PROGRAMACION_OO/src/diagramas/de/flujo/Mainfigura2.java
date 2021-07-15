package diagramas.de.flujo;

import java.util.Scanner;

public class Mainfigura2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ingrese un número: ");
		Scanner teclado = new Scanner(System.in);
		int n =teclado.nextInt();
		for(int fila = n; fila>=1; fila = fila -1) {
		for (int ast = fila; ast>=1; ast = ast -1) {
		System.out.print("*");	
		}
	    System.out.println();
	}

	}

}
