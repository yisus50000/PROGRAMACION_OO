package ejercicios.vectores;

public class MainVectores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    //1. Declarar mi vector [10] de tipo int 
	int mivector[] = new int[10];
	
	//2. Declarar mi vector [5] de tipo char 
	char mivector1[] = new char[5];
	
	//3. Declarar un vector mivec[4] de tipo char y asignamos la letra A a la posicion 0 y 2  
	char mivec[] = new char[4];
	mivec[0]='A';
	mivec[2]='A';
	
	//4. Declarar un vector mivec1[3] de tipo byte y asignamos el numero 0 a la posicion 0,1,2 y 3
	byte mivec1[] = new byte[3];
	//Esta es una mala asignacion por que esta fuera de rango la posicion 3
	mivec1[0] = 0;
	mivec1[1] = 0;
	mivec1[2] = 0;
	
	//5. Declarar un vector mivec2[3] de tipo char y asignamos la letra A a las posiciones 0 y 1; y a la posicion 2 la letra B
	//Finalmente imprimir las poisiciones 0 y 2
	char mivec2[] = new char[3];
	mivec2[0] = 'A';
	mivec2[1] = 'A';
	mivec2[2] = 'B';
	System.out.println("Impresion 1: " + mivec2[0]);
	mivec2[0] = 'Z';
	System.out.println("Impresion 1: " + mivec2[0]);
	System.out.println("Impresion 2: " + mivec2[2]);
	}

}
