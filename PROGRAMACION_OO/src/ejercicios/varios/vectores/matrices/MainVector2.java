package ejercicios.varios.vectores.matrices;

import java.util.Scanner;

public class MainVector2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declare un vector X cuya longitud se soliticite al usuario de typo int y comstruya un programa que pida al
		//usuario que pida al usuario que ingrese los valores para cada posicion 
		// y finalmente que se impriman todos los valores ingresados
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese la longitud del vector:");
		int N = teclado.nextInt();
		int X[] = new int[N];		
		for (int i=0;i<N;i++) {
		System.out.println("Ingrese valor de la posicion: " + i);
		Scanner lector = new Scanner(System.in);
		int M = lector.nextInt();
		X[i]=M;
	}
		for (int i=0;i<N;i++) {
		System.out.println("El valor de la posicion " + i);
	    System.out.println(X[i]);	
}
}
}