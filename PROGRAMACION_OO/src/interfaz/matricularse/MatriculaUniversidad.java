package interfaz.matricularse;

public class MatriculaUniversidad {

	public void solicitarDatos() {
		System.out.println("Se le pide al ususario que ingrese sus datos estudiantiles");
		System.out.println("Se confirmara los datos del estudiante");
	}

	public void VerificarNotas() {
		System.out.println("Se procedera a verificar sus notas");
		System.out.println("Se verificara si el estudiante tiene beca o no");
		System.out.println("Se le dira al usuario en que materias podra matricularse y cuales no");
	}

	public void darCostos() {
		System.out.println("Se le dara el costo de las materias que puede estudiar");
		System.out.println("");
	}

	public void solicitarPago() {
		System.out.println("Se solicitara el pago de las materias para poder estudiarlas");
		
	}

	public void darRecibo() {
		System.out.println("Luego se le dara un recibo de lo que se acaba de pagar");
		
	}
}
