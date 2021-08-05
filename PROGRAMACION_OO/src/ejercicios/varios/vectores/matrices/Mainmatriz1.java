package ejercicios.varios.vectores.matrices;

import java.util.Scanner;

public class Mainmatriz1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    //Declare una matriz A [3][4] y desarrolle un programa que vaya solicitando
	//cada una de sus posiciones
	System.out.println("Ingrese la longitud de la fila: " );
	Scanner lector = new Scanner(System.in);
	int longitudfilas = lector.nextInt();
	System.out.println("Ingrese la longitud de la columna: " );
	int longitudcolumnas = lector.nextInt();
	char A[][] = new char[longitudfilas][longitudcolumnas];
	for (int fila=0; fila<longitudfilas; fila++) {
	for (int columna=0; columna<longitudcolumnas; columna++) {
	System.out.println("Ingrese el valor de la fila: " +fila+ " y la columna: " + columna);
	char N = lector.next().charAt(0); 
	A[fila][columna]=N;		
	}	
	}
	System.out.println("Imprimimos la matroz: ");
	for (int fila=0; fila<longitudfilas; fila++) {
	for (int columna=0; columna<longitudcolumnas; columna++) {	
	System.out.print(A[fila][columna] + " ");	
	}
	System.out.println();
}
}
}