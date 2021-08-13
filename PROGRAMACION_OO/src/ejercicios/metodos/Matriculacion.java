package ejercicios.metodos;

public class Matriculacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Impresora impresion1 = new Impresora();
    int numeroImpresion = impresion1.imprimir("Matriculasion exitosa #123456" , 12);
    System.out.println("Se imprimira la matricula con numero de impresion: " + numeroImpresion);
	}

}
