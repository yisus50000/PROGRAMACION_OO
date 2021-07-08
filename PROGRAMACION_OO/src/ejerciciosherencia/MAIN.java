package ejerciciosherencia;

import java.util.Scanner;

public class MAIN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println("Ingrese dos numeros:"); //mi teclado
	Scanner teclado = new Scanner(System.in);
	int A = teclado.nextInt();
	//System.out.println("primer numero ingresado:"+A);
	int B = teclado.nextInt();
	//System.out.println("segundo numero ingresado:"+B);
	int S = A+B;
	int R = A-B;
	int P = A*B;
	System.out.println("La suma es:"+ S);
	System.out.println("La resta es:"+ R);
	System.out.println("El producto es:"+ P);
	}
	
}
