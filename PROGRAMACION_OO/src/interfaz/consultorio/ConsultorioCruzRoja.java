package interfaz.consultorio;

public class ConsultorioCruzRoja implements ConsultorioInterfaz{

	
	public void solicitarChequeo() {
		System.out.println("El paciente solicita y agenda un chequeo medico");
		System.out.println("Se le confirma el chequeo y se le da una fecha que se agenda");
	}

	public void darTurno() {
		System.out.println("Se le dara un turno al paciente para su chequeo en el dia agendado");
		System.out.println("El paciente esperara su turno");
	}

	public void chequearPaciente() {
		System.out.println("Se pedira sus datos al paciente");
		System.out.println("Se le atendera y chequeara");
	}

	public void darDiagnostico() {
		System.out.println("El medico dara un diagnostico");
		System.out.println("Se le dara consejo o medicacion segun su diagnostico");
	}

	public void darFactura() {
		System.out.println("Se verificara los costos del chequeo segun el paciente");
		System.out.println("Se dara una factura de los costos a pagar");
	}	
}
