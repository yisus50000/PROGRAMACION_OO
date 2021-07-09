package diagramasflujo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println("Dvision");
	System.out.println("Digite dos números:");
	Scanner teclado = new Scanner(System.in);
	int A = teclado.nextInt();	
	int B = teclado.nextInt();
	if(B==0) {
	System.out.println("No se puede dividir entre o");	
	}
	else {
	System.out.printf("La división es:" + A/B );	
	}
	}

}
