package fecha.de.nacimiento;

import java.util.Scanner;

public class Edad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println("------EDAD-----");
	System.out.println("INGRESE SU FECHA DE NACIMIENTO: ");
	Scanner teclado = new Scanner(System.in);
	System.out.println("D�a: ");
	int A = teclado.nextInt();
	System.out.println("Mes: ");
	int B = teclado.nextInt();
	System.out.println("A�o: ");
	int C = teclado.nextInt(); 
	System.out.println("INGRESE SU FECHA ACTUAL: ");
	System.out.println("D�a: ");
	int D = teclado.nextInt();
	System.out.println("Mes: ");
	int E = teclado.nextInt();
	System.out.println("A�o: ");
	int F = teclado.nextInt();
	int G = F-C;
	int H = E-B;
	int I = D-A;
	System.out.println("Su edad es: "+G+" a�os "+H+" meses " + I + " dias");
    
    }
	}

}
