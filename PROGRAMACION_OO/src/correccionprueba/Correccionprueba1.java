package correccionprueba;

import java.util.Scanner;

public class Correccionprueba1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner teclado = new Scanner(System.in);
	int S = 0;
	int N = 0;
	int C=0;
	double P=0;
	for (int i=1;i!=0;i++) {
	System.out.println("Digite un número positivo:");	
	N = teclado.nextInt();
    if (N==0) {
		i=-1;
	} else {
		S=S+N;
		P=S/i;
		C=C+1;
	}
	}	
	System.out.println("La suma es: "+S);
	System.out.println("El promedio es: "+P);
	System.out.println("La cantidad es: " +C);
 }
}


