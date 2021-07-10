package diagramas.de.flujo;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println("Digite un número:");
    Scanner teclado = new Scanner(System.in);
    int N =teclado.nextInt();
    for(int C=N+1;C<=N+5;C++) {
    System.out.println("El siguiente número: " + C);
    }
    System.out.println("Se ha finalizado la impresion de los 5 números");
    }
}
