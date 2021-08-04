package tarea17.refuerzo.vectores;

public class MainRefuerzo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//1. Declara un vector X(8)
    int X[] = new int[8];
    
    //2. Declarar un vector Y(3) de tipo char y asignar a la posici�n 2 el valor de A
    char Y[] = new char[3];
    Y[2] = 'A';
    
    //3. Declarar un vector A(5) asignar a la posici�n 0 el valor 25, 
    //posici�n 3 el valor 49 y a la posici�n 2 el valor de la posici�n 0
    int A[] = new int[5];
    A[0]=25;
    A[3]=49;
    A[2]=25;
    
    //4. Declarar un vector B(10), a la posici�n B[0] asignele el valor del vector A[3] del ejercicio anterior
    int B[] = new int[10];
    B[0]=49;
    
    //5. Declara un vector Z(12) y asignar a todas sus posiciones valores que inician desde 1 y son secuenciales
    int Z[] = new int[12];
    Z[0]=1;
    Z[1]=2;
    Z[2]=3;
    Z[3]=4;
    Z[4]=5;
    Z[5]=6;
    Z[6]=7;
    Z[7]=8;
    Z[8]=9;
    Z[9]=10;
    Z[10]=11;
    Z[11]=12;
    
    //6. Declara un vector Y(10) y asignar a todas sus posiciones valores impares que inician desde 1 y son secuenciales
    int Y1[] = new int[10];
    Y1[0]=1;
    Y1[1]=3;
    Y1[2]=5;
    Y1[3]=7;
    Y1[4]=9;
    Y1[5]=11;
    Y1[6]=13;
    Y1[7]=15;
    Y1[8]=17;
    Y1[9]=19;
    
    //7. Declara un vector H(10) y asignar solo a las posiciones impares letras que inician desde la A secuencialmente
    char H[] = new char[10];
    H[1]='A';
    H[3]='B';
    H[5]='C';
    H[7]='D';
    H[9]='E';
    
    //8. Declarar un vector F(10) y en base al ejercicio anterior asignar los valores de la siguiente manera:
    //F[0]=H[3]
    //F[3]=H[2]
    //F[4]=H[6]
    //F[7]=H[0]
    //F[8]=H[1]
    //F[9]=H[9]
    char F[] = new char[10];
    F[0]= 'N'; //no hay asignaciones en esta posicion en el ejercicio anterior 
    F[3]='B';
    F[4]= 'N'; //no hay asignaciones en esta posicion en el ejercicio anterior 
    F[7]='D';
    F[8]= 'N'; //no hay asignaciones en esta posicion en el ejercicio anterior 
    F[9]='E';
    
    //9. Declara un vector L(15) y asignar valores en base a los siguiente:
    //L[0]= (promedio de 3,5,7 y 9)
    //L[4]= (la suma de 5, 7, 8 y 15)
    //L[7]= (la multiplicaci�n de 6, 7 y 3)
    //L[10]= (la divisi�n de 10/2)
    int L[] = new int[15];
    L[0] = 6;
    L[4] = 35;
    L[7] = 126;
    L[10] = 5;
    
    //10. Declarar un vector N(12) y realizar las siguientes asignaciones:
    //N[0]= (promedio de 3,10 y 9)
    //N[4]= (la suma de 7, 8 y 10)
    //N[12]= (la multiplicaci�n de 5, 7 y 3)
    //N[20]= (la suma de 7, -3 y 8)
    //en la �ltima posici�n el valor de 20/4
    double N[] = new double[12];
    N[0]= 7.3;
    N[4]= 25;
    N[12]= 105; //Esto dara error ya que la posicion puesta no existe 
    N[20]= 12; //Esto dara error ya que la posicion puesta no existe 
    N[11]= 5;
	}

}
