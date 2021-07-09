package diagramasflujo;

import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println("Digite su sueldo:");
	Scanner teclado = new Scanner(System.in);
	int A = teclado.nextInt();
	if (A<300) {
	System.out.println("Su sueldo neto es: " + (A + 100));
	}
	else if (A>=400){
	System.out.println("Su sueldo neto es: " + (A + 50));	
	}
	else { 
	System.out.println("Su sueldo neto es: " + (A + 70));
    }
}
}