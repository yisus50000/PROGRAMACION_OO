package whilee;

import java.util.Scanner;

public class Prueba2while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner teclado = new Scanner(System.in);
		int N=0;
		int Sp=0;
		int Si=0;
		int C=0; 
		double P=0;
		do { 
		System.out.println("Digite un número positivo: ");
		N=teclado.nextInt();		
		if (N%2==0) {
		Sp=Sp+N;
		}
		else {
			Si=Si+N;
			C=C+1;
			P=Si/C;	
		}
		}		
        while (N!=-1);
		System.out.println("La suma de los pares es: "+ Sp);
		System.out.println("El promedio de los impares es: "+ P);
	}
	
	}


