package ejercicios.varios.vectores.matrices;

public class MainMatriz2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    //2. dessarrolar un programa que imprima la siguiente imagen 
	char A[][] = new char[5][5];
	for (int fila=0; fila<5; fila++) {
	for (int columna=0; columna<5; columna++) {
	if (fila==columna) {
	A[fila][columna]=1;
	}
	else {
	A[fila][columna]=0;
	}
	System.out.print(A[fila][columna] + " ");
	}
	System.out.println();
    }
	}
}
