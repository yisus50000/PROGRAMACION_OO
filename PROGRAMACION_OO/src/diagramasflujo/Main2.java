package diagramasflujo;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    System.out.println("Multiplo");
		System.out.println("Digite dos números:");
		Scanner teclado = new Scanner(System.in);
		int A = teclado.nextInt();	
		int B = teclado.nextInt();
		int M = A%B;
 		if(M==0) {
		System.out.println(A + " Es multiplo de: " + B);	
		}
		else {
		System.out.println(A + " No es multiplo de: " + B );	
		}
		}

	}


