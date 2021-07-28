package correccionprueba;

import java.util.Scanner;

public class Correccionprueba2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner teclado = new Scanner(System.in);
 int N=0;
 int Sp=0;
 int Si=0;
 int C=1; 
 double P=0;
 for(int i=1;i!=-1;i++) {	
	System.out.println("Digite un número positivo: ");
	N=teclado.nextInt();
	if(N==-1) {
	i=-2;
	} 
	if(N%2==0) 
	{
	Sp=Sp+N;
	} 
	else {
	Si=Si+N;
	C=C+1;
	P=Si/C;
	}	
	}	
	System.out.println("La suma de los pares es: "+ Sp);
	System.out.println("El promedio de los impares es: "+ P);
} 
}
 

