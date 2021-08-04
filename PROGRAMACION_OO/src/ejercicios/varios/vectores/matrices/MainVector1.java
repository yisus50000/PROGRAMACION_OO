package ejercicios.varios.vectores.matrices;

import java.util.Scanner;

public class MainVector1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    //Declare un vector X[3] y construya  un programa que pida al usuario ingrese los valores para cada posicion
	//y finalmente que se imprima todos los valores ingresados
	char X[] = new char[3];
	for (int i=0;i<3;i++) {
	System.out.println("Ingrese valor de la posicion: " + i);
	Scanner teclado = new Scanner(System.in);
	char N = teclado.next().charAt(0);
	X[i]=N;
	}
	for (int i =0;i<3;i++) {
	System.out.println("El valor de la posicion " + i);
	System.out.println(X[i]);
	}
	}
}
